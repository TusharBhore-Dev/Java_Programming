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
        Create an object of Logic class and pass the number to the constructor.
        Check parity using (number % 2 == 0).
        Display "Even" if true, else "Odd".
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Program to check if a number is Even or Odd using OOP.
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

        if( iNum % 2 == 0 )
        {

            return true;

        }
        else
        {

            return false;

        }

    }

}   // End of Logic Class

class Program_20
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////
    public static void main( String A [] )
    {

        int iNum = 0;
        boolean bRet = false;

        Scanner sobj = null;

        sobj = new Scanner( System.in );


        System.out.println("Enter the number to check it is even or odd:\t");
        iNum = sobj.nextInt();

        Logic lobj = new Logic( iNum );

        bRet = lobj.CheckEvenOROdd();

        if( bRet == true )
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

}   // End of Program_20 Class