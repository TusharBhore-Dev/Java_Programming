/*
    Algorithm

    START
        Accept first number from user as iNumOne
        Accept second number from user as iNumTwo
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
//  Description : Contains arithmetic logic for addition
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    public int iNo1 = 0;
    public int iNo2 = 0;

    Logic(int iNum, int iNum2)              // Constructor to initialize data
    {
        this.iNo1 = iNum;
        this.iNo2 = iNum2;
    }

    public int Addition()                   // Business Logic: Addition
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_8
//  Description : Entry point class to handle user interaction
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_8
{
    public static void main(String A[])
    {
        int iNumOne = 0;
        int iNumTwo = 0;
        int iRetVal = 0;

        Scanner sobj = new Scanner(System.in);      // Resource allocation

        System.out.println("Enter the first number : ");
        iNumOne = sobj.nextInt();

        System.out.println("Enter the second number : ");
        iNumTwo = sobj.nextInt();

        Logic lobj = new Logic(iNumOne, iNumTwo);   // Object creation

        iRetVal = lobj.Addition();                  // Method call

        System.out.println("The addition of "+iNumOne+" and "+iNumTwo+" is : "+iRetVal+".");

        lobj = null;                                // Memory management
        sobj.close();                               // Closing resource

    } // End of main
} // End of Program_8

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 10         Input2 : 20         Output : 30
//  Input1 : -5         Input2 : 15         Output : 10
//
/////////////////////////////////////////////////////////////////