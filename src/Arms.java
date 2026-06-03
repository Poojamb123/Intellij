import java.util.Scanner;
public class Arms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int a,rem=0,res=0,n=0;
        a=num;
        while(a!=0){
            a=a/10;
            n++;
        }
        a=num;
        while(a!=0){
            rem=a%10;
            res+=Math.pow(rem,n);
            a=a/10;

        }
        if(res==num){
            System.out.println(num+ " is armstrong");
        }else{
            System.out.println(num+ " is not armstrong");
    }
}}
