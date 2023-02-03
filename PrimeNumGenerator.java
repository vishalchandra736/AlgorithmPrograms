package com.blz.dsa;

public class PrimeNumGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Numbers Program!");
        System.out.println("Generating Prime numbers between 0 and 1000 :\n");
        PrimeNumGenerator call = new PrimeNumGenerator();
        call.generatePrime(0, 1000);
    }

    public void generatePrime(int low, int high) {
        for (int counter = 2; counter <= high; counter++) {
            int flag = 0;
            for (int factor = 2; factor < counter; factor++) {
                if(counter % factor == 0)
                    flag++;
            }
            if (flag == 0)
                System.out.println(counter);
        }
    }
}
