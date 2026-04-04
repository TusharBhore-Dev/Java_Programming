/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the element to search in list
        Accept the elements from the user
        check each element from first element
        if the element is present display present   
        if not present then display not present

    STOP

*/

        /////////////////////////////////////////////////////////////////
        // 
        //  Required Packages
        //
        /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class LinearSearchLogic
{


            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public LinearSearchLogic( int iSize )
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
        //  Function Name : LinearSearch()
        //  Description :   It is used to search the element is present or not       
        //  Author :        Tushar Vikas Bhore.
        //  Date :          04/04/2026
        //
        /////////////////////////////////////////////////////////////////

            boolean LinearSearch( int iTrgt )
            {

                for( iCnt = 0; iCnt < iSize; iCnt++ )
                {

                    if( iArr[ iCnt ] == iTrgt )
                    {

                        break;  

                    }

                }

                return ( iCnt != iSize );

            } // End of LinearSearch()


};//   End Of Class LinearSearchLogic


class LinearSearchX
{

        /////////////////////////////////////////////////////////////////
        //
        //  Entry point function for the application
        //
        /////////////////////////////////////////////////////////////////

            public static void main( String A [] )
            {


                int iSize = 0 , iTarget = 0;
                boolean bRet = false;

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
                

                System.out.println( "Enter the number to search is it entered in list or not : " );
                iTarget = sobj.nextInt();

                LinearSearchLogic lslobj = new LinearSearchLogic( iSize );
                lslobj.AcceptElements();

                bRet = lslobj.LinearSearch( iTarget );

                if( bRet == true )
                {

                    System.out.println ( "The entered number is " + iTarget + " and it is present in the entered list." ) ;

                }
                else
                {

                    System.out.println ( "The entered number is " + iTarget + " and it is not present in the entered list." ) ;

                }

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();     


            }// End Of Main()


}//    End Of Class LinearSearchX


/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//  TestCase  : 1
//       
//  Enter how many elements you want to store :     6
//
//  Enter the number to search is it entered in list or not : 11
//  Enter the elements :
//
//  Enter the element number 1 :11
//  Enter the element number 2 :21
//  Enter the element number 3 :51
//  Enter the element number 4 :101
//  Enter the element number 5 :201
//  Enter the element number 6 :156
//
//  The entered number is 11 and it is present in the entered list.
//
//  TestCase : 2 
//
//  Enter how many elements you want to store :     -8
//  Error : Please enter the valid limit.( Positive only )
//
//  TestCase : 3
//  
//  Enter how many elements you want to store :     6
//
//  Enter the number to search is it entered in list or not : 11
//  Enter the elements :
//
//  Enter the element number 1 :2
//  Enter the element number 2 :
//  5
//  Enter the element number 3 :5
//  Enter the element number 4 :6
//  Enter the element number 5 :8
//  Enter the element number 6 :65
//
//  The entered number is 11 and it is not present in the entered list.
//
/////////////////////////////////////////////////////////////////

