import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number of rows:");
        int row=scan.nextInt();
        System.out.println("please enter number of columns");
        int col= scan.nextInt();
        int[][]a=new int[row][col];
        int[][]b=new int[row][col];
        int[][]c=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                System.out.println("please enter elements for array a index:" + i +j);
                a[i] [j]= scan.nextInt();
                System.out.println("please enter elements for array b index:" + i +j);
                b[i][j] = scan.nextInt();
            }

        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+ " ");
            }
        }
    }

}
