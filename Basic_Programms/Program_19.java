/*
    Algorithm

    START
        Accept first float number from user as fNumOne
        Accept second float number from user as fNumTwo
        Create object of Logic class and pass inputs to constructor
        Call Division method of Logic class
        Validate the denominator to handle division by zero
        Display the result of division or error message
        Clean up resources
    STOP
*/

/////////////////////////////////////////////////////////////////
// 
//  Required Classes / Packages
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Logic
//  Description : Contains arithmetic logic for float division
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{

    public float fNum1 = 0.0f;
    public float fNum2 = 0.0f;

    Logic( float fNo1 , float fNo2 )
    {

        this.fNum1 = fNo1;
        this.fNum2 = fNo2;

    }

    public float Division()
    {

        if( fNum2 == 0.0f )
        {

            return -1.0f;                   // Business Logic: Denominator check

        }
        else if( fNum1 == 0.0f )
        {

            return 0.0f;                    // Business Logic: Numerator is zero

        }
        else
        {

            float fAns = 0.0f;

            fAns = fNum1 / fNum2;           // Business Logic: Perform division

            return fAns;

        }

    }

}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_19
//  Description : Entry point class to handle float division
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_19
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main( String A [] )
    {

        float fNumOne = 0.0f , fNumTwo = 0.0f , fRetVal = 0.0f;

        Scanner sobj = null;

        sobj = new Scanner( System.in );

        System.out.println("Enter the first number :\t");
        fNumOne = sobj.nextFloat();

        System.out.println("Enter the second number :\t");
        fNumTwo = sobj.nextFloat();

        Logic lobj = new Logic( fNumOne , fNumTwo );

        fRetVal = lobj.Division();

        if( fRetVal == -1.0f )
        {

            System.out.println("The division by zero denominator is undefined.\n");

        }
        else
        {

            System.out.println("The division of "+fNumOne+" and "+fNumTwo+" is : "+fRetVal+".");

        }

        lobj = null;
        sobj.close();

    } // End of main

} // End of Program_19

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 25.0f       Input2 : 5.0f        Output : 5.0
//  Input1 : 10.0f       Input2 : 0.0f        Output : Undefined
//  Input1 : 0.0f        Input2 : 2.0f        Output : 0.0
//
/////////////////////////////////////////////////////////////////