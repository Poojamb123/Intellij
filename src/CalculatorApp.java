public class CalculatorApp {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.add();
        c1.sub(23, 5);
        double p=c1.mul();
        System.out.println(" product=" +p);
        double div=c1.div(23,5);
        System.out.println("division=" +div);

    }
}
