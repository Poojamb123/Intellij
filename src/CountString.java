import java.util.Scanner;
public class CountString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter string:");
        String s=scan.nextLine();
        System.out.println("original String:" +s);
        int alpha=0, v=0, c=0, dig=0, others=0;
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp>='a' && temp<='z') {
                alpha++;

                if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
            else if (temp>='0' && temp<='9'){
                dig++;
            }
            else
            {
                others++;
            }
        }
        System.out.println("Alpha:" +alpha);
        System.out.println("Vowels:" +v);
        System.out.println("consonants" +c);
        System.out.println("digit:" +dig);
        System.out.println("others:" +others);
    }
}
