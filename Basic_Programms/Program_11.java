/*
    Algorithm

    START
        Accept first number from user as iNumOne
        Accept second number from user as iNumTwo
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
//  Description : Contains arithmetic logic for subtraction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    public int iNo1 = 0;
    public int iNo2 = 0;

    Logic(int iNum, int iNum2)
    {
        this.iNo1 = iNum;
        this.iNo2 = iNum2;
    }

    public int Substraction()
    {
        int iAns = 0;

        iAns = iNo1 - iNo2;                 // Business Logic: Subtraction

        return iAns;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_11
//  Description : Entry point class to handle integer subtraction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_11
{
    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNumOne = 0;
        int iNumTwo = 0;
        int iRetVal = 0;

        Scanner sobj = new Scanner(System.in);      // Important statement: Resource allocation

        System.out.println("Enter the first number : ");
        iNumOne = sobj.nextInt();

        System.out.println("Enter the second number : ");
        iNumTwo = sobj.nextInt();

        Logic lobj = new Logic(iNumOne, iNumTwo);   // Important statement: Object creation

        iRetVal = lobj.Substraction();              // Important statement: Method call

        System.out.println("The substraction of "+iNumOne+" and "+iNumTwo+" is : "+iRetVal+".");

        lobj = null;
        sobj.close();                               // Important statement: Closing resource

    } // End of main

} // End of Program_11

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 20          Input2 : 10          Output : 10
//  Input1 : 10          Input2 : 20          Output : -10
//
/////////////////////////////////////////////////////////////////