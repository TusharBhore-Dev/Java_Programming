/*
    Algorithm

    START
        Accept first double number from user as dNum1
        Accept second double number from user as dNum2
        Create object of Logic class and pass inputs to constructor
        Call multiplication method of Logic class
        Display the result of multiplication
        Clean up resources
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Classes / Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Logic
//  Description : Contains arithmetic logic for double multiplication
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    double dNum1 = 0.0, dNum2 = 0.0;

    Logic(double dNo1, double dNo2)
    {
        this.dNum1 = dNo1;
        this.dNum2 = dNo2;
    }

    public double multiplication()
    {
        double dAns = 0.0;

        dAns = dNum1 * dNum2;               // Business Logic: Multiplication
        
        return dAns;
    }
    
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_16
//  Description : Entry point class to handle double multiplication
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_16
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {

        double dNum1 = 0.0, dNum2 = 0.0, dAns = 0.0;

        Scanner sobj = new Scanner(System.in);      // Resource allocation

        System.out.println("Enter the first number :\t");
        dNum1 = sobj.nextDouble();

        System.out.println("Enter the second number :\t");
        dNum2 = sobj.nextDouble();

        Logic lobj = new Logic(dNum1, dNum2);       // Object creation

        dAns = lobj.multiplication();               // Method call

        System.out.println("The multiplication of "+dNum1+" and "+dNum2+" is : "+dAns+".");

        lobj = null;
        sobj.close();                               // Closing resource

    } // End of main

} // End of Program_16

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 10.5        Input2 : 2.0         Output : 21.0
//  Input1 : 0.0         Input2 : 55.5        Output : 0.0
//
/////////////////////////////////////////////////////////////////