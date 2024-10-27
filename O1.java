package Array;
//Find duplicate in array
public class O1 {
    public static int Duplicate(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return arr[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};

        System.out.println(Duplicate(arr));
    }
}
