/*

        Algorithm

            START

                Initialize first number as iNumOne
                Initialize second number as iNumSec
                Perform Multiplication of iNumOne & iNumSec
                Display the multiplication result on screen
                
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
//  Class Name :  Program_4
//  Description : It is used to perform multiplication
//  Author :      Tushar vikas bhore.
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_4
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
        int iAns = 0;                               // To store result

        iNumOne = 2;                           
        iNumSec = 9;                                

        iAns = iNumOne * iNumSec;                   // Business Logic

        System.out.println("The multiplication of the "+iNumOne+" and "+iNumSec+" is : "+iAns+".");

    } // End of main
    
} // End of Program_4

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 2         Input2 : 9          Output : 18
//
/////////////////////////////////////////////////////////////////