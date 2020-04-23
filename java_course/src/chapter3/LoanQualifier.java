package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least R30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String[] args){
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        //Get what we don't know
        System.out.println("Enter your salary.");
        Scanner scanner = new Scanner(System.in);
        double employeeSalary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer.");
        double yearsWorked = scanner.nextDouble();
        scanner.close();

;
        //Make decision
        if (employeeSalary >=requiredSalary){
            if (yearsWorked >= requiredYearsEmployed){
                System.out.println("Congrats!! you qualify for the loan.");
            }
            else{
                System.out.println("Sorry you must have worked at your current job for at lease " + requiredYearsEmployed + " years.");
            }
        }
        else {
            System.out.println("Sorry you must earn at least R" + requiredSalary + " a month to qualify for a loan.");
        }

    }
}
