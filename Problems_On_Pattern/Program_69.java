/////////////////////////////////////////////////////////
//////
////                       5    4    3    2    1
///     Expected Pattern : 5    4    3    2
//                         5    4    3
///                        5    4
////                       5
/////
/////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{

    public int iRow = 0 , iCol = 0 , k = 0;

    public Logic( int iR , int iC )
    {

        this.iRow = iR;
        this.iCol = iC;

    }

    public void DisplayPattern()
    {

        int i = 0 , j = 0 , k = iCol;

        for( i = 1; i <= iRow; i++ )
        {

            for( j = 1 , k = iCol; j <= ( ( iCol - i ) + 1 ) ; j++ , k-- )
            {


                System.out.printf( "%d\t" ,k );

                
            }

            System.out.println("");

        }

    }

}

class Program_69
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