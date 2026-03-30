/*

    Algorithm

    START
        
        Accept the nymber from the user
        Extract the digits from number by doing % 10 operation
        Display the digit
        Reduce the digit which is displayed by doing /10 operation

    STOP

*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class DisplayRevDigsLogic
{

    private int iNum ;
    
    public DisplayRevDigsLogic( int iNumber )
        {

            this.iNum = iNumber;

        } // End of Parameterized constructor;

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayDigitsRev()
    //  Description :   It is used to display the digits of number in reverse order      
    //  Author :        Tushar Vikas Bhore.
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public void DisplayDigitsRev()
        {

            int iTemp = 0 , iDigit = 0;

            iTemp = iNum;

            System.out.println ( "The digits of a number in reverse order are as follow : " ) ;

            //  Business Logic.
            while( iTemp != 0 )
            {

                iDigit = iTemp % 10;

                System.out.printf( "\t%d\t" ,iDigit );
                
                iTemp = iTemp /10;

            }// End of loop

        }   //  End of DisplayDigitRev() 

}; // End of class DisplayRevDigsLogic

class DisplayDigitsReverse
{

    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

        public static void main( String A [ ] )
        {

            int iNum = 0;

            Scanner sobj =  new Scanner( System.in );

            System.out.println( "Enter the number :\t" );
            iNum = sobj.nextInt();

            if( iNum <= 0 )  // Validation check
            {

                System.out.println( "Error : Please provide non zero and positive values only." );

                sobj.close();

                return ;

            }

            DisplayRevDigsLogic drdlobj = new DisplayRevDigsLogic( iNum );

            drdlobj.DisplayDigitsRev();

            //  Deallocate the memory
            sobj.close();

            //  Call to garbage collector
            System.gc();
 

        }// End Of Main();

}// End Of Class DisplayDigitsReverse

/////////////////////////////////////////////////////////////////
//
//    Testcase succesfully handaled by the application
//
//      TestCase  : 1
//
//          Enter the number :      0
//          
//          Error : Please provide the non zero and positive value only.
//
//      TestCase : 2
//
//          Enter the number :      5
//
//          The digits of a number in reverse order are as follow :
//
//              5
//      TestCase : 3
//  
//          Enter the number :      -5
//
//          Error : Please provide the non zero and positive value only.
//      
//      TestCase : 4
//
//          Enter the number :      1234567
//
//          The digits of a number in reverse order are as follow :
//
//              7               6               5               4               3               2               1
/////////////////////////////////////////////////////////////////
