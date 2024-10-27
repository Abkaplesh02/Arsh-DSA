package Array;
//Move Zeroes

import java.util.Arrays;

public class O5 {

    public static void Zeros(int arr[]){
        int start=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;
                start++;
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={0,1,0,2,12};
        Zeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
