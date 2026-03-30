/*
    Algorithm

    START
        Accept number as iNum
        Calculate square of iNum
        Calculate sum of digits of the square
        Compare sum with original iNum
        If they are equal, it is a Neon number
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckNeonLogic
{

        private int iNum ;
    
        public CheckNeonLogic( int iNum )
        {

            this . iNum = iNum;

        }// //  end of constuctor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : SumOfDigits()
    //  Description :   It is used to calculate the sum of digits of the number.         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public int SumOfDigits( int iNumber )
        {

            int iDigit = 0 , iSum = 0;

            while( iNumber != 0 )
            {

                iDigit = iNumber % 10;   // Extract digit from square

                iSum = iSum + iDigit;

                iNumber = iNumber / 10;

            }

            return iSum;

        }   //  End Of SumOfDigits()

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : iskNeon
    //  Description :   It is used to check whether a number is Neon or not         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public boolean isNeon()
        {

            int iNumSqr = 0 , iSumOfDigitsOfSqre = 0;

            iNumSqr = iNum * iNum;

            iSumOfDigitsOfSqre = SumOfDigits( iNumSqr );

            return ( iNum == iSumOfDigitsOfSqre );

        }   //  End of isNeon()

};  //  End Of class CheckNeonLogic

class CheckNeon
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main( String A [] )
    {

        int iNum = 0;
        boolean bRet = false;

        Scanner sobj = null;
        sobj = new Scanner( System.in );


        System.out.println( "Enter the number :\t" );
        iNum = sobj.nextInt();

        if( iNum < 0 )
        {

            System.out.println( "Error : Please provide the positive numbers only.\n" );

            sobj.close();

            return;      // Filter negative input

        }

        CheckNeonLogic cnobj = new CheckNeonLogic( iNum );

        bRet = cnobj.isNeon();

            
        if( bRet == true )
        {

            System.out.println ( "The number " + iNum + " is neon number.\n" );

        }
        else
        {

            System.out.println ( "The number " + iNum + " is  not neon number.\n" );

        }

        sobj.close();

        System.gc();

    } // End Of Main()

}// End of Class CheckNeon

///////////////////////////////////////////////////////////////////////
//  
//
//      TestCases successfully handled by the application
//
//          Test Case : 1
//
//              Enter the number :      9
//
//              The number 9 is neon number.
//
//          Test Case : 2
//
//              Enter the number :      12
//
//              The number 12 is not neon number.
//
//          Test Case : 3
//
//              Enter the number :      10
//
//              The number 10 is not neon number.
//
//          Test Case : 4
//
//              Enter the number :      12
//
//              The number 12 is not neon number.
//
//          Test Case : 5
//
//              Enter the number :      -5
//
//              Error : Please provide the positive numbers only.
//
//
///////////////////////////////////////////////////////////////////////