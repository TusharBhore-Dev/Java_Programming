/*
    Algorithm

    START
        Accept number as iNum
        Calculate cube of iNum
        Count digits in iNum
        Compare last digits of cube with iNum
        If they match, it is Triomorphic
    STOP
*/

    /////////////////////////////////////////////////////////////////
    // 
    //  Required Packages
    //
    /////////////////////////////////////////////////////////////////


import java.util.Scanner;

class CheckTrioMorphicLogic
{

        private int iNum;

        public CheckTrioMorphicLogic( int iNum )
        {

            this . iNum  = iNum;

        }// End of constructor

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : CountDigits()
    //  Description :   It is used to count the digits in the number     
    //  Author :        Tushar Vikas Bhore.
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        int CountDigits( int iValue ) 
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
    //  Function Name : isTrioMorphic()
    //  Description :   It is used to check whether a number is Triomorphic or not         
    //  Author :        Tushar vikas bhore
    //  Date :          30/03/2026
    //
    /////////////////////////////////////////////////////////////////

        public boolean isTrioMorphic()
        {

            int iTempNum = 0 , iCountDigits = 0 , iDigit = 0 , iLastDigOfNum = 0 , iLastDigOfCube = 0 , iNumCube = 0 , iCnt = 0;

            iNumCube = iNum * iNum * iNum;

            iTempNum = iNum;

            iCountDigits = CountDigits( iTempNum );

            //  Business Logic.
            for( iCnt = 1; ( iCnt <= iCountDigits ) && ( iTempNum != 0 ) && ( iNumCube != 0 ); iCnt++ )
            {

                iDigit = iTempNum % 10;

                iLastDigOfNum = iLastDigOfNum * 10 + iDigit;

                iTempNum = iTempNum / 10;

                iDigit = iNumCube % 10;

                iLastDigOfCube = iLastDigOfCube * 10 + iDigit;

                iNumCube = iNumCube / 10;

            }

            return( iLastDigOfNum == iLastDigOfCube );

        }// End of isTrioMorphic()

};  //  End of class CheckTrioMorphicLogic

class CheckTriomorphic
{

    
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////


        public static void  main( String A [] )
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

            CheckTrioMorphicLogic ctmlobj = new CheckTrioMorphicLogic( iNum );

            bRet = ctmlobj.isTrioMorphic();
            
            if( bRet == true )
            {

                System.out.println ( "The entered number " + iNum + " is triomorphic." );

            }
            else
            {

                System.out.println ( "The entered number " + iNum + " is not triomorphic." );


            }

        }   //  End Of Main()

}// End Of Class CheckTriomorphic


/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5           Output : Triomorphic
//  Input : 24          Output : Triomorphic 
//  Input : 25          Output : Triomorphic 
//  Input : 7           Output : Not Triomorphic 
//
/////////////////////////////////////////////////////////////////