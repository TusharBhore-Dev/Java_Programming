/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////
import java.util.Scanner;

/*
    Algorithm
    START
        Accept a number from the user.
        Validate if the number is negative; if so, show an error.
        If positive, create an object of the Logic class.
        Initialize iNum and iFact (set to 1) via the constructor.
        Call CalculateFactorial:
            Use a while loop that continues as long as iNum is >= 1.
            Multiply iFact by the current value of iNum.
            Decrement iNum in each iteration (Count-down approach).
        Return and display the result.
        Clean up resources (Scanner and Object reference).
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to calculate factorial using a 
//                decrementing while loop.
//
/////////////////////////////////////////////////////////////////

class Logic
{

    public int iNum ;
    public int iFact ;

        // Parameterized constructor to initialize members
        Logic( int iNo )
        {

            iNum = iNo;
            iFact = 1;

        }

        // Method to calculate factorial using decrementing logic
        int CalculateFactorial()
        {

            // No extra counter variable needed as we use the class member iNum
            while( iNum >= 1 )
            {

                iFact = iFact * iNum;
                iNum--;

            }

            return iFact;

        }

}   // End of Logic Class

class Program_26
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////
    public static void main( String A [] )
    {

        int iNum = 0;

        Scanner sobj = null;  
        sobj = new Scanner( System.in );

        System.out.println( "Enter the number :\t" ); 
        iNum = sobj.nextInt();
    
        // Input validation
        if( iNum < 0 )
        {

            System.out.println( "Error : Please enter positive number only." );

            sobj.close();

        }
        else
        {
            
            Logic lobj = new Logic( iNum );

            System.out.println( "The factorial of the number is : "+lobj.CalculateFactorial()+"." );

            lobj = null;
            sobj.close();

        }
        
    }   // End of main

}   // End of Program_26 Class