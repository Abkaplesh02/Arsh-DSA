package Array;

import java.util.Arrays;

//Remove duplicates from sorted array
public class O3 {

    public static void Duplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
    }
    public static void  Duplicates(int arr[]){
        int arr1[]=new int[arr.length];
        int prev=Integer.MAX_VALUE;
        int curr=Integer.MIN_VALUE;
        int j=0;

        for(int i=0;i<arr.length;i++){
            curr=arr[i];
            if(curr!=prev){
                arr1[j]=arr[i];
                prev=arr1[j++];
            }
        }

        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
    }

    public static void main(String[] args) {

        int arr[]={0,0,1,1,1,2,2,3,3,4};
        Duplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
