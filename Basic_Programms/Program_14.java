/*
    Algorithm

    START
        Accept first integer from user as iNum1
        Accept second integer from user as iNum2
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
//  Description : Contains arithmetic logic for multiplication
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Logic
{
    
    int iNum1 = 0, iNum2 = 0;

    Logic(int iNo1, int iNo2)
    {
        this.iNum1 = iNo1;
        this.iNum2 = iNo2;
    }

    public int multiplication()
    {
        int iAns = 0;

        iAns = iNum1 * iNum2;               // Business Logic: Multiplication
        
        return iAns;
    }

}

/////////////////////////////////////////////////////////////////
//
//  Class Name :  Program_14
//  Description : Entry point class to handle integer multiplication
//  Author :      Tushar vikas bhore
//  Date :        24/02/2026
//
/////////////////////////////////////////////////////////////////

class Program_14
{

    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function for the application
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {

        int iNum1 = 0, iNum2 = 0, iAns = 0;

        Scanner sobj = new Scanner(System.in);      // Resource allocation

        System.out.println("Enter the first number :\t");
        iNum1 = sobj.nextInt();

        System.out.println("Enter the second number :\t");
        iNum2 = sobj.nextInt();

        Logic lobj = new Logic(iNum1, iNum2);       // Object creation

        iAns = lobj.multiplication();               // Method call

        System.out.println("The multiplication of "+iNum1+" and "+iNum2+" is : "+iAns+".");

        lobj = null;
        sobj.close();                               // Closing resource

    } // End of main

} // End of Program_14

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input1 : 10          Input2 : 5           Output : 50
//  Input1 : -4          Input2 : 8           Output : -32
//
/////////////////////////////////////////////////////////////////