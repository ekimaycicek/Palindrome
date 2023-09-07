import java.util.Scanner;

public class Palindrome {
    /*
       Crteate a program checks if a String is PALINDROME or not.
       If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
       For Example : "madam" or "nursesrun" .
       Kulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
       polindrome :tersten okunuşu da aynı olan ifadeierdir.
       ornek : Ey edip Adanada pide ye,  Traş niçin şart
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String enter an expression : ");
        String expression = scan.nextLine();

       palindomeWithStringBuilder(expression);
       palindromeWithForLoop(expression);

    }

     private static void palindromeWithForLoop(String str) {
        String reverseExpression = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseExpression += str.charAt(i);
        }
        System.out.println("reverse expression = " + reverseExpression);
        if(reverseExpression.equalsIgnoreCase(str)){
            System.out.print("the entered expression is palindom -> " + reverseExpression);
        }else System.out.print("the entered expression is not a palindrome ->" +reverseExpression);
    }


    private static void palindomeWithStringBuilder(String ss) {

        StringBuilder sb = new StringBuilder(ss);
        String reverseExpression = sb.reverse().toString();
        if(reverseExpression.equalsIgnoreCase(ss)){
            System.out.println("the entered expression is palindom -> " + reverseExpression);
        }else System.out.println("the entered expression is not a palindrome ->" + reverseExpression);
    }

}

