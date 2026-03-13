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
            Initialize counter iCnt to 2.
            Use a while loop to iterate while iCnt is less than iNum.
            If iNum is divisible by iCnt (iNum % iCnt == 0):
                Return false immediately (Composite).
            Increment iCnt.
            If the loop completes without finding a divisor, return true (Prime).
        Display result and clean up resources.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to check if a number is Prime or 
//                Composite using a while loop.
//
/////////////////////////////////////////////////////////////////

class Logic 
{

    public int iNum = 0;

    // Parameterized constructor
    Logic( int iNo )
    {

        iNum = iNo;

    }

    // Method to check prime status using while loop
    public boolean CheckPrime()
    {

        int iCnt = 0;

        iCnt = 2;

        while( iCnt < iNum )
        {

            if( iNum % iCnt == 0 )
            {

                return false;

            }

            iCnt++;

        }

        return true;

    }

}   // End of Logic Class

class Program_30
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

        // Edge case validation and early exit
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

}   // End of Program_30 Class