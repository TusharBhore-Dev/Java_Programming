/*
    Algorithm

    START
        Accept first float number from user as fNumOne
        Accept second float number from user as fNumTwo
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
//  Description : Contains arithmetic logic for float addition
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

    public float Addition()
    {
        float fAns = 0.0f;

        fAns = fNo1 + fNo2;                 // Business Logic: Addition

        return fAns;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_9
//  Description : Entry point class to handle float user interaction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_9
{
    
    public static void main(String A[])
    {
        float fNumOne = 0.0f;
        float fNumTwo = 0.0f;
        float fRetVal = 0.0f;

        Scanner sobj = new Scanner(System.in);      // Important statement: Resource allocation

        System.out.println("Enter the first number(float) : ");
        fNumOne = sobj.nextFloat();

        System.out.println("Enter the second number(float) : ");
        fNumTwo = sobj.nextFloat();

        Logic lobj = new Logic(fNumOne, fNumTwo);   // Important statement: Object creation

        fRetVal = lobj.Addition();                  // Important statement: Method call

        System.out.println("The addition of "+fNumOne+" and "+fNumTwo+" is : "+fRetVal+".");

        lobj = null;
        sobj.close();                               // Important statement: Closing resource

    } // End of main

} // End of Program_9

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 15.5f      Input2 : 10.2f      Output : 25.7
//  Input1 : -5.0f      Input2 : 5.0f       Output : 0.0
//
/////////////////////////////////////////////////////////////////