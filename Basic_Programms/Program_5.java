/*
    Algorithm

    START
        Initialize first number as iNumOne
        Initialize second number as iNumSec
        Perform Division of iNumOne by iNumSec
        Display the division result on screen
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
//  Class Name :  Program_5
//  Description : It is used to perform division
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_5
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

        iNumOne = 36;
        iNumSec = 2;

        iAns = iNumOne / iNumSec;                   // Business Logic: Division

        System.out.println("The division of the "+iNumOne+" and "+iNumSec+" is : "+iAns+".");

    } // End of main
    
} // End of Program_5

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 36         Input2 : 2          Output : 18
//
/////////////////////////////////////////////////////////////////