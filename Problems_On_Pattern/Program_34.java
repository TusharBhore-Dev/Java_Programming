
/////////////////////////////////////////////////////////
//////
////
///     Expected Pattern : 1    2   3   4   5
///
////
/////
/////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{

    public int iLimit = 0;

    public Logic( int iNum )
    {

        this.iLimit = iNum;

    }

    public void DisplayPattern()
    {

        int iCnt = 0;

        for( iCnt = 1; iCnt <= iLimit; iCnt++ )
        {

            System.out.printf( "%d\t" ,iCnt );

        }

        System.out.println("");

    }

}

class Program_34
{

    public static void main( String A [] )
    {

        int iLimit = 0;

        Scanner sobj = null;
        sobj = new Scanner( System.in );

        System.out.println( "Enter the limit :\t" );
        iLimit = sobj.nextInt();

        if( iLimit <= 0)
        {

            System.out.println( " Error : Please enter the non zero and positive input limit." );
            sobj.close();
            return;

        }

        Logic lobj = new Logic( iLimit );

        lobj.DisplayPattern();

        lobj = null;
        sobj.close();

        System.gc();

    }

}

