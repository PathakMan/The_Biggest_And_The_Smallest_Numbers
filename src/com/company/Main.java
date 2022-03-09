package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

int CollectionSize = 10, i = 1;
int Number, min = 101, max = 0;

System.out.println("The program draws " + CollectionSize + " Integers numbers from 1 to 100.");
System.out.println("and finds the smallest and greatest of them.");

Random rand  =  new Random();
System.out.print("Drawn: ");

while (i <= CollectionSize){

    Number = Math.round((rand.nextInt(100)+1));
    System.out.print(Number + ", ");

    if(Number < min) min = Number;
    if(Number > max) max = Number;

    i++;

}

System.out.println("");
System.out.println("The largest number in the collection is: " + max);
System.out.println("The smallest number in the collection is: " + min);

    }
}
