package com.LogicMojo.Arrays;

public class TwoThreads {


    public static final int MAX_NUMBER = 100;

    private static final Object lock = new Object();

    private static int counter =1;

    public static void main(String[] args) {
        Thread oddThread = new Thread(new PrintTask("OddThread",true));
        Thread evenThread = new Thread(new PrintTask("EvenThread",false));
        oddThread.start();
        evenThread.start();

    }

    public static class PrintTask implements Runnable{

        private final String ThreadName;
        private final boolean oddThread;

        public PrintTask(String threadName, boolean oddThread) {
            ThreadName = threadName;
            this.oddThread = oddThread;
        }

        @Override
        public void run() {
            while(counter <=MAX_NUMBER){
                synchronized (lock){
                    if((oddThread && counter %2 != 0) ||
                    (!oddThread && counter%2==0)){
                        System.out.println(ThreadName+" "+counter);
                        counter++;
                        lock.notify();
                    }else{
                        try{
                            lock.wait();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
