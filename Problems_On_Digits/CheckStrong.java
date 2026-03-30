/*
    Algorithm

    START
        Accept number as iNum
        Extract each digit from the number
        Calculate factorial of each extracted digit
        Sum the factorials of all digits
        Compare the sum with original iNum
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckStrongLogic
{

    private int iNum ;

    public CheckStrongLogic( int iNum )
        {

            this.iNum = iNum;

        }// End of Parameterized Constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : isStrong
    //  Description :   It is used to check whether a number is Strong or not         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public boolean isStrong()
        {

            int iFact = 1 , iDigit = 0 , iTemp = 0 , iSumOfFactOfDig = 0;

            iTemp = iNum;

            //  Business Logic
            while( iTemp != 0 )
            {

                iDigit = iTemp % 10;

                iFact = 1;
                while(  iDigit >= 1  )                      // Factorial calculation
                {

                    iFact = iFact * iDigit;
                    iDigit--;
                }

                iSumOfFactOfDig = iSumOfFactOfDig + iFact;  // Sum of factorials

                iTemp = iTemp / 10;

            }

            return ( iNum == iSumOfFactOfDig );            // comparison

        }// End of isStrong

};  //  End of Class CheckStrongLogic


class CheckStrong
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

        CheckStrongLogic cslobj = new CheckStrongLogic( iNum );
        
        bRet = cslobj.isStrong();
        
        if( bRet == true )
        {

            System.out.println( "The number " + iNum + " is strong number." );
        }
        else
        {

            System.out.println( "The number " + iNum + " is not strong number." );

        }

        //  Deallocating the resources
        sobj.close();

        System.gc();

    }   //End of main();

}// End Of Class CheckStrong


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 145         Output : Strong (1! + 4! + 5! = 145)
//  Input : 2           Output : Strong (2! = 2)
//  Input : 123         Output : Not a Strong number
//
/////////////////////////////////////////////////////////////////