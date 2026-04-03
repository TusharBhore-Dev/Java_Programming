/*

    Algorithm

    START
        
        Accept how many element user want to store
        Accept the elements from the user
        Add all the elements and divide the sum by total elements
        Display the average

    STOP

*/

        /////////////////////////////////////////////////////////////////
        // 
        //  Required Header files
        //
        /////////////////////////////////////////////////////////////////


    import java.util.Scanner;

class CalcAverageLogic
{

            //  Private static characteristics of the class.
            private int iSize;
            private int iCnt;
            private int iArr[];

            // Parameterized Constructor
            public CalcAverageLogic( int iSize )
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
        //  Function Name : CalcSummation()
        //  Description :   It is used to calculate the sum of all elements.    
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            int CalcSummation() 
            {

                int iSum = 0;

                //  Business Logic.
                iCnt = 0; 
                while( iCnt < iSize )
                {

                    iSum = iSum + iArr[ iCnt ];

                    iCnt++;

                }

                return iSum;

            }   // End of CalcSummation()

        /////////////////////////////////////////////////////////////////
        //
        //  Function Name : CalcAverage()
        //  Description :   It is used to calculate the average of all elements.    
        //  Author :        Tushar Vikas Bhore.
        //  Date :          03/04/2026
        //
        /////////////////////////////////////////////////////////////////

            float CalcAverage()
            {

                int iSumOfTotalEle = 0;
                float fAverage = 0.0f;

                //Business Logic.

                iSumOfTotalEle = CalcSummation();
                
                fAverage = iSumOfTotalEle / iSize;

                return fAverage;

            }// End Of CalcAverage()


}// End Of Class CalcAverageLogic

class CalcAverageWhile
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

        public static void main( String A [] )
        {

            
            int iSize = 0;

            float fRet = 0;
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

            CalcAverageLogic calobj = new CalcAverageLogic( iSize );
            calobj.AcceptElements();

            fRet = calobj.CalcAverage();

            System.out.println("The Average of the numbers is : " + fRet + " .\n");

            //  Deallocating the resources
            sobj.close();
            calobj = null;

            //  Call to garbage collector.
            System.gc();

        }// End Of Main()

}//     End Of Class CalcAverageWhile


/////////////////////////////////////////////////////////////////
//
//  Testcase succesfully handaled by the application
//
//  TestCase 1 : 
                    // Enter how many elements you want to store :     5

                    // Enter the elements :

                    // Enter the element number 1 :    1010

                    // Enter the element number 2 :    10

                    // Enter the element number 3 :
                    // 1010

                    // Enter the element number 4 :    1010

                    // Enter the element number 5 :    101

                    // The Average of the numbers is : 628 .

//  TestCase 2 : 
                    // Enter how many elements you want to store :     3

                    // Enter the elements :

                    // Enter the element number 1 :    30

                    // Enter the element number 2 :    30

                    // Enter the element number 3 :    30

                    // The Average of the numbers is : 30 .

/////////////////////////////////////////////////////////////////
