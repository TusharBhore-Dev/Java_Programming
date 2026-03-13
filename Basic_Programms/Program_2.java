/*

    Algorithm

        START

            Initialize three integer variables iNumOne, iNumSec, and iAns
            Assign value 10 to iNumOne
            Assign value 11 to iNumSec
            Perform Addition of iNumOne & iNumSec and store in iAns
            Display the result of addition on screen using System.out.println

        STOP

*/

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.lang.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_2
//  Description : Performs addition of two static integers
//  Author :      Tushar vikas bhore
//  Date :        21/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_2
{

    public static void main( String A [] )
    {

        int iNumOne = 0;                            // First input variable
        int iNumSec = 0;                            // Second input variable

        int iAns = 0;                               

        iNumOne = 10;                               
        iNumSec = 11;                               

        iAns = iNumOne + iNumSec;                   // Business Logic

        System.out.println( "The addition of the "+iNumOne+" and "+iNumSec+" is : "+iAns+"." );

    }   // End of main
    
}   // End of Program_2

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : Static (10, 11)        Output : 21
//
/////////////////////////////////////////////////////////////////