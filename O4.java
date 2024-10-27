package Array;

//Set matrix zero

import java.util.Arrays;

public class O4 {
    public static void Matrix(int arr[][]){
        int arr1[][]=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               arr1[i][j]=arr[i][j];
            }
        }

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                if(arr1[i][j]==0){
                    for(int l=0;l<arr.length;l++){
                        arr[l][j]=0;
                    }
                    for(int l=0;l<arr[i].length;l++){
                        arr[i][l]=0;
                    }
                }
            }

            int a=Integer.MAX_VALUE;


        }
        System.out.println("hello");
        for(int z=0;z<arr.length;z++){
            System.out.println(Arrays.toString(arr[z]));
        }

    }

    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int arr2[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        Matrix(arr);

    }
}
