package Array;

//Best time to buy and sell stocks Part 2
public class O9 {
    public static int Stocks(int arr[]){
       int max=0;

       for(int i=1;i<arr.length;i++){
           if(arr[i]>arr[i-1]){
               max+=arr[i]-arr[i-1];
           }
       }
       return max;
            }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};

        System.out.println(Stocks(arr));
    }
}
