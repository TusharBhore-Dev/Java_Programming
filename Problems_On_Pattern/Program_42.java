/////////////////////////////////////////////////////////
//////
////
///     Expected Pattern : 5    4   3   2   1
///
////
/////
/////////////////////////////////////////////////////////


import java.util.Scanner;

class Logic
{

    
    public static int iCnt = 0;

    public Logic( int iNum )
    {

        this.iCnt = iNum;

    }
    
    public void DisplayPatternRecursive()
    {


        if( iCnt >= 1 )
        {

            System.out.printf( "%d\t" ,iCnt );

            iCnt--;
            DisplayPatternRecursive();

        }

    }

}

class Program_42
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

        lobj.DisplayPatternRecursive();

        lobj = null;
        sobj.close();

        System.gc();

    }

}


