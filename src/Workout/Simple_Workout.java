package Workout;

import java.util.Scanner;

public class Simple_Workout {
    public static void main(String[] args) {
        //System.out.println("Hi");
        //Java program to check whether the given number is even or odd
        Scanner input = new Scanner(System.in);

        /* System.out.println("Enter a number: ");

        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }
         */

        //Java program to find the area of a triangle whose three sides are given

        int a,h;
        int area;
        System.out.println("Enter first side : ");
        a = input.nextInt();
        System.out.println("Enter height : ");
        h = input.nextInt();

        area = (a * h) / 2;

        System.out.println("Area of triangle is : " + area);

    }
}
