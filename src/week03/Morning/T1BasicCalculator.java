package week03.Morning;

public class T1BasicCalculator {
    public static void main(String[] args) {

        int num1 = 10, num2 = 5;

        double output = num1 + num2;
        System.out.println(num1+ " + " +num2+ " = " + output);

        output = num1 - num2;
        System.out.println(num1+ " - " +num2+ " = " + output);

        output = num1 * num2;
        System.out.println(num1+ " * " +num2+ " = " + output);

        output = num1 / num2;
        System.out.println(num1+ " / " +num2+ " = " + output);

        output = num1 % num2;
        System.out.println(num1+ " % " +num2+ " = " + output);
    }
}
/*
week03.Morning.T1BasicCalculator [variables, operators, concatenation]

    Create a program that will define two double variables. Take the two numbers are perform all the mathematical operations on them ( + - * / % )
    Output in this format:
        num1 operator num2 = result

    Ex:
        num1 = 5
        num2 = 2

        output:
        5 + 2 = 7
        5 - 2 = 3
 */