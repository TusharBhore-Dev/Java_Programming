/*
    Algorithm

    START
        Accept first integer from user as iNumOne
        Accept second integer from user as iNumTwo
        Create object of Logic class and pass inputs to constructor
        Call Division method of Logic class
        Handle the case of division by zero (return -1)
        Display the result of division or error message
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
//  Description : Contains arithmetic logic for division with validation
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    public int iNum1 = 0;
    public int iNum2 = 0;

    Logic(int iNo1, int iNo2)
    {
        this.iNum1 = iNo1;
        this.iNum2 = iNo2;
    }

    public int Division()
    {
        if(iNum2 == 0)                      // Business Logic: Check for division by zero
        {
            return -1;
        }
        else if(iNum1 == 0)                 // Business Logic: Dividend is zero
        {
            return 0;
        }
        else
        {
            int iAns = 0;
            iAns = iNum1 / iNum2;           // Business Logic: Perform Division
            return iAns;
        }
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_17
//  Description : Entry point class to handle integer division
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_17
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNumOne = 0, iNumTwo = 0, iRetVal = 0;

        Scanner sobj = new Scanner(System.in);      // Resource allocation

        System.out.println("Enter the first number :\t");
        iNumOne = sobj.nextInt();

        System.out.println("Enter the second number :\t");
        iNumTwo = sobj.nextInt();

        Logic lobj = new Logic(iNumOne, iNumTwo);   // Object creation

        iRetVal = lobj.Division();                  // Method call

        if(iRetVal == -1)
        {
            System.out.println("The division by zero denominator is undefined.\n");
        }
        else
        {
            System.out.println("The division of "+iNumOne+" and "+iNumTwo+" is : "+iRetVal+".");
        }

        lobj = null;
        sobj.close();                               // Closing resource

    } // End of main
} // End of Program_17

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 10          Input2 : 2           Output : 5
//  Input1 : 10          Input2 : 0           Output : Division by zero undefined
//  Input1 : 0           Input2 : 5           Output : 0
//
/////////////////////////////////////////////////////////////////