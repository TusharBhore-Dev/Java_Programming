/*
    Algorithm

    START
        Accept first float number from user as fNumOne
        Accept second float number from user as fNumTwo
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
//  Description : Contains arithmetic logic for float subtraction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    public float fNo1 = 0.0f;
    public float fNo2 = 0.0f;

    Logic(float fNum, float fNum2)
    {
        this.fNo1 = fNum;
        this.fNo2 = fNum2;
    }

    public float Substraction()
    {
        float fAns = 0.0f;

        fAns = fNo1 - fNo2;                 // Business Logic: Subtraction

        return fAns;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_12
//  Description : Entry point class to handle float subtraction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_12
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        float fNumOne = 0.0f;
        float fNumTwo = 0.0f;
        float fRetVal = 0.0f;

        Scanner sobj = new Scanner(System.in);      //  Resource allocation

        System.out.println("Enter the first number(float) : ");
        fNumOne = sobj.nextFloat();

        System.out.println("Enter the second number(float) : ");
        fNumTwo = sobj.nextFloat();

        Logic lobj = new Logic(fNumOne, fNumTwo);   //  Object creation

        fRetVal = lobj.Substraction();              //  Method call

        System.out.println("The substraction of "+fNumOne+" and "+fNumTwo+" is : "+fRetVal+".");

        lobj = null;
        sobj.close();                               //  Closing resource

    } // End of main

} // End of Program_12

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 50.5        Input2 : 20.2        Output : 30.3
//  Input1 : 10.0        Input2 : 15.5        Output : -5.5
//
/////////////////////////////////////////////////////////////////