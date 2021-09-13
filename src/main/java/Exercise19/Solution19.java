/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise19;

import java.util.Scanner;

public class Solution19
{
    public static void main( String[] args )
    {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your height in inches: ");
        double height = scan.nextDouble();

        System.out.println("Enter your weight in pounds: ");
        double weight = scan.nextDouble();

        double BMI = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.2f \n", BMI);


        if(BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI > 25)
        {
            System.out.println("You are overweight, You should see your doctor.");
        }
        else if(BMI < 18.5)
        {
            System.out.println("You are underweight, You should consult with your doctor.");
        }
    }
}
