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
        Validate for edge cases (0, 1, and negative numbers).
        Create a Logic object and pass the input.
        In CheckPrime:
            Start counter iCnt at 2.
            Loop while iCnt is less than or equal to iNum / 2.
            If iNum % iCnt is 0, it is not prime.
        Return result and display to user.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to check Prime status using a 
//                while loop and optimized N/2 iterations.
//
/////////////////////////////////////////////////////////////////

class Logic 
{

    public int iNum = 0;    // Characteristic to store input number

    // Parameterized constructor
    Logic( int iNo )
    {

        iNum = iNo;

    }   // End of Logic constructor

    // Helper function to check prime status
    public boolean CheckPrime()
    {

        int iCnt = 0;       // Variable for loop counter

        iCnt = 2;

        // Optimized loop: only checks up to half of the number
        while( iCnt <= ( iNum / 2 ) )
        {

            if( iNum % iCnt == 0 )
            {

                return false;

            }   

            iCnt++;

        }   // End of while loop

        return true;

    }   // End of CheckPrime helper function

}   // End of Logic Class

class Program_32
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////
    public static void main( String A [] )
    {

        int iNum = 0;       // Variable to store user input
        Scanner sobj = null; // Scanner object reference
        
        sobj = new Scanner( System.in );

        System.out.println ( "Enter the number to check is it prime or composite :\t" );
        iNum = sobj.nextInt();

        // Validation for zero
        if( iNum == 0 )
        {

            System.out.println("The zero is neither prime nor composite.");
            sobj.close();
            return;

        }   
        // Validation for one
        else if( iNum == 1 )
        {

            System.out.println("The entered number "+iNum+" is not prime.");
            sobj.close();
            return;

        }   
        // Validation for negative integers
        else if( iNum < 0 )
        {

            System.out.println("Error : Please provide positive number only.");
            sobj.close();
            return;

        }   

        Logic lobj = new Logic ( iNum );    // Creating object of Logic class

        // Call the helper function and display result
        if ( lobj.CheckPrime() == false )
        {

            System.out.println("The entered number " +iNum+ " is not prime.");

        }   
        else
        {

            System.out.println("The entered number " +iNum+ " is prime.");

        }   

        lobj = null;    // Deallocating object reference
        sobj.close();   // Closing scanner resource

    }   // End of main entry point function

}   // End of Program_32 Class