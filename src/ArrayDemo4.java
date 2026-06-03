import java.util.Scanner;
public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of blocks:");
        int block=scan.nextInt();
        System.out.println("please enter the number of rows:");
        int row=scan.nextInt();
        System.out.println("please enter the number of columns:");
        int col=scan.nextInt();
        String[][][] names=new String[block][row][col];
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++){
                for(int k=0;k<names[i][j].length;k++){
                    System.out.println("please enter name" +i+j+k);
                    String n=scan.nextLine();
                    System.out.print(names[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
