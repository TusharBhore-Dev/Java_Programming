/////////////////////////////////////////////////////////
//////
////
///     Expected Pattern : * * * * * *
//                         * * * * * *
///                        * * * * * *
////
/////
/////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{

    public int iRow = 0 , iCol = 0;

    public Logic( int iR , int iC )
    {

        this.iRow = iR;
        this.iCol = iC;

    }

    public void DisplayPattern()
    {

        int i = 0 , j = 0;

        i = 1;
        while( i <= iRow )
        {

            j = 1;
            while( j <= iCol )
            {

                System.out.printf( "*\t" );

                j++;
 
            }

            System.out.println("");
            i++;
        }

    }

}

class Program_52
{

    public static void main( String A [] )
    {

        int iRow = 0 , iCol = 0;

        Scanner sobj = new Scanner( System.in );

        System.out.println("Enter the number of rows you want :\t");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of coloms you want :\t");
        iCol = sobj.nextInt();

        if( iCol <= 0 || iRow <= 0 || iCol != iRow )
        {

            System.out.println( " Error : Please enter the positive and equal values only." );
            sobj.close();
            
            return;

        }

        Logic lobj = new Logic( iRow , iCol );

        lobj.DisplayPattern();

        lobj = null;
        sobj.close();

        System.gc();

    }

}