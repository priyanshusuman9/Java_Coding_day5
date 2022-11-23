package com.bridgelabz;
import java.util.Scanner;
public class largestAmongThree {

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter First N Number ");
            int j = scan.nextInt();
            System.out.println("Enter Second N Number ");
            int k = scan.nextInt();
            System.out.println("Enter Third N Number ");
            int l = scan.nextInt();

            if(j>k && j>l){
                System.out.println(j + " : is greater");
            }
            else if (k>j && k>l){
                System.out.println(k + " : is Greater");
            }
            else {
                System.out.println(l  +" : is greater");
            }

        }
    }

