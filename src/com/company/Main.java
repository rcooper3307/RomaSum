package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum is "+Main.sumFifteen(15));
    }
    public static int sumFifteen(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        return sum;
    }
}
