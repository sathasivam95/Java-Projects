package switchexercise;

import java.util.Scanner;

/*
    a,e,i,o,u --> Vowels
    Rest of the alphabets are consonants
* */
public class VowelOrConsonant {

    public static void main(String[] args) {

        char alphabet;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        alphabet = sc.next().charAt(0);

        switch (alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The alphabet you entered is a vowel");
                break;
            default:
                System.out.println("The alphabet you entered is a consonant");
        }

    }

}
