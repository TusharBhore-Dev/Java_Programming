/*
    Algorithm

    START
        Initialize first number as iNumOne
        Initialize second number as iNumSec
        Perform Modulo operation (Remainder) of iNumOne by iNumSec
        Display the result on screen
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Classes / Packages
//
/////////////////////////////////////////////////////////////////

import java.lang.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_7
//  Description : It is used to find the remainder of division
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_7
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iNumOne = 0;
        int iNumSec = 0;
        int iAns = 0;

        iNumOne = 21;
        iNumSec = 2;

        iAns = iNumOne % iNumSec;                   // Business Logic: Modulo operation

        System.out.println("The remainder of division of the numbers "+iNumOne+" and "+iNumSec+" is : "+iAns+".");

    } // End of main
    
} // End of Program_7

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 21         Input2 : 2          Output : 1
//
/////////////////////////////////////////////////////////////////