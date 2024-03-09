
// check a number is a palindrome

import java.util.*;

public class practice08 {

    public static void ispalindrome(int num){
        int palindrome = num;
        int reverce = 0;
        while(num!=0){
            int rem = num % 10;
            reverce = reverce * 10 + rem ;
            num = num /10;
        }

        // if original and the reverse of number is equal means number is palindrome

        if(palindrome == reverce){
            System.out.println("number " + palindrome + " is palindrome number");
        }
        else{
            System.out.println("number " + palindrome + " is not a palindrome number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int palindrome = sc.nextInt();
        ispalindrome(palindrome);
    }
}