public class T2SumDigits {
    public static void main(String[] args) {
        int number = 561;
        int sum = 0;

        // extract each digit and add it to the sum
        int digit1 = number / 100;
        sum += digit1;
        number %= 100;
        int digit2 = number / 10;
        sum += digit2;
        number %= 10;
        int digit3 = number;
        sum += digit3;

        // output the result
        System.out.println("The sum of the digits in " + 561 + " is " + sum);
    }
}
/*
T2SumDigits [variables, arithmetic & shorthand operators]

    Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12

 */