/*
    Algorithm

    START
        Accept number as iNum
        Initialize iMinDigit to 9 (highest possible digit)
        Iterate until iNum becomes zero
        Extract the last digit using modulo 10
        Compare extracted digit with iMinDigit
        If extracted digit is smaller, update iMinDigit
        Divide iNum by 10 to move to the next digit
        Return iMinDigit
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

    import java.util.Scanner;

class FindMinDigitLogic
{

        private int iNum;

        public FindMinDigitLogic( int iNum )
        { 

            this . iNum = iNum;

        }//End of parameterized constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : GetMinDigit()
    //  Description :   It is used to find the smallest digit in a given number         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        int GetMinDigit()
        {
                
            int iMinDigit = 9 , iDigit = 0 , iTempNum = 0;
            iTempNum = iNum;

            //  Business Logic.
            while( iTempNum != 0 )
            {

                iDigit = iTempNum % 10;

                if( iDigit < iMinDigit )
                {

                    iMinDigit = iDigit;

                }

                iTempNum = iTempNum / 10;

            }

            return iMinDigit;

        }   //  End Of  GetMinDigit()

};  //  End Of Class FindMinDigitLogic


class FindMinDigit
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

            FindMinDigitLogic fmdlobj = new FindMinDigitLogic( iNumber );

            iRet = fmdlobj.GetMinDigit();

            System.out.println( "The smallest digit in the number " + iNumber + " is : " + iRet +" ." );

            //  Deallocate the memory
            sobj.close();

            //  Call to garbage collector
            System.gc();
 
        }// End Of Main();

}// End Of Class FindMinDigit


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//      TestCase 1 :
//
//          Enter the number :      125985
//          The largest digit in the number 125985 is : 1 .
//
//      TestCase 2 :
//
//          Enter the number :      -5
//          Error : Please enter the non zero and positive value only.
//
//      TestCase 3 :
//          
//          Enter the number :      5649
//          The largest digit in the number 5649 is : 4 .
//
//
/////////////////////////////////////////////////////////////////