/*

    Algorithm

    START
        
        Accept the number from the user
        count the digits of the number
        sum the digit pow to the count
        check sum is eqal to actual number
        if yes display it is armstrong
        if no display it is not an armstrong number.

    STOP

*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckArmstrongLogic
{

        private int iNum ;

        //  Parameterized constructer.
        public CheckArmstrongLogic( int iNum )
        {

            this.iNum = iNum;

        }// End of parametrized constructor.

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CountDigits()
    //  Description :   It is used to count the digits in the number     
    //  Author :        Tushar Vikas Bhore.
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public int CountDigits( int iValue )
        {

            int iCount = 0 ;

            while( iValue != 0 )
            {

                iCount++;

                iValue = iValue / 10;

            }

            return iCount;

        }   //  end of countDigits()

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : SumOfDigitsPowToCount()
    //  Description :   It is used to calculate the sum digit power to count    
    //  Author :        Tushar Vikas Bhore.
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        double SumOfDigitsPowToCount() 
        {

            double dSum = 0.0 , dCount = 0.0 , dDigit = 0.0;
            int iTemp = 0;

            iTemp = iNum;

            dCount = CountDigits( iTemp );

            //  Business Logic.
            while( iTemp != 0 )
            {

                dDigit = iTemp % 10;

                dDigit = Math.pow( dDigit , dCount );    //  used built in pow function to calculate the power

                dSum = dSum + dDigit;

                iTemp = iTemp / 10;

            }

            return dSum;

        }// End of SumOfDigitsPowToCount()

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : isArmstrong()
    //  Description :   It is used to check the number is armstrong or not.   
    //  Author :        Tushar Vikas Bhore.
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        boolean isArmstrong()
        {

            int iTemp = 0;
            double dSum = 0 ;

            iTemp = iNum;

            dSum = SumOfDigitsPowToCount();

            return ( dSum == iTemp );   // Returning the result of comparision.

        }// End of isArmstrong()

};  //  End of class CheckArmstrongLogic

class CheckArmstrong
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main( String A [] )
    {

        int iNumber = 0;
        boolean bRet = false;

        Scanner sobj = null;
        sobj = new Scanner( System.in );

        System.out.println( "Enter the number to check is it armstong or not :\t" );
        iNumber = sobj.nextInt();

        //  Input   Validation.
        if( iNumber <= 0 )
        {

            System.out.println( "Error : Please provide the nonzero and positive input only.\n" );

            sobj.close();

            return;

        }

        CheckArmstrongLogic calobj = new CheckArmstrongLogic( iNumber );
        
        bRet = calobj.isArmstrong();

        if( bRet == true )
        {

            System.out.println( "The entered number " + iNumber + " is an armstrong number" );

        }
        else
        {

            System.out.println( "The entered number " + iNumber + " is not an armstrong number" );
            
        }

        //  Deallocate the resources.
        sobj.close();

        System.gc();

    }   //End Of Main()

}// End Of Class CheckArmstrong

/////////////////////////////////////////////////////////////////
//
//      Testcase succesfully handaled by the application
//
//      TestCase  : 1
//          
//          Enter the number to check is it armstong or not :       153
//
//          The entered number 153 is an armstrong number.
//
//      TestCase : 2
//
//          Enter the number to check is it armstong or not :       370
//
//          The entered number 370 is an armstrong number.
//
//      TestCase : 3
//      
//          Enter the number to check is it armstong or not :       0
//          
//          Error : Please provide the nonzero and positive input only.
//
//      TestCase : 4
//      
//          Enter the number to check is it armstong or not :       -5
//          
//          Error : Please provide the nonzero and positive input only.
//
///////////////////////////////////////////////////////////////////
