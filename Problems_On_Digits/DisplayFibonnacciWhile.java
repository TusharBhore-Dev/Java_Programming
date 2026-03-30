/*
    Algorithm

    START
        Accept limit as iLim
        Initialize first term as 0 and next term as 1
        Iterate from 1 up to iLim
        Print the current first term
        Calculate the next term by adding first and next
        Update first term to next and next term to the calculated result
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Header files
    //
    /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class FibonnacciWhileLogic
{

        private int iLimit;

        public FibonnacciWhileLogic( int iLim )
        {

            this . iLimit = iLim;

        }   //  End of constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayFibonnacci
    //  Description :   It is used to display Fibonacci series up to a given limit         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public void DisplayFibonnacci()
        {

            int iFirstElement = 0 , iSecElement = 1 , iNext = 0;

            System.out.println(  "The fibonnacci series is as follow : " );

            int iCnt = 0;

            while( iCnt < iLimit )
            {

                System.out.printf( "\t%d" ,iFirstElement );

                iNext = iFirstElement + iSecElement;    // Sum of previous two
                iSecElement = iFirstElement;            // Shift terms
                iFirstElement = iNext;                  // Update next term

                iCnt++;

            }

        }   //  End of DisplayFibonnacci()

};  //  End of class FibonnacciWhileLogic

class DisplayFibonnacciWhile
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

        public static void main( String A [] )
        {

            int iLimit = 0;

            Scanner sobj = new Scanner( System.in );

            System.out.println( "Enter the limit upto how much elements of fibonnacci series you want :\t" );
            iLimit = sobj.nextInt();
    
            //  Input Validation.
            if( iLimit <= 0 )
            {

                System.out.println ( "Error : Please provide the valid input only." ) ;
                
                sobj.close();

                return ;

            }

            FibonnacciWhileLogic fwlobj = new FibonnacciWhileLogic ( iLimit );

            fwlobj.DisplayFibonnacci();

            //  Deallocate the memory
            sobj.close();

            //  Call to garbage collector
            System.gc();
 
        }// End Of Main();

}// End Of Class DisplayFibonnacciWhile


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
// 
//     TestCase 1 :
//
//          Enter the limit upto how much elements of fibonnacci series you want :  10
//
//          The fibonnacci series is as follow :
//              0       1       1       2       3       5       8       13      21      34
//
//     TestCase 2 :
//          
//          Enter the limit upto how much elements of fibonnacci series you want :  5
//
//          The fibonnacci series is as follow :
//              0       1       1       2       3
/////////////////////////////////////////////////////////////////
