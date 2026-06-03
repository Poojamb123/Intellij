public class Calculator {


    public void add()
    {
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("sum=" +sum);
    }
    public void sub(int a, int b)
    {
        double c=a-b;
        System.out.println("c=" +c);
    }
    public  int mul()
    {
        int a=5;
        int b=6;
        int g=a*b;
        return g;
    }
    public double div(int a, int b)
    {

        double q=a/(double)b;
        return q;
    }


}
