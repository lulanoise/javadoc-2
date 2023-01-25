package it.develhope.javadoc;

/**
 * The Tester class to test the project.
 */

public class Tester {

    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        
        System.out.println("Doing a summation " + arithmeticOperators.sum(35,45));
        System.out.println("Doing a subtraction " + arithmeticOperators.sub(56,24));
        System.out.println("Doing a multiplication " + arithmeticOperators.mul(43,5));
        System.out.println("Doing a division " + arithmeticOperators.div(50,5));
    }

}

