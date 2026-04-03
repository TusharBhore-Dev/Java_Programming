/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the elements from the user
        multiply each element from  list
        Display the product of all the elements

    STOP

*/

        /////////////////////////////////////////////////////////////////
        // 
        //  Required Packages
        //
        /////////////////////////////////////////////////////////////////

import java.util.Scanner;

class CalcProductLogic
{

            //  Private Static characteristics of class.
            private int iCnt ;
            private int iArr[] ;
            private int  iSize;

            // Parameterized Constructor
            public CalcProductLogic( int iSize )
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
        //  Function Name : CalcProductOfAllEle()
        //  Description :   It is used to display the product of all      
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            double CalcProductOfAllEle()
            {

                double dProduct = 1.0;

                //  Business Logic
                for( iCnt = 0; iCnt < iSize; iCnt++ )
                {

                    dProduct = dProduct * ( iArr[ iCnt ] );

                }

                return dProduct;

            }   // End of CalcProductLogic


};// End Of Class CalcProductLogic

class CalcProduct
{


        /////////////////////////////////////////////////////////////////
        //
        //  Entry point function for the application
        //
        /////////////////////////////////////////////////////////////////

            public static void main( String A [] )
            {

                int iSize = 0 ; 
                double dRet = 0.0;

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

                CalcProductLogic cplobj = new CalcProductLogic( iSize );

                cplobj.AcceptElements();

                dRet = cplobj.CalcProductOfAllEle();

                System.out.println( "The product of all elements is : " + dRet + " ." );

                //  Deallocating the resources
                sobj.close();

                //Call to the garbage collector
                System.gc();


            }//     End Of Main()

}//    End Of CalcProduct

/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//      TestCase  : 1
//      Enter how many elements you want to store :     5
//
//      Enter the elements :
//
//      Enter the number 1 : 10
//
//      Enter the number 2 : 20
//
//      Enter the number 3 : 30
//
//      Enter the number 4 : 40
//
//      Enter the number 5 : 50
//      The product of all elements is : 12000000.000000.
//
//
//       TestCase : 2 
//      Enter how many elements you want to store :     -5
//      Error : Please provide the valid limit.
//
//      TestCase : 3
//      Enter how many elements you want to store :     5
//
//      Enter the elements :
//
//      Enter the number 1 : 4
//
//      Enter the number 2 : 2
//
//      Enter the number 3 : 3
//
//      Enter the number 4 : 51
//
//      Enter the number 5 : 64
//      The product of all elements is : 78336.000000.
/////////////////////////////////////////////////////////////////
