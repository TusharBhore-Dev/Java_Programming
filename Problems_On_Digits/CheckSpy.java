/*
    Algorithm

    START
        Accept number as iNum
        Initialize sum to 0 and product to 1
        Extract each digit from the number
        Add the digit to sum and multiply it with product
        If sum equals product, it is a Spy number
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckSpyLogic
{

    private int iNum ;

    public CheckSpyLogic( int iNum )
        {

            this.iNum = iNum;

        }// End of constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : isSpy
    //  Description :   It is used to check whether a number is Spy or not         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public boolean isSpy()
        {

            int iDigit = 0 , iSumOfDigits = 0, iProductOfDigits = 0 , iTempNum = 0;
            
            //  product should not be zero at start if it will be zero ans will be zero
            iProductOfDigits = 1;
            
            iTempNum = iNum;

            while( iTempNum != 0 )
            {

                iDigit = iTempNum % 10;                         // Extract digit

                iSumOfDigits = iSumOfDigits + iDigit;       // Calculate sum
                iProductOfDigits = iProductOfDigits * iDigit; // Calculate product

                iTempNum = iTempNum / 10;

            }

            return( iSumOfDigits == iProductOfDigits );     // Comparison logic

        }   // End Of isSpy().

};//    End of Class CheckSpyLogic.

class CheckSpy
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
        
        System.out.println( "Enter the number :\t" );

        iNum = sobj.nextInt();

        if( iNum <= 0 )  // Validation check
        {

            System.out.println( "Error : Please provide non zero and positive values only." );

            sobj.close();

            return ;

        }

        CheckSpyLogic cslobj = new CheckSpyLogic( iNum );
        bRet = cslobj.isSpy();

        
        if( bRet == true )
        {

            System.out.println( "The entered number " + iNum + " is a spy number." );

        }
        else
        {

            System.out.println( "The entered number " + iNum + " is not a spy number." );

        }   

        //  Deallocating the resources.
        sobj.close();

        System.gc();

        
    }   //End of main();

}// End Of Class CheckSpy


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 1124        Output : Spy (1+1+2+4 = 8, 1*1*2*4 = 8)
//  Input : 123         Output : Spy (1+2+3 = 6, 1*2*3 = 6)
//  Input : 124         Output : Not a Spy (1+2+4 = 7, 1*2*4 = 8)
//
/////////////////////////////////////////////////////////////////