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
        /*
        int a,h;
        int area;
        System.out.println("Enter first side : ");
        a = input.nextInt();
        System.out.println("Enter height : ");
        h = input.nextInt();

        area = (a * h) / 2;

        System.out.println("Area of triangle is : " + area);
        */

        //Java program to find average of an int Array
        /*
        int n = input.nextInt();
        int sum = 0;
        int avrg = 0;
        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
          arr[i] = input.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        avrg = sum/n;
        System.out.println(avrg);

        */

        //Create a Java program to sort an Array of numeric data

        int n = input.nextInt();
        int arr[] = new int[n];
        int holder;

        for(int i = 0; i< arr.length;i++){
            arr[i] = input.nextInt();
        }

        //to Sort
        for(int i = 0; i< arr.length; i++){
            for(int a = i+1; a<arr.length; a++){
                if(arr[i]>arr[a]) {
                    holder = arr[i];
                    arr[i] = arr[a];
                    arr[a] = holder;
                }
            }
        }



        System.out.println("Sorted list in ascending");
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }








    }
}
