/*
    Algorithm

    START
        Accept number as iNum
        Initialize a lookup table for factorials of digits 0-9
        Extract each digit from the number
        Fetch the factorial from the table and add it to sum
        Compare the total sum with the original number
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckStrongLogicAdv
{

        private int iNum ;

        public CheckStrongLogicAdv( int iNum )
        {

            this . iNum = iNum;

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

            int iSumOfFactOfDigit = 0 , iTemp = 0 , iDigit = 0;
            iTemp = iNum;

           // Lookup table for factorials                                              
           //index:           0   1   2   3    4   5      6     7      8       9                
           int[ ] FactArr = { 1 , 1 , 2 , 6 , 24 , 120 , 720 , 5040 , 40320 , 362880 };

            while( iTemp != 0 )
            {

                iDigit = iTemp % 10;

                //  Business Logic
                iSumOfFactOfDigit = iSumOfFactOfDigit + FactArr[iDigit];

                iTemp = iTemp / 10;

            }

            //  Comparing
            return ( iNum == iSumOfFactOfDigit );
    
        }// End Of isStrong()

};//  End of Class CheckStrongLogicAdv

class CheckStrong2
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

            CheckStrongLogicAdv cslaobj = new CheckStrongLogicAdv( iNum );
            
            bRet = cslaobj.isStrong();
            
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

}// End Of Class CheckStrong2


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 145         Output : Strong (1! + 4! + 5! = 145)
//  Input : 2           Output : Strong (2! = 2)
//  Input : 123         Output : Not a Strong number
//
/////////////////////////////////////////////////////////////////

