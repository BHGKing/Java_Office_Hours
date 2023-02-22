import java.util.*;

public class T4CharCase {
    public static void main(String[] args) {

        char character = 'A';

        String uppercase_or_lowercase;

        if (character >= 'a' && character <= 'z'){
            uppercase_or_lowercase = "lowercase";
        } else if (character >= 'A' && character <= 'Z') {
            uppercase_or_lowercase = "uppercase";
        }else {
            uppercase_or_lowercase = "not a letter";
        }

        System.out.println(character + " is " + uppercase_or_lowercase);
    }
}
/*
T4CharCase [variables, if statement, relational operator]

    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is

    Output in this format:
        $character is $uppercase_or_lowercase
 */