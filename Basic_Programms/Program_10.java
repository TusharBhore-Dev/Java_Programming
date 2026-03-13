/*
    Algorithm

    START
        Accept first double number from user as dNumOne
        Accept second double number from user as dNumTwo
        Create object of Logic class and pass inputs to constructor
        Call Addition method of Logic class
        Display the result of addition
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
//  Description : Contains arithmetic logic for double addition
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

    public double Addition()
    {
        double dAns = 0.0;

        dAns = dNo1 + dNo2;                 // Business Logic: Addition

        return dAns;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_10
//  Description : Entry point class to handle double user interaction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_10
{
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

        dRetVal = lobj.Addition();                  //  Method call

        System.out.println("The addition of "+dNumOne+" and "+dNumTwo+" is : "+dRetVal+".");

        lobj = null;
        sobj.close();                               // Closing resource

    } // End of main
    
} // End of Program_10

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 12.5       Input2 : 10.2       Output : 22.7
//  Input1 : -5.5       Input2 : 2.0        Output : -3.5
//
/////////////////////////////////////////////////////////////////