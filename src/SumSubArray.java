import java.util.Scanner;

public class SumSubArray {
    public static int sumSubAray(int arr[]){
int sum=0;
for(int i=0;i<arr.length;i++){
    for(int j=i;j<arr.length;j++){
        for(int k=i;k<=j;k++){
            sum=sum+arr[k];
        }
    }
}
return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int val=sumSubAray(arr);
        System.out.println("The value is : "+val);
    }
}