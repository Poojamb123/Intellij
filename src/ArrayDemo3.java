public class ArrayDemo3 {
    public static void main(String[] args) {
        String[][][]names=new String[2][2][3];
        names[0][0][0]="Pooja";
        names[0][0][1]="Nikhil";
        names[0][0][2]="Deepak";
        names[0][1][0]="Kalavati";
        names[0][1][1]="Basavaraj";
        names[0][1][2]="Shashikala";
        names[1][0][0]="Umesh";
        names[1][0][1]="Ashwini";
        names[1][0][2]="Ruchita";
        names[1][1][0]="Priya";
        names[1][1][1]="Divya";
        names[1][1][2]="Shetty";
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++){
                for(int k=0;k<names[i][j].length;k++){
                    System.out.print(names[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
