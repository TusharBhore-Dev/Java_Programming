/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the elements from the user
        check each element from first element
        calculate the frequency of odd number  
        Display the frequency of odd numbers

    STOP

*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////


import java.util.Scanner;


class CalcFrequencyOfOddLogic
{

            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public CalcFrequencyOfOddLogic( int iSize )
            {

                this.iSize = iSize;
                this.iCnt = 0;
                this.iArr = new int[ iSize ];

            }// End Of Parameterized Constructor

        /////////////////////////////////////////////////////////////////
        //
        //  Function Name : AcceptElements()
        //  Description :   It is used to accept the n numbers from the user.    
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            public void AcceptElements()
            {

                System.out.println( "Endter the elements :\t" );

                Scanner sobj = new Scanner( System.in );

                
                //  LOGIC TO ACCEPT THE N ELEMENTS
                iCnt = 0;
                while( iCnt < iSize )
                {

                    System.out.println ( "Enter the element number " + ( iCnt + 1 ) + " :\t" );

                    iArr[ iCnt ] = sobj.nextInt(); 

                    iCnt++;

                }

                //  Deallocating Resources
                sobj.close();


            }// End Of AcceptElements()

        /////////////////////////////////////////////////////////////////
        //
        //  Function Name : CalcFrequencyOfOdd()
        //  Description :   It is used to display the count frequency of odd elements        
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            int CalcFrequencyOfOdd()
            {

                int iCountFreq = 0;

                //  Business Logic
                iCnt = 0; 
                while( iCnt < iSize )
                {

                    //  condition to check the element is odd or not
                    if( ( iArr[ iCnt ] % 2 ) != 0 )
                    {

                        iCountFreq++;

                    }

                    iCnt++; 
                }

                return iCountFreq;

            }   // End of CalcFrequencyOfOdd
    

};//   End Of Class CalcFrequencyOfOddLogic


class CalcFreqOfOddWhile
{

        /////////////////////////////////////////////////////////////////
        //
        //  Entry point function for the application
        //
        /////////////////////////////////////////////////////////////////

            public static void main( String A [] )
            {


                int iSize = 0 , iRet = 0;

                Scanner sobj = null;
                sobj = new Scanner( System.in );

                System.out.println( "Enter how many elements you want to store :\t" );
                iSize = sobj.nextInt();

                //  Input Validation
                if( iSize <= 0 )
                {

                    System.out.println( "Error : Please enter the valid input range." );

                    sobj.close();

                    return ;

                }   

                CalcFrequencyOfOddLogic cfoolobj = new CalcFrequencyOfOddLogic( iSize );

                cfoolobj.AcceptElements();

                iRet = cfoolobj.CalcFrequencyOfOdd();

                System.out.println( "The frequency of the odd number is : "+ iRet + " ." );

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();


            }// End Of Main()

}// End Of Class CalcFreqOfOddWhile

/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//  TestCase 1 : 
//
//   Enter how many elements you want to store :     10
//   Enter the elements :
//
//   Enter the element number 1 : 52
//
//   Enter the element number 2 : 25
//
//   Enter the element number 3 : 46
//
//   Enter the element number 4 : 84
//
//   Enter the element number 5 : 58
//
//   Enter the element number 6 : 85
//
//   Enter the element number 7 : 95
//
//   Enter the element number 8 : 69
//
//   Enter the element number 9 : 56
//
//   Enter the element number 10 : 85
//
//   The frequency of the odd numbers is : 5.
//
//  TestCase 2 :
//  
//  Enter how many elements you want to store :     -6
//  Error : Please enter the valid input range.
//
/////////////////////////////////////////////////////////////////

