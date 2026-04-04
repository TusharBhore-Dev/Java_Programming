/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the elements from the user
        add one to each element from first to last
        Display the all the elements

    STOP

*/

        /////////////////////////////////////////////////////////////////
        // 
        //  Required Header files
        //
        /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class IncrementElementLogic
{

            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public IncrementElementLogic( int iSize )
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
        //  Date :          04/04/2026
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
        //  Function Name : DisplayIncrement
        //  Description :   It is used to display the elements by incrementing the value by one         
        //  Author :        Tushar Vikas Bhore.
        //  Date :          04/04/2026
        //
        /////////////////////////////////////////////////////////////////

            void DisplayIncrement()
            {

                System.out.println ( "The elements are as follow : " ) ;

                // Business Logic
                for( iCnt = 0; iCnt < iSize ; iCnt++ )
                {

                    System.out.println( "The number " + iArr[ iCnt ] +" is incremented as : " + ( iArr[ iCnt ] + 1 )  + " ." ) ;

                }

            }   // End of DisplayIncrement


};//    End Of Class IncrementElementLogic

class IncrementElement
{

    
        /////////////////////////////////////////////////////////////////
        //
        //  Entry point function for the application
        //
        /////////////////////////////////////////////////////////////////

            public static void main( String A [] )
            {


                int iSize = 0;

                Scanner sobj = null;
                sobj = new Scanner( System.in );

                System.out.println( "Enter how many elements you want to store :\t" );
                iSize = sobj.nextInt();

                //  Input Validation
                if( iSize <= 0 )
                {

                    System.out.println( "Error : Please enter the valid input range." );

                    sobj.close();

                    System.gc();

                    return ;

                }  
                
                IncrementElementLogic ielobj  = new IncrementElementLogic( iSize );
                ielobj.AcceptElements();
                ielobj.DisplayIncrement();

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();     


            }// End Of Main()


}//  End Of Class IncrementElement


/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//  TestCase  : 1
//        
//        Enter how many elements you want to store :     7
//
//        Enter the elements :
//
//        Enter the element number 1 :    10
//
//        Enter the element number 2 :    20
//
//        Enter the element number 3 :    50
//
//        Enter the element number 4 :    100
//
//        Enter the element number 5 :    200
//
//        Enter the element number 6 :    500
//
//        Enter the element number 7 :    1000
//        The elements are as follow :
//        The number 10 is incremented as : 11.
//        The number 20 is incremented as : 21.
//        The number 50 is incremented as : 51.
//        The number 100 is incremented as : 101.
//        The number 200 is incremented as : 201.
//        The number 500 is incremented as : 501.
//        The number 1000 is incremented as : 1001.
//  TestCase : 2
//      
//        Enter how many elements you want to store :     -5
//        Error : Please provide positive value only.

/////////////////////////////////////////////////////////////////

