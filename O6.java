package Array;
//Best time to buy and sell stock

public class O6 {

    public static int Stocks(int arr[]){
        int min=arr[0];
        int minI=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                minI=i;
            }
            max=Math.max(max,arr[i]-min);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={2,4,1};
        int arr1[]={7,1,5,3,6,4};
        System.out.println(Stocks(arr));
    }
}
