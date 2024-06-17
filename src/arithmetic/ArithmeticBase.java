/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 public double x,y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        
        public enum SIGN
        {
            PLUS,
            MINUS,
            TIMES,
            DIVIDES
        }
        switch (s.toUpperCase()) 
        {
            case SIGN.PLUS:
                return x + y;
            case SIGN.MINUS:
                return x - y;
            case SIGN.TIMES:
                return x * y;
            case SIGN.DIVIDES:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
