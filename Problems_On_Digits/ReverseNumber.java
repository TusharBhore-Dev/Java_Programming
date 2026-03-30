/*
    Algorithm

    START
        Accept number as iNum
        Iterate until iNum becomes zero
        Extract the last digit of iNum using modulo 10
        Update iRevNum by multiplying it by 10 and adding the extracted digit
        Divide iNum by 10 to remove the processed digit
        Return the final reversed number iRevNum
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////


import java.util.Scanner;

class ReverseNumberLogic
{

        private int iNum;

        public ReverseNumberLogic( int iNum )
        {

            this.iNum = iNum;

        }   //  End of constructor.

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : ReverseNum()
    //  Description :   It is used to reverse the digits of a given number         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        int ReverseNum()
        {
 
            int iRevNum = 0 , iDigit = 0 , iTempNum = 0;
            
            iTempNum = iNum;

            //  Business Logic.
            while( iTempNum != 0 )
            {

                iDigit = iTempNum % 10;

                iRevNum = iRevNum * 10 + iDigit;

                iTempNum = iTempNum / 10;

            }

            return iRevNum;

        }// End of ReverseNum()

};//    End of class ReverseNumberLogic

class ReverseNumber
{

    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

        public static void main( String A [] )
        {

            int iNum = 0 , iRevNum = 0;

            Scanner sobj = new Scanner ( System.in );

            System.out.println( "Enter the number to reverse the number :\t" );
            
            iNum = sobj.nextInt();
            
            if( iNum <= 0 )  // Validation check
            {

                System.out.println( "Error : Please provide non zero and positive values only." );

                sobj.close();

                return ;

            }

            ReverseNumberLogic rnlobj = new ReverseNumberLogic( iNum );
            iRevNum = rnlobj.ReverseNum();

            System.out.println( "The entered number is : " + iNum + " ." );
            System.out.println( "The reversed number is : " + iRevNum +" ." );

            //  Deallocate the memory
            sobj.close();

            //  Call to garbage collector
            System.gc();
 
        }// End Of Main();

}// End Of Class ReverseNumber

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//      TestCase 1 : 
//
//          Enter the number to reverse the number :        523
//
//          The entered number is : 523 .
//          The reversed number is : 325 .
//
//      TestCase 2 :
//
//          Enter the number to reverse the number :        1253
//
//          The entered number is : 1253 .
//          The reversed number is : 3521 .
//
//      TestCase 3 :
//
//          Enter the number to reverse the number :        -5
//
//          Error : Please enter the positive and non zero number.
//
/////////////////////////////////////////////////////////////////