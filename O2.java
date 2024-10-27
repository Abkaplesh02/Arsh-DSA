package Array;

import java.util.Arrays;

//Sort 0 1 2
public class O2 {
    public static void Sort(int arr[]){
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<=end;){
            if(arr[i]==2){
                arr[i]=arr[end];
                arr[end]=2;
                end--;
            }
            else if(arr[i]==0){
                arr[i]=arr[start];
                arr[start]=0;
                start++;
                i++;
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
