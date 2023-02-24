package week03.Morning;

import java.util.*;

public class T4CharCase {
    public static void main(String[] args) {

        char letter = 'A';

        String uppercase_or_lowercase;

        if (letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is lowercase");
        }
        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is uppercase");
        }
        System.out.println("----------------------------");

        char charLetter = '*';
        boolean isUpper = charLetter >= 'A' && charLetter <= 'Z';
        boolean isLower = charLetter >= 'a' && charLetter <= 'z';
        String result = charLetter + " is ";

        if(isUpper){
            result += "uppercase"; //result = result + "uppercase"
            // result = letter + " is uppercase";
        }

        if(isLower){
            result += "lowercase";
        }

        // !true -> false
        if(!isUpper && !isLower){   //!false && !false -> true && true -> true
            // this is for when the character is not a letter
            result += "not a valid letter";
        }

//        if(isUpper || isLower){
//            System.out.println(result);
//        } else {
//            System.out.println(charLetter + " is not a valid letter");
//        }

        System.out.println(result);

    }
}
/*
week03.Morning.T4CharCase [variables, if statement, relational operator]

    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is

    Output in this format:
        $character is $uppercase_or_lowercase
 */