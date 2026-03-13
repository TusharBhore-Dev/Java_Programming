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
        Create a Logic object and initialize iNum.
        In CheckPrimeRecursive helper function:
            Base Case 1: If iCnt exceeds iNum/2, return true (Prime).
            Base Case 2: If iNum is divisible by iCnt, return false (Composite).
            Recursive Case: Increment iCnt and call CheckPrimeRecursive again.
        Display result and release resources.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to check Prime status using 
//                Recursion with static counter.
//
/////////////////////////////////////////////////////////////////

class Logic 
{

    public int iNum = 0;        // Variable to store input number
    static int iCnt = 2;        // Static counter for recursion starting from 2

    // Parameterized constructor
    Logic( int iNo )
    {

        iNum = iNo;

    }   // End of Logic constructor

    // Helper function to check prime status using recursion
    public boolean CheckPrimeRecursive()
    {

        // Termination condition: check up to half of the number
        if( iCnt <= ( iNum / 2 ) )
        {

            // If divisible, it is not a prime number
            if( iNum % iCnt == 0 )
            {

                return false;

            }   // End of if

            iCnt++; // Increment counter for next recursive call

            // Recursive call to the same function
            return CheckPrimeRecursive();

        }   // End of if

        return true;

    }   // End of CheckPrimeRecursive helper function

}   // End of Logic Class

class Program_33
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////
    public static void main( String A [] )
    {

        int iNum = 0;           // Variable to store user input
        Scanner sobj = null;     // Scanner object reference
        
        sobj = new Scanner( System.in );

        System.out.println ( "Enter the number to check is it prime or composite :\t" );
        iNum = sobj.nextInt();

        // Validation: Handle zero
        if( iNum == 0 )
        {

            System.out.println("The zero is neither prime nor composite.");
            sobj.close();
            return;

        }   
        // Validation: Handle one
        else if( iNum == 1 )
        {

            System.out.println("The entered number "+iNum+" is not prime.");
            sobj.close();
            return;

        }   
        // Validation: Handle negative integers
        else if( iNum < 0 )
        {

            System.out.println("Error : Please provide positive number only.");
            sobj.close();
            return;

        }   

        Logic lobj = new Logic ( iNum );    // Creating object of Logic class

        // Checking the result from the recursive helper function
        if ( lobj.CheckPrimeRecursive() == false )
        {

            System.out.println("The entered number " +iNum+ " is not prime.");

        }   
        else
        {

            System.out.println("The entered number " +iNum+ " is prime.");

        }   

        lobj = null;    // Memory cleanup
        sobj.close();   // Resource cleanup

    }   // End of main entry point function

}   // End of Program_33 Class