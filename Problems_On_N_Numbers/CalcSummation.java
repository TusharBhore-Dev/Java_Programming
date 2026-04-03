/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the elements from the user
        add each element from first element to last
        Display the summation of all the elements

    STOP

*/

        /////////////////////////////////////////////////////////////////
        // 
        //  Required Packages
        //
        /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CalcSummationLogic
{

            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public CalcSummationLogic( int iSize )
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
        //  Function Name : CalcSummation
        //  Description :   It is used to display the summation of all      
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            int CalcSummation( )
            {

                int iSum = 0;

                //  Business Logic.
                for( iCnt = 0; iCnt < iSize; iCnt++ )
                {

                    iSum = iSum + iArr[ iCnt ];

                }

                return iSum;

            } // End of CalcSummation


};//    End Of Class CalcSummationLogic


class CalcSummation
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
                
                CalcSummationLogic csobj = new CalcSummationLogic( iSize );
                csobj.AcceptElements();

                iRet = csobj.CalcSummation();

                System.out.println( " The summation of all the entered elements is : " + iRet + " ." );

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();

            }// End Of MAIN()


}//    End Of Class CalcSummation


/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//      TestCase  : 1
//      Enter how many elements you want to store :     7
//
//
//      Enter the elements :
//      Enter the number 1 :    10
//
//      Enter the number 2 :    50
//
//      Enter the number 3 :    62
//
//      Enter the number 4 :    62
//
//      Enter the number 5 :    51
//
//      Enter the number 6 :    51
//
//      Enter the number 7 :    21
//      The summation of all the entered elements is : 307.
//
//      
//      TestCase : 2
//    
//      Enter how many elements you want to store :     -5
//
//      Error : Please provide the valid input.( Positive Only )
//
//      TestCase : 3
// 
//      Enter how many elements you want to store :     5
//
//
//      Enter the elements :
//      Enter the number 1 :    1
//
//      Enter the number 2 :    2
//
//      Enter the number 3 :    3
//
//      Enter the number 4 :    5
//
//      Enter the number 5 :    5
//      The summation of all the entered elements is : 16.
//
//
/////////////////////////////////////////////////////////////////
