/*
    Algorithm

    START
        Accept number as iNum
        Calculate sum of all digits of iNum
        Divide original iNum by the sum of digits
        If remainder is 0, it is a Harshad number
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckHarshadLogic
{

        private int iNum ;
    

        //  Parameterized Constructor.

        public CheckHarshadLogic( int iNum )
        {

            this . iNum = iNum;

        }   //  End Of Constructor

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

            //  Business Logic.
            while( iNumber != 0 )
            {

                iDigit = iNumber % 10;

                iSum = iSum + iDigit;

                iNumber = iNumber / 10;

            }

            return iSum;

        }   //  End Of SumOfDigits()

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : isHarshad()
    //  Description :   It is used to check whether a number is Harshad or not         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public boolean isHarshad()
        {

            int iSumofDigit = 0 , iTempNum = 0;

            iTempNum = iNum;

            iSumofDigit = SumOfDigits( iTempNum );  //  To Get the sum of Digits.

            return( iTempNum % iSumofDigit == 0 );

        }   //  End Of isHarshad().

};  //  End of Class CheckHarshadLogic

class CheckHarshad
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

            Scanner sobj = new Scanner( System.in );

            System.out.println( "Enter the number to check is it harshad(niven) number or not :\t" );
            iNum = sobj.nextInt();

            //  Input   Validation.
            if( iNum <= 0 )
            {

                System.out.println ( "Error : Please enter the non zero and positive number only.\n" );

                sobj.close();

                return ;

            }

            CheckHarshadLogic chlobj = new CheckHarshadLogic(iNum);

            bRet = chlobj.isHarshad();

            if( bRet == true )
            {

                System.out.println ( "The entered number " + iNum + " is harshad (Niven) number." );

            }
            else
            {

                System.out.println ( "The entered number " + iNum + " is not harshad (Niven) number." );

            }

            //  Deallocating the resources.
            sobj.close();

            System.gc();
            
        }// End Of Main()

} // End of Class CheckHarshad

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//  
//  TestCase : 1 
//
//      Enter the number to check is it harshad(niven) number or not :  3
//      The entered number 3 is harshad (Niven) number.
//
//  TestCase : 2
//
//      Enter the number to check is it harshad(niven) number or not :  18
//      The entered number 18 is harshad (Niven) number.
//
//  TestCase : 3
//
//      Enter the number to check is it harshad(niven) number or not :  15
//      The entered number 15 is not harshad (Niven) number.
//
//  TestCase : 4
//
//      Enter the number to check is it harshad(niven) number or not :  9
//      The entered number 9 is harshad (Niven) number.
//
//  TestCase : 5
//
//      Enter the number to check is it harshad(niven) number or not :  -5
//      Error : Please enter the non zero and positive number only.
//
/////////////////////////////////////////////////////////////////