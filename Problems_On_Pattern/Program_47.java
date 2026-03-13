/////////////////////////////////////////////////////////
//////
////
///     Expected Pattern : 1    $   3   $   5   $
//                         1    $   3   $   5   $
///                        1    $   3   $   5   $
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

        for( i = 1; i <= iRow; i++ )
        {

            for( j = 1; j <= iCol; j++ )
            {

                if( j % 2 == 0 )
                {

                    System.out.printf( "$\t" );

                }
                else
                {

                    System.out.printf( "%d\t" ,j );

                }

            }

            System.out.println("");

        }

    }


}

class Program_47
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