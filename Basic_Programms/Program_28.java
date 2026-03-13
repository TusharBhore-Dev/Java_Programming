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
        Validate if the number is negative.
        If positive, create an object of the Logic class.
        Initialize iNum and iFact via the constructor.
        Call CalculateFactorial (Recursive Approach):
            Base Case: If iNum is less than 1, return the current iFact.
            Recursive Case: 
                Multiply iFact by iNum.
                Decrement iNum.
                Call CalculateFactorial again.
        Display the result.
        Clean up resources.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to calculate factorial using 
//                Recursion and static variables.
//
/////////////////////////////////////////////////////////////////

class Logic
{

    public int iNum ;
    public static int iFact ;

        // Parameterized constructor
        Logic( int iNo )
        {

            iNum = iNo;
            iFact = 1;

        }

        // Recursive method to calculate factorial
        int CalculateFactorial()
        {

            if( iNum >= 1 )
            {

                iFact = iFact * iNum;
                iNum--;

                // Recursive call
                CalculateFactorial();

            }

            return iFact;

        }

}   // End of Logic Class

class Program_28
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

}   // End of Program_28 Class