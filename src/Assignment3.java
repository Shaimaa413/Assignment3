import java.util.Scanner;

public class Assignment2
{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
      System .out .print("Enter a sentence ");
       String sentence= input .nextLine();

       String uppercase = sentence.toUpperCase();
       int length = sentence.length();
       char first = sentence.charAt(0);

       System.out.println("Upper Case: " + uppercase);
       System.out.println("Length: " + length);
       System.out.println("First Character: " + first);


    }
}
