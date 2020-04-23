package chapter2.chapter_2_exercise;

import java.util.Scanner;

public class MadLips {
    public static void main(String[] arg){

        //1. Ask user for season of year
        System.out.println("Please provide a season in the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask user for a number
        System.out.println("Please provide a number");
        int number = scanner.nextInt();

        //3. Ask user for an adjective
        System.out.println("Please provide an adjective");
        String adjective = scanner.next();

        //4. Display result
        System.out.println("On a " + adjective + " " + season + " day. I drink a minimum of " + number + " cups of coffee.");
    }
}
