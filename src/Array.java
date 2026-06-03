import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int[][] m=new int[3][];
     m[0]=new int[3];
     m[1]=new int[4];
     m[2]=new int[2];
     for(int i=0;i<m.length;i++){
         for(int j=0;j<m[i].length;j++){
             System.out.println("please enter the marks for rows" + i + "column" +j);
             m[i][j]=scan.nextInt();
         }
     }
     for(int i=0;i<m.length;i++){
         for(int j=0;j<m[i].length;j++){
             System.out.print(m[i][j]+ " ");
         }
         System.out.println();
     }
    }
}
