/*
    Algorithm

    START
        Accept number as iNum
        Calculate square of iNum
        Count digits in iNum
        Extract last 'n' digits of square
        Compare extracted digits with iNum
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CheckAutoMorphicLogic
{

        private int iNum ;

        public CheckAutoMorphicLogic( int iNum )
        {

            this.iNum = iNum;

        }// Endof Constructor

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

            //  Business Logic.
            while( iValue != 0 )
            {

                iCount++;

                iValue = iValue / 10;

            }

            return iCount;

        }   //  end of countDigits()
           
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : isAutomorphic
    //  Description :   It is used to check whether a number is Automorphic or not         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public boolean isAutomorphic()
        {
            
            int iCnt = 0 , iCountDig = 0 , iNumsqre = 0 , iDigit = 0 , iTempNum = 0 , iLastDigOfNum = 0, iLastDigOfsqre = 0;

            iNumsqre = iNum * iNum;
            iTempNum = iNum;

            iCountDig = CountDigits( iTempNum );

            for( iCnt = 1; ( iCnt <= iCountDig ) && ( iTempNum != 0 ) && ( iNumsqre != 0 ); iCnt++ )
            {

                iDigit = iTempNum % 10;

                iLastDigOfNum = iLastDigOfNum * 10 + iDigit;    //  Reverse the last digits of number

                iTempNum = iTempNum / 10;

                iDigit = iNumsqre % 10;

                iLastDigOfsqre = iLastDigOfsqre * 10 + iDigit;  //  Reverse the last digits of square

                iNumsqre = iNumsqre / 10;

            }

            return( iLastDigOfNum == iLastDigOfsqre );      // Verification logic

        }   //  End of isAutomorphic()

};  //  End of class  CheckAutoMorphicLogic

class CheckAutomorphic
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

        Scanner sobj = null;
        sobj = new Scanner( System.in );

        System.out.println( "Enter the number to check is it automorphic or not :\t" );
        iNum = sobj.nextInt();


        if( iNum <= 0 )
        {

            System.out.println( "Error : Please provide the non zero and positive number only.\n" );

            sobj.close();

            return ;

        }

        CheckAutoMorphicLogic calobj = new CheckAutoMorphicLogic( iNum );
        bRet = calobj.isAutomorphic();

        if( bRet == true )
        {

            System.out.println( "The entered number " + iNum + " is automorphic." );
  
        }
        else
        {

            System.out.println( "The entered number " + iNum + " is not automorphic." );
  
        }
    
        sobj.close();

        System.gc();

    }

}

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//      
//      TestCase : 1    
//          
//          Enter the number to check is it automorphic or not :    25
//          The entered number 25 is automorphic.
//      
//      TestCase : 2
//
//          Enter the number to check is it automorphic or not :    76
//          The entered number 76 is automorphic.
//
//      TestCase : 3
//          
//          Enter the number to check is it automorphic or not :    376
//          The entered number 376 is automorphic.
//
//     TestCase : 4
//
//          Enter the number to check is it automorphic or not :    371
//          The entered number 371 isnot automorphic.
//
//
/////////////////////////////////////////////////////////////////