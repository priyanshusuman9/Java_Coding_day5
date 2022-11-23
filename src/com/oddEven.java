package com.bridgelabz;


import java.util.Scanner;
public class oddEven {




        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a value ");
            int i = scan.nextInt();

            if (i % 2 == 0) {
                System.out.println("This is Even Number");
            } else {
                System.out.println("This is Odd Number");
            }

        }
    }
