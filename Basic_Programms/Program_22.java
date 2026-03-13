/////////////////////////////////////////////////////////////////
// 
//  Required Packages
//
/////////////////////////////////////////////////////////////////
import java.util.Scanner;

/*
    Algorithm
    START
        Create an object of the Logic class.
        Call the Accept method to take three integers from the user.
        Call the CheckGreater method:
            Check if any numbers are equal; if so, show an error.
            Compare the first number with the other two.
            Compare the second number with the other two.
            If neither, the third number is the greatest.
        Clean up the object reference.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to find the largest of three 
//                distinct numbers using an OOP approach.
//
/////////////////////////////////////////////////////////////////

class Logic
{

    int iNumOne , iNumTwo , iNumThree;

    // Default constructor to initialize characteristics
    Logic()
    {

        iNumOne = 0;
        iNumTwo = 0;
        iNumThree = 0;

    }

    // Method to accept input from the user
    void Accept()
    {

        Scanner sobj = null;
        sobj = new Scanner( System.in );

        System.out.println("Enter the first number :\t");
        iNumOne = sobj.nextInt();

        System.out.println("Enter the second number :\t");
        iNumTwo = sobj.nextInt();

        System.out.println("Enter the third number :\t");
        iNumThree = sobj.nextInt();


    }


    // Method to find and display the largest number
    void CheckGreater()
    {

        // Validation for distinct numbers
        if( ( iNumOne == iNumTwo ) || ( iNumTwo == iNumThree ) || ( iNumOne == iNumThree ) )
        {

            System.out.println( "Error : Don't enter the equal numbers.\n" );

        }
        else if( iNumOne > iNumTwo && iNumOne > iNumThree )
        {

            System.out.println( "The "+ iNumOne +" is greater.\n" );

        }
        else if( iNumTwo > iNumOne && iNumTwo > iNumThree )
        {

            System.out.println( "The "+ iNumTwo +" is greater." );

        }
        else
        {

            System.out.println( "The "+ iNumThree +" is greater." );

        }

    }

}   // End of Logic Class

class Program_22
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////
    public static void main( String A [] )
    {

        Logic lobj = new Logic();
        lobj.Accept();
        lobj.CheckGreater();

        lobj = null;

    }   // End of main

}   // End of Program_22 Class