/*
    Algorithm

    START
        Accept how many element user want to store
        Accept the elements from the user
        check each element from first element
        Strore the maximum element 
        Display the max element
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class FindMaxLogic
{

            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public FindMaxLogic( int iSize )
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
        //  Function Name : FindMaxiMumElement
        //  Description :   It is used to display the maximum element of array         
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            int FindMaxiMumElement( )
            {

                int iMax = 0;

                iMax = iArr[0];

                //  Counter will start from second element
                
                iCnt = 1;
                while( iCnt < iSize )
                {

                    if( iMax < iArr[ iCnt ] )
                    {

                        iMax = iArr[ iCnt ];

                    }

                    iCnt++; 

                }

                return iMax;

            }   // End of FindMaxiMumElement


};//    End Of Class FindMaxLogic


class FindMaxWhile
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
                
                FindMaxLogic fmlobj = new FindMaxLogic( iSize );
                fmlobj.AcceptElements();

                iRet = fmlobj.FindMaxiMumElement();

                System.out.println( "The maximum element is : " + iRet + " ." );

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();     


            }// End Of Main()


}//    End Of Class FindMaxWhile


/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//      
//      Enter how many elements you want to store : 5
//      Enter the elements :
//
//
//      Enter the element number 1 : 10 
//      Enter the element number 2 : 20
//      Enter the element number 3 : 30 
//      Enter the element number 4 : 40
//      Enter the element number 5 : 50
//
//      The maximum element is : 50.
//  
/////////////////////////////////////////////////////////////////
