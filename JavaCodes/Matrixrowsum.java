//find
//Display Addition  of seprate row
//Addition of Diagonal
import java.util.*;

class Matrix
{
    public int iRow, iCol;
    public int Arr[][];
    
    public Matrix(int A, int B)
    {
        this.iRow = A;
        this.iCol = B;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the data : ");

        int i = 0, j = 0;

        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Dissplay()
    {
        int i = 0, j = 0;

        System.out.println("Elements from the matrix : ");
        
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    int Summation()
    {
        int iSum = 0;
        int i = 0, j = 0;

        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }

        return iSum;
    }

    public int Maximum()
    {
        int iMax = 0, i = 0, j = 0;
        
        iMax = Arr[0][0];   // IMP

        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(iMax < Arr[i][j])
                {
                    iMax = Arr[i][j];
                }
            }
        }

        return iMax;
    }

    public int Minimum()
    {
        int iMin = 0, i = 0, j = 0;
        
        iMin = Arr[0][0];   // IMP

        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(iMin > Arr[i][j])
                {
                    iMin = Arr[i][j];
                }
            }
        }

        return iMin;
    }

    public void RowSum()
    {
        int i = 0, j = 0, iSum = 0;
        
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println("Summation of all elemnets from row no : "+i+" is : "+iSum);
            iSum = 0;   // IMP
        }
    }
}

class Program573
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int No2 = sobj.nextInt();

        Matrix mobj = new Matrix(No1,No2);

        mobj.Accept();
        mobj.Dissplay();

        int iRet = 0;
        iRet = mobj.Summation();

        System.out.println("Summation is : "+iRet);
    
        iRet = mobj.Maximum();
        System.out.println("Maximum element is : "+iRet);

        iRet = mobj.Minimum();
        System.out.println("Minimum element is : "+iRet);
        
        mobj.RowSum();
        
        mobj = null;
        sobj.close();
    }
}
/*C:\Users\Admin\Desktop\LB>javac Program573.java

C:\Users\Admin\Desktop\LB>java Program573
Enter number of rows :
3
Enter number of columns :
3
Please enter the data :
11
12
13
14
15
16
17
18
19
Elements from the matrix :
11      12      13
14      15      16
17      18      19
Summation is : 135
Maximum element is : 19
Minimum element is : 11
Summation of all elemnets from row no : 0 is : 36
Summation of all elemnets from row no : 1 is : 45
Summation of all elemnets from row no : 2 is : 54 */