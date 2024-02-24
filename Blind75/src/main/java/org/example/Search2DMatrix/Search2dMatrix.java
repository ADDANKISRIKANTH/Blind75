package org.example.Search2DMatrix;

public class Search2dMatrix {

    public static boolean getSearchMatrixValue(int[][] arr,int target){
        int row = arr.length;
        int col = arr[0].length;
        boolean flag = false;
        outer:
        for(int i=0; i<row; i++){
            if(arr[i][0] <= target && arr[i][col-1] >= target){
                for(int j=0; j<col;j++){
                    if(arr[i][j] == target){
                        flag=true;
                        break outer;
                    }
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean value = getSearchMatrixValue(arr,3);
        System.out.println(value);
    }
}
