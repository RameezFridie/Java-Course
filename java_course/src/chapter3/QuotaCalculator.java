package chapter3;

import java.util.Scanner;

/*
if-else
* All sales people are expected to make at lease 10 sales per week
* For those who do, they receive a congratulatory message
* For those who don't, they receive a how many sales were short message
 */
public class QuotaCalculator {

    public static void main(String[] args){

        // Initialize known values
        int quota = 10;

        // Get unknown
        System.out.println("Enter the number of sales you made this week.");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // Make a path
        if(sales >= quota){
            System.out.println("Congrats you have reached your quota for the week!!");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
