/*
    Algorithm

    START
        Accept number as iNum
        Initialize iMaxDigit to 0
        Iterate until iNum becomes zero
        Extract the last digit using modulo 10
        Compare extracted digit with iMaxDigit
        If extracted digit is greater, update iMaxDigit
        Divide iNum by 10 to move to the next digit
        Return iMaxDigit
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

    import java.util.Scanner;

class FindMaxDigitLogic
{

        private int iNum;

        public FindMaxDigitLogic( int iNum )
        { 

            this . iNum = iNum;

        }//End of parameterized constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : GetMaxDigit()
    //  Description :   It is used to find the largest digit in a given number         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        int GetMaxDigit()
        {
                
            int iMaxDigit = 0 , iDigit = 0 , iTempNum = 0;
            iTempNum = iNum;

            //  Business Logic.
            while( iTempNum != 0 )
            {

                iDigit = iTempNum % 10;

                if( iDigit > iMaxDigit )
                {

                    iMaxDigit = iDigit;

                }

                iTempNum = iTempNum / 10;

            }

            return iMaxDigit;

        }   //  End Of  GetMaxDigit()

};  //  End Of Class FindMaxDigitLogic


class FindMaxDigit
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

            System.out.println( "Enter the number :\t" );
            iNumber = sobj.nextInt();

            if( iNumber <= 0 )  // Validation check
            {

                System.out.println( "Error : Please provide non zero and positive values only." );

                sobj.close();

                return ;

            }

            FindMaxDigitLogic fmdlobj = new FindMaxDigitLogic( iNumber );

            iRet = fmdlobj.GetMaxDigit();

            System.out.println( "The largest digit in the number " + iNumber + " is : " + iRet +" ." );

            //  Deallocate the memory
            sobj.close();

            //  Call to garbage collector
            System.gc();
 
        }// End Of Main();

}// End Of Class FindMaxDigit


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//      TestCase 1 :
//
//          Enter the number :      125985
//          The largest digit in the number 125985 is : 9 .
//
//      TestCase 2 :
//
//          Enter the number :      -5
//          Error : Please enter the non zero and positive value only.
//
//      TestCase 3 :
//          
//          Enter the number :      5649
//          The largest digit in the number 5649 is : 9 .
//
//
/////////////////////////////////////////////////////////////////