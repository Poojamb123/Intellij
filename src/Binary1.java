import java.util.Scanner;
public class Binary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("please enter array index" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a key to search");
        int k = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (k == arr[mid]) {
                System.out.println("key found");
                return;
            } else if (k > arr[mid]) {
                low = mid + 1;
            } else if (k < arr[mid]) {
                high = mid - 1;

            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("key not found");
        }
    }
}
