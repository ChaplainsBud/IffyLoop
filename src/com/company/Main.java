package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String word;
      boolean redEyes;

       int i = 0;
        while (i < 5) {
            System.out.println("Are your eyes red?");
            word = sc.nextLine();

            if(word.equals("yes")) {
                redEyes = true;
            } else {
                redEyes = false;
            }

            if(redEyes = true) {
                System.out.println("Get some sleep!");
            }  else {
                System.out.println("You look great!");
            }
            i++;
        }


    }
}