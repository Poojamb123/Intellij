import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter array size");
        int size=scan.nextInt();
        int[]arr=new int[size];

        for(int j=0;j<=arr.length-2;j++)
        {
            System.out.println("please enter the elements of index;" +j);
            arr[j]=scan.nextInt();
            for(int k=0;k<=arr.length-2-j;k++){
                if(arr[k]>arr[k+1])
                {
                    int temp=arr[j];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
                System.out.println("sorted array is:" +arr[k]);
            }
        }
    }
}
