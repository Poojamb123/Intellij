import java.util.Scanner;
public class BinaryApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int size =scan.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("please enter the elements of index:"+i);
             arr[i]=scan.nextInt();
        }
        System.out.println("please enter a key to search:");
        int key=scan.nextInt();
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        while (low <= high) {
            if(key==arr[mid]){
                System.out.println("key found");
                return;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        System.out.println("key not found");
    }
}
