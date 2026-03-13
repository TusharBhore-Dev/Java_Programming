/*
    Algorithm

    START
        Accept first float number from user as fNum1
        Accept second float number from user as fNum2
        Create object of Logic class and pass inputs to constructor
        Call multiplication method of Logic class
        Display the result of multiplication
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
//  Description : Contains arithmetic logic for float multiplication
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{

    float fNum1 = 0.0f, fNum2 = 0.0f;

    Logic(float fNo1, float fNo2)
    {
        this.fNum1 = fNo1;
        this.fNum2 = fNo2;
    }

    public float multiplication()
    {
        float fAns = 0.0f;

        fAns = fNum1 * fNum2;               // Business Logic: Multiplication
        
        return fAns;
    }

}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_15
//  Description : Entry point class to handle float multiplication
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_15
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        float fNum1 = 0.0f, fNum2 = 0.0f, fAns = 0.0f;

        Scanner sobj = new Scanner(System.in);      // Resource allocation

        System.out.println("Enter the first number :\t");
        fNum1 = sobj.nextFloat();

        System.out.println("Enter the second number :\t");
        fNum2 = sobj.nextFloat();

        Logic lobj = new Logic(fNum1, fNum2);       // Object creation

        fAns = lobj.multiplication();               // Method call

        System.out.println("The multiplication of "+fNum1+" and "+fNum2+" is : "+fAns+".");

        lobj = null;
        sobj.close();                               // Closing resource

    } // End of main
    
} // End of Program_15

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 1.5         Input2 : 2.0         Output : 3.0
//  Input1 : 10.0        Input2 : 0.5         Output : 5.0
//
/////////////////////////////////////////////////////////////////