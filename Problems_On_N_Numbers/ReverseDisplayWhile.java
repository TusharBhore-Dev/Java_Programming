/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the elements from the user
        Display the elements in reverse order

    STOP

*/

        /////////////////////////////////////////////////////////////////
        // 
        //  Required Packages
        //
        /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ReverseDisplayLogic
{


            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public ReverseDisplayLogic( int iSize )
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
        //  Function Name : ReverseDisplay()
        //  Description :   It is used to display the elements in reverse order       
        //  Author :        Tushar Vikas Bhore.
        //  Date :          04/04/2026
        //
        /////////////////////////////////////////////////////////////////

            void ReverseDisplay( )
            {

                System.out.println ( "The elements of the array in reverse order are as follow : " ) ;
                
                iCnt = ( iSize - 1 );
                while( iCnt > -1 )
                {

                    System.out.printf ( "\n | %d | \n" , iArr[ iCnt ] ) ;

                    iCnt--; 

                }

            }   // End of ReverseDisplay

};//    End Of Class ReverseDisplayLogic

        /////////////////////////////////////////////////////////////////
        //
        //  Entry point function for the application
        //
        /////////////////////////////////////////////////////////////////

class ReverseDisplayWhile
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
                
                ReverseDisplayLogic rdlobj  = new ReverseDisplayLogic( iSize );
                rdlobj.AcceptElements();
                rdlobj.ReverseDisplay();

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();     


            }// End Of Main()

}  //  End Of Class ReverseDisplayWhile


/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//  TestCase  : 1
//      
//    Enter how many elements you want to store :     6
//      Enter the elements :
//
//      Enter the number 1 :    11
//
//      Enter the number 2 :    21
//
//      Enter the number 3 :    51
//
//      Enter the number 4 :    101
//
//      Enter the number 5 :    201
//
//      Enter the number 6 :    301
//      The elements of the array in reverse order are as follow :
//
//      | 301 |
//      | 201 |
//      | 101 |
//      | 51 |
//      | 21 |
//      | 11 |
//
//      TestCase : 2
//      Enter how many elements you want to store :     -5
//      Error : Please provide valid input only.( Positive only )
//
//      TestCase : 3
//      Enter how many elements you want to store :     3
//      Enter the elements :
//
//      Enter the number 1 :    11
//
//      Enter the number 2 :    21
//
//      Enter the number 3 :    50
//      The elements of the array in reverse order are as follow :
//
//      | 50 |
//      | 21 |
//      | 11 |
//
/////////////////////////////////////////////////////////////////

