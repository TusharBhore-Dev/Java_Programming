/*

    Algorithm

        START

            Initialize first number as iNumOne
            Initialize second number as iNumSec
            Perform Subtraction of iNumOne & iNumSec
            Display the subtraction result on screen
    
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
//  Class Name :  Program_3
//  Description : It is used to perform subtraction
//  Author :      Tushar vikas bhore.
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_3
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        
        int iNumOne = 0;                            // First input
        int iNumSec = 0;                            // Second input
        int iAns = 0;                               // To store result

        iNumOne = 20;                               // Input initialization
        iNumSec = 9;                                // Input initialization

        iAns = iNumOne - iNumSec;                   // Business Logic

        System.out.println("The substraction of the "+iNumOne+" and "+iNumSec+" is : "+iAns+".");

    } // End of main
    
} // End of Program_3

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 20         Input2 : 9          Output : 11
//
/////////////////////////////////////////////////////////////////