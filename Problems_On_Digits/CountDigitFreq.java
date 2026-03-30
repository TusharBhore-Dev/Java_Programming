/*
    Algorithm

    START
        Accept number as iNum and target digit as iDig
        Extract each digit from iNum
        If extracted digit matches iDig, increment counter
        Continue until all digits are checked
        Display the final frequency count
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CountDigitFreqLogic
{

        private int iNum;

        private int iDig;

        public CountDigitFreqLogic( int iNum , int iDig )
        {

            this . iNum = iNum;

            this . iDig = iDig;

        }// End of parameterized constructor
        
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CalcDigitFreq()
    //  Description :   It is used to count frequency of a specific digit         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public int CalcDigitFreq() 
        {

            int iCountFreq = 0 , iDigit = 0 , iTempNum = 0, iTempDig = 0;

            //  creating temporary data copy of static data
            iTempNum = iNum;
            iTempDig = iDig;

            //  Business Logic.
            while( iTempNum != 0 )
            {

                iDigit = iTempNum % 10;

                if( iDigit == iTempDig )
                {

                    iCountFreq++;

                }

                iTempNum = iTempNum / 10;

            }

            return iCountFreq;

        } // End of CalcDigitFreq()

};  //End Of Class CountDigitFreqLogic

class CountDigitFreq
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

        public static void main( String A [] )
        {

            int iNumber = 0 , iRet = 0 , iDigit = 0;

            Scanner sobj = new Scanner( System.in );

            System.out.println( "Enter the number :\t" );
            iNumber = sobj.nextInt();

            System.out.println( "Enter the digit to find its frequency in the entered number :\t" );
            iDigit = sobj.nextInt();

            if( iNumber <= 0 || iDigit < 0 )  // Validation check
            {

                System.out.println( "Error : Please provide non zero and positive values only." );

                sobj.close();

                return ;

            }

            CountDigitFreqLogic cdflobj = new CountDigitFreqLogic( iNumber , iDigit );

            iRet = cdflobj.CalcDigitFreq();

            System.out.println( "The frequency of the digit ( " + iDigit + " ) in the number ( " + iNumber + " ) is : " + iRet + " ." );

            //  Deallocate the memory
            sobj.close();

            //  Call to garbage collector
            System.gc();

        }//     End Of Main()

}// End Of Class CountDigitFreq

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input No : 12234   Digit : 2   Output : 2
//  Input No : 999     Digit : 9   Output : 3
//  Input No : 123     Digit : 5   Output : 0
//
/////////////////////////////////////////////////////////////////