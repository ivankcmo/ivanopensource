package com.company;

public class Operation {
    // This is the operation class used to perform various operations

    // add method helps us to add numbers;
    //a= = first number ; b second number

    //add method helps us to add numbers;
    public static int add(int a, int b) { return a + b; }
        //subtract method
    public static int subtract(int a, int b) { return a - b; }
        //divide method
    public double divide(int a, int b) { return a/b; }
        //multiply method
    public int multiply(int a , int b ) { return a*b; }

    public int multadd(int a , int b , int c){
        int sum = a + b ;
        return sum * c;
    }
    public String message(String a){
        String mesg = "what ever you want to say to the person using java";
                return a + mesg ;
    }
    //increment ++
    public int increment(int a) { return a++; }
        //decrement --
    public int decremen(int a) { return a--; }
        //modulus
    public int modulus(int a, int b ){
        return a%b;
    }






}
