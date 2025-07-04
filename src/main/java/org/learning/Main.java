package org.learning;

public class Main {
    public static void main(String[] args) {
        printStar();

    }

    public static void printStar(){
        for(int i=1; i<=5; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        //System.out.println(" ");
    }

    public static void printNum(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}