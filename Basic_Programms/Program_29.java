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
            Initialize a loop from 2 up to iNum - 1.
            In each iteration, check if iNum is divisible by iCnt.
            If divisible (remainder is 0), return false (not prime).
            If loop completes without any division, return true (prime).
        Display result based on return value.
        Clean up resources.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to check if a number is Prime or 
//                Composite using an Object-Oriented approach.
//
/////////////////////////////////////////////////////////////////

class Logic 
{

    public int iNum = 0;

    // Parameterized constructor to initialize the number
    Logic( int iNo )
    {

        iNum = iNo;

    }

    // Method to check prime status
    public boolean CheckPrime()
    {

        int iCnt = 0;

        // Loop starts from 2 because every number is divisible by 1
        for( iCnt = 2; iCnt < iNum; iCnt++ )
        {

            if( iNum % iCnt == 0 )
            {

                return false; // Found a factor, so not prime

            }

        }

        return true; // No factors found

    }

}   // End of Logic Class

class Program_29
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

        System.out.println ( "Enter the number to check is it prime or composite :\t" );
        iNum = sobj.nextInt();

        // Edge case validation
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

        Logic lobj = new Logic ( iNum );

        // Checking result from the logic class
        if ( lobj.CheckPrime() == false )
        {

            System.out.println("The entered number " +iNum+ " is not prime.");

        }
        else
        {

            System.out.println("The entered number " +iNum+ " is prime.");

        }

        lobj = null;
        sobj.close();

    }   // End of main

}   // End of Program_29 Class