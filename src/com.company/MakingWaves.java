package com.company;

public class MakingWaves {
    public static void main(String[] args) {
        Operation whiteWash = new Operation();

        System.out.println(Operation.add(a:40,b:70));
        System.out.println(whiteWash.multiply(a:37,b:9));
        System.out.println(
                Operation.subtract(
                        Operation.add(a:40,b:70),
                        whiteWash.divide(a:45,b:9789)
                ));
        System.out.println(whiteWash.divide(a:30, b:750));
        System.out.println(whiteWash.multadd(a:10,b:7,c:3));
        System.out.println(whiteWash.message(a:"Ramone"));
    }
}
