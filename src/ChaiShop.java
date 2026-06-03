public class ChaiShop {
    public static void serveChai() {
        System.out.println("total bill=INR 10");
    }

    public static void serveChai(int cups, String TeaType)
    {
      int total=cups*50;
        System.out.println("total bill=INR" +total);
    }

    public static void serveChai(int cups)
    {
       int total=cups*10;
        System.out.println("total bill=INR" +total);
    }

    public static void serveChai(String TeaType)
    {
        System.out.println("total bill=INR 50");
    }
}
