package src;

import java.util.Scanner;

public class TrajectoryCalculatorRunner 
{
    public static void main(String args[]) 
    {
        System.out.println("Hello World");
        Scanner reader = new Scanner(System.in);
        System.out.print("What's your name?             ");
        String nameAnswer = reader.nextLine();
        System.out.print("What's your favorite color?   ");
        String colorAnswer = reader.nextLine();
        System.out.println("Hello, " + nameAnswer + ", your favorite color is " + colorAnswer);
        reader.close();   
    }
}