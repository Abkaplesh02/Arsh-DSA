package Array;

import java.util.Arrays;

//Choclate distribution problem
public class O7 {
    public static int Choclate(int arr[], int m){
        int j=0;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(i-j+1==m){
                int diff=arr[i]-arr[j];
                min=Math.min(min,diff);
                j++;
            }

        }
        return min;
    }

    public static void main(String[] args) {

        int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
        int arr2[]={7,3,2,4,9,12,56};

        System.out.println(Choclate(arr,5));
        System.out.println(Choclate(arr2,3));
    }
}
