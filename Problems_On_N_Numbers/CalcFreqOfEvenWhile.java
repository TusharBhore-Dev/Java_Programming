/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the elements from the user
        check each element from first element
        calculate the frequency of even number  
        Display the frequency of even numbers

    STOP

*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CalcFrequencyOfEvenLogic
{

            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public CalcFrequencyOfEvenLogic( int iSize )
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
        //  Function Name : CalcFrequencyOfEven()
        //  Description :   It is used to display the count frequency of even        
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            int CalcFrequencyOfEven()
            {

                int iCountFreq = 0;

                //  Business Logic
                for( iCnt = 0; iCnt < iSize; iCnt++ )
                {

                    //  condition to check the element is even or not
                    if( ( iArr[ iCnt ] % 2 ) == 0 )
                    {

                        iCountFreq++;

                    }

                }

                return iCountFreq;

            }   // End of CalcFrequencyOfEven
    

};//   End Of Class CalcFrequencyOfEvenLogic


class CalcFreqOfEvenWhile
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

                CalcFrequencyOfEvenLogic cfoelobj = new CalcFrequencyOfEvenLogic( iSize );

                cfoelobj.AcceptElements();

                iRet = cfoelobj.CalcFrequencyOfEven();

                System.out.println( "The frequency of the even number is : "+ iRet + " ." );

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();

            }// End OF Main()

}// End OF class CalcFreqOfEvenWhile

/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//  TestCase 1 : 
//
//        Enter how many elements you want to store :     7
//        Enter the elements :
//
//        Enter the element number 1 : 15
//
//        Enter the element number 2 : 45
//
//        Enter the element number 3 : 85
//
//        Enter the element number 4 : 79
//
//        Enter the element number 5 : 84
//
//        Enter the element number 6 : 56
//
//        Enter the element number 7 : 78
//
//        The frequency of the even number is : 3.
//
//  TestCase 2 :
//      
//      Enter how many elements you want to store :     -5
//      Error : Please enter the valid input range.
//
//  TestCase 3 :
// 
//      Enter how many elements you want to store :     5
//      Enter the elements :
//
//      Enter the element number 1 : 10
//
//      Enter the element number 2 : 50
//
//      Enter the element number 3 : 865
//
//      Enter the element number 4 : 85
//
//      Enter the element number 5 : 56
//
//      The frequency of the even number is : 3.
//
/////////////////////////////////////////////////////////////////

