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
        If number > 1, create an object of the Logic class.
        Call CheckPrime:
            Iterate from 2 up to iNum / 2.
            If a divisor is found, it's not prime.
        Display result and clean up memory.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to check Prime status with 
//                detailed variable and function documentation.
//
/////////////////////////////////////////////////////////////////

class Logic 
{

    public int iNum = 0;    // Variable to store the input number

    // Parameterized constructor
    Logic( int iNo )
    {

        iNum = iNo;

    }   // End of Logic constructor

    // Method to check prime status
    public boolean CheckPrime()
    {

        int iCnt = 0;   // Loop counter variable

        // Optimization: Loop up to iNum/2
        for( iCnt = 2; iCnt <= ( iNum / 2 ); iCnt++ )
        {

            if( iNum % iCnt == 0 )
            {

                return false;

            }   

        }   

        return true;

    }   // End of CheckPrime method

}   // End of Logic Class

class Program_31
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////
    public static void main( String A [] )
    {

        int iNum = 0;       // Variable to store user input
        Scanner sobj = null; // Scanner object reference for input

        sobj = new Scanner( System.in );

        System.out.println ( "Enter the number to check is it prime or composite :\t" );
        iNum = sobj.nextInt();

        // Validation for non-prime candidates
        if( iNum == 0 )
        {

            System.out.println("The zero is neither prime nor composite.");
            sobj.close();
            return;

        }   
        else if( iNum == 1 )
        {

            System.out.println("The entered number "+iNum+" is not prime.");
            sobj.close();        
            return;

        }   
        else if( iNum < 0 )
        {

            System.out.println("Error : Please provide positive number only.");
            sobj.close();
            return;

        }   

        Logic lobj = new Logic ( iNum );    // Logic class object creation

        if ( lobj.CheckPrime() == false )
        {

            System.out.println("The entered number " +iNum+ " is not prime.");

        }   
        else
        {

            System.out.println("The entered number " +iNum+ " is prime.");

        }   

        lobj = null;    // Memory cleanup
        sobj.close();   // Resource cleanup

    }   // End of main function

}   // End of Program_31 Class