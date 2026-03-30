/*

    Algorithm

    START
        
        Accept the number from the user
        count the digits of the number
        Display the count of the digits

    STOP

*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CountDigitLogic
{

        private int iNum;

        public CountDigitLogic ( int iNumber )
        {

            this . iNum = iNumber;

        }// End of constructor.

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CountDigitOfNum()
    //  Description :   It is used to count the digits in the number     
    //  Author :        Tushar Vikas Bhore.
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        
        public int CountDigitOfNum()
        {

            int iCount = 0;
            int iTempNum = 0;
            int iDigit = 0;

            iTempNum = iNum;

            while( iTempNum != 0 )
            {

                //  To extract the last digit from number 
                iDigit = iNum % 10;

                iCount++;

                iTempNum = iTempNum / 10;

            }

            return iCount;

        }// End of CountDigitOfNum

};  //  End Of Class CountDigitLogic

class CountDigit
{

    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

        public static void main( String A [] )
        {

            int iNumber = 0 , iRet = 0;

            Scanner sobj = new Scanner( System.in );

            System.out.println( "Enter the number to get the count of digits :\t" );
            iNumber = sobj.nextInt();

            
            if( iNumber <= 0 )  // Validation check
            {

                System.out.println( "Error : Please provide non zero and positive values only." );

                sobj.close();

                return ;

            }

            CountDigitLogic cdlobj = new CountDigitLogic( iNumber );

            iRet = cdlobj.CountDigitOfNum();

            System.out.println( "There are " + iRet + " digits in the entered number " + iNumber + " ." );

            //  Deallocating the resources
            sobj.close();

            System.gc();

        } // End of main()

}// End Of Class CountDigit

/////////////////////////////////////////////////////////////////
//
//      Testcase succesfully handaled by the application
//
//      TestCase  : 1
//          
//          Enter the number to get the count of digits :   123654
//
//          There are 6 digits in the entered number 123654 .
//      
//      TestCase : 2
//
//          Enter the number to get the count of digits :   12354
//
//          There are 5 digits in the entered number 12354 .
//
//      TestCase : 3
//
//          Enter the number to get the count of digits :   -8
//
//          Error : Please provide the positive number only.
//
//      TestCase : 4
//      
//          Enter the number to get the count of digits :   0
//
//          Error : Please provide the positive number only.
//
///////////////////////////////////////////////////////////////////
