import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number of rows");
        int row=scan.nextInt();
        System.out.println("please enter number of column");
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("please enter arr for row " + i + " column " +j);
                arr[i][j]=scan.nextInt();

            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || i==(row-1) || j==0 || j==(col-1)){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                if(i==j){
                    System.out.println(j);
                }else{
                    System.out.println("  ");
                }
            }
        }

    }
}
