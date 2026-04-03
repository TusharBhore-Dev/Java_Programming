/*

    Algorithm

        START
            
            Accept how many element user want to store
            Accept the elements from the user
            Accept the number to count its frequency
            check each element from first element
            calculate the frequency of entered number  
            Display the frequency of that element

        STOP

*/

        /////////////////////////////////////////////////////////////////
        // 
        //  Required Header files
        //
        /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CalcFrequencyLogic
{

            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public CalcFrequencyLogic( int iSize )
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
                for( iCnt = 0; iCnt < iSize; iCnt++ )
                {

                    System.out.println ( "Enter the element number " + ( iCnt + 1 ) + " :\t" );

                    iArr[ iCnt ] = sobj.nextInt(); 

                }

                //  Deallocating Resources
                sobj.close();


            }// End Of AcceptElements()

        /////////////////////////////////////////////////////////////////
        //
        //  Function Name : CalcFrequency()
        //  Description :   It is used to calculate the frequency of number        
        //  Author :        Tushar Vikas Bhore.
        //  Date :          04/04/2026
        //
        /////////////////////////////////////////////////////////////////

            int CalcFrequency( int iTrgt )
            {

                int  iFreq = 0;

                //  Business Logic.
                for( iCnt = 0; iCnt < iSize; iCnt++ )
                {

                    if( iArr[ iCnt ] == iTrgt )
                    {

                        iFreq++;

                    }

                }

                return iFreq;

            }   // End of CalcFrequency


};//    End Of Class CalcFrequencyLogic


class CalcFrequency
{

        /////////////////////////////////////////////////////////////////
        //
        //  Entry point function for the application
        //
        /////////////////////////////////////////////////////////////////

            public static void main( String A [] )
            {


                int iSize = 0 , iRet = 0 , iTrgt = 0;

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

                System.out.println( "Enter the number to find its frequency :\t" );
                iTrgt = sobj.nextInt();
                
                //  input validation
                if( iTrgt <= 0 )
                {

                    System.out.println( "Error : Please enter the valid element to find the frequency." );

                    sobj.close();
                    System.gc();

                    return ;

                }


                CalcFrequencyLogic cflobj = new CalcFrequencyLogic( iSize );

                cflobj.AcceptElements();

                iRet = cflobj.CalcFrequency( iTrgt );

                System.out.println( "The frequency of the number " + iTrgt + " is : " + iRet + " ." );

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();


            }// End Of Main()

}// End Of Class CalcFrequency

/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//      TestCase  : 1
//      
//
//      Enter how many elements you want to store :     10
//      Enter the number to find its frequency :        21
//      Enter the elements :
//
//      Enter the element number 1 : 11
//
//      Enter the element number 2 : 21
//
//      Enter the element number 3 : 51
//
//      Enter the element number 4 : 12
//
//      Enter the element number 5 : 21
//
//      Enter the element number 6 : 21
//
//      Enter the element number 7 : 101
//
//      Enter the element number 8 : 141
//
//      Enter the element number 9 : 21
//
//      Enter the element number 10 : 12
//      The frequency of the number 21 is : 4.
//
//      
//      TestCase : 2
//    
//      Enter how many elements you want to store :     5
//      Enter the number to find its frequency :        3
//      Enter the elements :
//
//      Enter the element number 1 : 45
//
//      Enter the element number 2 : 5
//
//      Enter the element number 3 : 5
//
//      Enter the element number 4 : 5
//
//      Enter the element number 5 : 55
//
//      The frequency of the number 3 is : 0.
//
/////////////////////////////////////////////////////////////////

