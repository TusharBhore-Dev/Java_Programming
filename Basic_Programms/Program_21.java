/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////
import java.util.Scanner;

/*
    Algorithm
    START
        Accept an integer from the user via Scanner.
        Instantiate the Logic class with the user input.
        Check if the number is divisible by 2 using (iNum % 2 == 0).
        Directly return the boolean result to the caller.
        Print the result (Even/Odd) based on the return value.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Optimized Java program to check Even or Odd 
//                using boolean expression returns.
//
/////////////////////////////////////////////////////////////////

class Logic
{

    public int iNum = 0;

    Logic( int iNo )
    {

        this.iNum = iNo;

    }

    public boolean CheckEvenOROdd()
    {

        return ( iNum % 2 == 0 );

    }

}   // End of Logic Class

class Program_21
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


        System.out.println("Enter the number to check it is even or odd:\t");
        iNum = sobj.nextInt();

        Logic lobj = new Logic( iNum );

        if( lobj.CheckEvenOROdd() )
        {

            System.out.println("The entered number is "+iNum+" and it is even.");

        }
        else
        {

            System.out.println("The entered number is "+iNum+" and it is odd.");

        }

        sobj.close();
        lobj = null;

    }   // End of main

}   // End of Program_21 Class