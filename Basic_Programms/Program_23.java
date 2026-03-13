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
        Initialize iNum to 0 and iFact to 1 in the constructor.
        Call the Accept method to take a number from the user.
        Call the CalculateFactorial method:
            Use a loop (iCnt) starting from 1 up to iNum.
            Multiply the current value of iFact by iCnt in each iteration.
            Return the final value of iFact.
        Print the result and clean up memory.
    STOP
*/

/////////////////////////////////////////////////////////////////
//
//  Author      : Tushar vikas bhore
//  Date        : 04/03/2026
//  Description : Java program to calculate the factorial of a 
//                number using an Object-Oriented approach.
//
/////////////////////////////////////////////////////////////////

class Logic
{

    public int iNum ;
    public int iFact ;

        Logic()
        {

            iNum = 0;
            iFact = 1;

        }

        public void Accept()
        {

            Scanner sobj = null;  
            sobj = new Scanner( System.in );

            System.out.println( "Enter the number :\t" ); 
            iNum = sobj.nextInt();
    

        }

        int CalculateFactorial()
        {

            int iCnt = 0;

            for( iCnt = 1; iCnt <= iNum; iCnt++ )
            {

                iFact = iFact * iCnt;

            }

            return iFact;

        }

}   // End of Logic Class

class Program_23
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
        
        System.out.println( "The factorial of the number is : "+lobj.CalculateFactorial()+"." );

        lobj = null;

    }   // End of main

}   // End of Program_23 Class