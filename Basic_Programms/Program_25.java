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
            Initialize loop counter iCnt to 1.
            Use a while loop to iterate until iCnt exceeds iNum.
            Multiply iFact by iCnt and increment iCnt in each step.
        Return and display the result.
        Close the scanner and nullify the object reference.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to calculate factorial using a 
//                while loop and parameterized constructor.
//
/////////////////////////////////////////////////////////////////

class Logic
{

    public int iNum ;
    public int iFact ;

        // Parameterized constructor to initialize characteristics
        Logic( int iNo )
        {

            iNum = iNo;
            iFact = 1;

        }

        // Method to calculate factorial using while loop
        int CalculateFactorial()
        {

            int iCnt = 0;

            iCnt = 1;

            while( iCnt <= iNum )
            {

                iFact = iFact * iCnt;
                iCnt++;

            }

            return iFact;

        }

}   // End of Logic Class

class Program_25
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

}   // End of Program_25 Class