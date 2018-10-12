package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println("The sum of 1 to "+num+" is "+sum);
    }
}
