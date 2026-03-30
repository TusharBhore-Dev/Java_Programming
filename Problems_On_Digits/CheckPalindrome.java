/*
    Algorithm

    START
        Accept number as iNum
        Reverse the digits of iNum
        Compare reversed number with original iNum
        If they match, it is a Palindrome
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckPalindromeLogic
{

    private int iNum ;

    public CheckPalindromeLogic( int iNum )
        {

            this . iNum = iNum;

        } // End of parameterized constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : isPalindrome()
    //  Description :   It is used to check whether a number is Palindrome or not         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public boolean isPalindrome() 
        {

            int iRevNum = 0 , iDigit = 0 , iTemp = 0;

            iTemp = iNum;

            //  Business Logic.
            while( iTemp != 0 )
            {

                //  To extract the digits
                iDigit = iTemp % 10 ;

                //  Business Logic
                iRevNum = iRevNum * 10 + iDigit;

                iTemp = iTemp / 10;

            }

            return( iNum == iRevNum );

        }// End of isPalindrome()

};  //  End Of Class CheckPalindromeLogic


class CheckPalindrome
{

    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main( String  A [] ) 
    {

        int iNum  = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner( System.in );

        System.out.println( "Enter the number to check it is palindrome or not :\t" );
        iNum = sobj.nextInt();

        // Input validation
        if( iNum <= 0 )
        {

            System.out.println( "Error : Please enter the nonzero and positive number only." );

            sobj.close();

            return ;

        }

        CheckPalindromeLogic cplobj = new CheckPalindromeLogic(iNum);

        bRet = cplobj.isPalindrome();

        if( bRet == true )
        {

            System.err.println( "The number " + iNum + " is palindrome.\n" );

        }
        else
        {

            System.err.println( "The number " + iNum + " is not palindrome.\n" );

        }

        //  dEAllocating the resources
        sobj.close();

        System.gc();

    }// End Of Main()

}// End Of Class CheckPalindrome

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//      TestCae : 1 
//      
//          Enter the number to check it is palindrome or not :     121
//          The number 121 is palindrome.
//
//      TestCae : 2 
//          
//          Enter the number to check it is palindrome or not :     232
//          The number 232 is palindrome.
//
//      TestCae : 3 
//
//          Enter the number to check it is palindrome or not :     529
//          The number 529 is not palindrome.
//
//      TestCae : 4 
//
//          Enter the number to check it is palindrome or not :     -106
//          Error : Please enter the nonzero and positive number only.
//
//
/////////////////////////////////////////////////////////////////
