/*
    Algorithm

    START
        Accept first double number from user as dNumOne
        Accept second double number from user as dNumTwo
        Create object of Logic class and pass inputs to constructor
        Call Division method of Logic class
        Handle validation for division by zero
        Display the result or an error message
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
//  Description : Contains arithmetic logic for double division
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    public double dNum1 = 0.0;
    public double dNum2 = 0.0;

    Logic(double dNo1, double dNo2)
    {
        this.dNum1 = dNo1;
        this.dNum2 = dNo2;
    }

    public double Division()
    {
        if(dNum2 == 0.0)
        {
            return -1.0;                    // Business Logic: Error code for division by zero
        }
        else if(dNum1 == 0.0)
        {
            return 0.0;                     // Business Logic: Zero divided by any number
        }
        else
        {
            double dAns = 0.0;
            dAns = dNum1 / dNum2;           // Business Logic: Division
            return dAns;
        }
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_18
//  Description : Entry point class to handle double division
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_18
{
    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {

        double dNumOne = 0.0, dNumTwo = 0.0, dRetVal = 0.0;

        Scanner sobj = new Scanner(System.in);      // Resource allocation

        System.out.println("Enter the first number :\t");
        dNumOne = sobj.nextDouble();

        System.out.println("Enter the second number :\t");
        dNumTwo = sobj.nextDouble();

        Logic lobj = new Logic(dNumOne, dNumTwo);   // Object creation

        dRetVal = lobj.Division();                  // Method call

        if(dRetVal == -1.0)
        {
            System.out.println("The division by zero denominator is undefined.\n");
        }
        else
        {
            System.out.println("The division of "+dNumOne+" and "+dNumTwo+" is : "+dRetVal+".");
        }

        lobj = null;
        sobj.close();                               // Closing resource

    } // End of main

} // End of Program_18

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 10.0        Input2 : 2.0         Output : 5.0
//  Input1 : 7.5         Input2 : 0.0         Output : undefined
//  Input1 : 0.0         Input2 : 5.0         Output : 0.0
//
/////////////////////////////////////////////////////////////////