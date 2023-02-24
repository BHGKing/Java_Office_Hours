package week03.Morning;

public class T3AnalyzeCode {
    public static void main(String[] args) {

        int a = 8;
        int b = a--;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("----------------------------");


        float speed = 20.5F;

        byte num1 = (byte)speed;
        short num2 = (short)speed;
        int num3 = (int)speed;
        long num4 = (long)speed;
        float num5 = speed;
        double num6 = speed;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
    }
}
/*
week03.Morning.T3AnalyzeCode [unary operators, casting]

    - take a look at this given code and evaluate what the result is for each

    1)
        int a = 8;
        int b = a--;

        what is a?
        what is b?

    2) Take the given speed variable and think about which lines would need explicit casting(manually) and which ones are done implicitly(automatically)

        float speed = 20.5f;

        byte num1 = speed;
        short num2 = speed;
        int num3 = speed;
        long num4 = speed;
        float num5 = speed;
        double num6 = speed;
 */