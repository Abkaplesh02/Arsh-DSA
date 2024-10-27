package Array;

import java.util.Arrays;

//Two sum
public class O8 {

    public static int[] TwoSum(int arr[], int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        System.out.println(Arrays.toString(TwoSum(arr,9)));
    }
}
