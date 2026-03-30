/*
    Algorithm

    START
        Accept number as iNumber
        Iterate until iNumber becomes zero
        Extract the last digit using modulo 10
        Add the extracted digit to iSum
        Divide iNumber by 10 to move to the next digit
        Return the final sum iSum
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////


import java.util.Scanner;

class SumofDigitsLogic
{

        private int iNum ;

        public SumofDigitsLogic( int iNum )
        {

            this . iNum = iNum;

        }// End Of constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CalculateSumOfDig()
    //  Description :   It is used to calculate the sum of all digits in a number         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public int CalculateSumOfDig()
        {
            
            int iDigit = 0 , iSum = 0 , iTempNum = 0;

            iTempNum = iNum;

            //  Bussiness Logic.
            while( iTempNum != 0 )
            {

                iDigit = iTempNum % 10;

                iSum = iSum + iDigit;

                iTempNum = iTempNum / 10;

            }

            return iSum;

        }// End of CalculateSumOfDig()

};//    End of class SumofDigitsLogic

class SumOfDigits
{

    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

        public static void main( String A [] )
        {

            int iNum = 0 , iRet = 0;

            Scanner sobj = new Scanner( System.in );

            System.out.println( "Enter the number to get the sum of digits :\t" );
            iNum = sobj.nextInt();

            if( iNum <= 0 )  // Validation check
            {

                System.out.println( "Error : Please provide non zero and positive values only." );

                sobj.close();

                return ;

            }

            SumofDigitsLogic sodlobj = new SumofDigitsLogic( iNum );
            iRet = sodlobj.CalculateSumOfDig();

            System.out.println( "The sum of the digits of the number " + iNum + " is : " + iRet + " .");

            //  Deallocate the memory
            sobj.close();

            //  Call to garbage collector
            System.gc();
 
        }// End Of Main();

}   // End Of Class SumOfDigits 


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//      TestCase 1 :
//
//          Enter the number to get the sum of digits :     123
//
//          The sum of the digits of the number 123 is : 6 .
//
//      TestCase 2 :
//
//          Enter the number to get the sum of digits :     258
//
//          The sum of the digits of the number 258 is : 15 .
//
/////////////////////////////////////////////////////////////////