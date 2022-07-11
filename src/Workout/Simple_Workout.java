package Workout;

import java.util.Scanner;

public class Simple_Workout {
    public static void main(String[] args) {
        //System.out.println("Hi");
        //Java program to check whether the given number is even or odd
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }
    }
}
