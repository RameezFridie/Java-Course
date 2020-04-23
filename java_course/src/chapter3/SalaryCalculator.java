package chapter3;

import java.util.Scanner;

/*
If Statement
All sales people get a payment of R1000 a week.
Sales people who exceed 10 sales get a bonus of R250
 */
public class SalaryCalculator {

    public static void main(String[] args){

        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        // Get values for unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for bonus
        if(sales >= quota){
           salary = salary  + bonus;

        }

        // Output
        System.out.println("The employee's pay is R" + salary);
    }
}
