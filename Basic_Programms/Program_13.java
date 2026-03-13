/*
    Algorithm

    START
        Accept first double number from user as dNumOne
        Accept second double number from user as dNumTwo
        Create object of Logic class and pass inputs to constructor
        Call Substraction method of Logic class
        Display the result of subtraction
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
//  Description : Contains arithmetic logic for double subtraction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    
    public double dNo1 = 0.0;
    public double dNo2 = 0.0;

    Logic(double dNum, double dNum2)
    {
        this.dNo1 = dNum;
        this.dNo2 = dNum2;
    }

    public double Substraction()
    {
        double dAns = 0.0;

        dAns = dNo1 - dNo2;                 // Business Logic: Subtraction

        return dAns;
    }

}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_13
//  Description : Entry point class to handle double subtraction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_13
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        double dNumOne = 0.0;
        double dNumTwo = 0.0;
        double dRetVal = 0.0;

        Scanner sobj = new Scanner(System.in);      // Resource allocation

        System.out.println("Enter the first number(double) : ");
        dNumOne = sobj.nextDouble();

        System.out.println("Enter the second number(double) : ");
        dNumTwo = sobj.nextDouble();

        Logic lobj = new Logic(dNumOne, dNumTwo);   // Object creation

        dRetVal = lobj.Substraction();              // Method call

        System.out.println("The substraction of "+dNumOne+" and "+dNumTwo+" is : "+dRetVal+".");

        lobj = null;
        sobj.close();                               // Closing resource

    } // End of main

} // End of Program_13

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 100.50      Input2 : 25.25      Output : 75.25
//  Input1 : 10.0        Input2 : 50.5       Output : -40.5
//
/////////////////////////////////////////////////////////////////