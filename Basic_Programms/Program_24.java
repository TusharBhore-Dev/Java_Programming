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
        Initialize iNum via the constructor and set iFact to 1.
        Call CalculateFactorial:
            Loop from 1 to iNum.
            Multiply iFact by current loop counter.
        Return and display the result.
        Close the scanner and nullify the object reference.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to calculate factorial with input 
//                validation and parameterized constructor.
//
/////////////////////////////////////////////////////////////////

class Logic
{

    public int iNum ;
    public int iFact ;

        // Parameterized constructor
        Logic( int iNo )
        {

            iNum = iNo;
            iFact = 1;

        }

        // Method to perform the calculation logic
        int CalculateFactorial()
        {

            int iCnt = 0;

            for( iCnt = 1; iCnt <= iNum; iCnt++ )
            {

                iFact = iFact * iCnt;

            }

            return iFact;

        }

}   // End of Logic Class

class Program_24
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
    
        // Input validation for negative numbers
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

}   // End of Program_24 Class