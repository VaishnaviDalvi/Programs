//update matrix Element of an array if there is oddelement then make it even  
//13
//13+1

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

    protected void finalize()
    {
        System.out.println("Garbage collector is collecting the memory of an object");
        Arr = null;
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
            for(j = 0, iSum = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println("Summation of all elemnets from row no : "+i+" is : "+iSum);
        }
    }

    public int DiagonalSum()
    {
        int i = 0, j = 0, iSum = 0;
        
        if(iRow != iCol)
        {
            System.out.println("Unable to perform addition of diagonal elements");
            System.out.println("Becase matrix is not a square matrix");

            return -1;
        }

        for(i= 0; i < iRow; i++)
        {
            for(j = i; (j < iCol && i == j); j++)
            {
                    iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }

    public void SumEvenOdd()
    {
        int i = 0, j = 0, iSumEven = 0, iSumOdd = 0;
        
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if((Arr[i][j] % 2) == 0)
                {
                    iSumEven = iSumEven + Arr[i][j];
                }
                else
                {
                    iSumOdd = iSumOdd + Arr[i][j];
                }
            }
        }  
        System.out.println("Addition of even elements : "+iSumEven);
        System.out.println("Addition of odd elements : "+iSumOdd);
    }

    public void UpdateMatrix()
    {
        int  i = 0, j = 0;
        
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] % 5 == 0)
                {
                    Arr[i][j] = 0;
                }
            }
        }
    }

    public void UpdateMatrixEven()
    {
        int  i = 0, j = 0;
        
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] % 2 == 1)
                {
                    Arr[i][j]++;
                }
            }
        }
    }
}

class Program582
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
        
        iRet = mobj.DiagonalSum();
        System.out.println("Summation of diagonal elements : "+iRet);
        
        mobj.SumEvenOdd();
        
        mobj.UpdateMatrixEven();

        mobj.Dissplay();

        mobj = null;

        System.gc();
        sobj.close();
    }
}
/*C:\Users\Admin\Desktop\LB>java Program580
Enter number of rows :
2
Enter number of columns :
2
Please enter the data :
11
21
31
41
Elements from the matrix :
11      21
31      41
Summation is : 104
Maximum element is : 41
Minimum element is : 11
Summation of all elemnets from row no : 0 is : 32
Summation of all elemnets from row no : 1 is : 72
Summation of diagonal elements : 52
Addition of even elements : 0
Addition of odd elements : 104
Garbage collector is collecting the memory of an object

C:\Users\Admin\Desktop\LB>java Program580
Enter number of rows :
2
Enter number of columns :
2
Please enter the data :
1
2
3
4
Elements from the matrix :
1       2
3       4
Summation is : 10
Maximum element is : 4
Minimum element is : 1
Summation of all elemnets from row no : 0 is : 3
Summation of all elemnets from row no : 1 is : 7
Summation of diagonal elements : 5
Addition of even elements : 6
Addition of odd elements : 4
Garbage collector is collecting the memory of an object

C:\Users\Admin\Desktop\LB>javac Program582.java
Program582.java:20: warning: [removal] finalize() in Object has been deprecated and marked for removal
    protected void finalize()
                   ^
1 warning

C:\Users\Admin\Desktop\LB>java Program582
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
181
Exception in thread "main" java.util.NoSuchElementException
^C
C:\Users\Admin\Desktop\LB>javac Program582.java
Program582.java:20: warning: [removal] finalize() in Object has been deprecated and marked for removal
    protected void finalize()
                   ^
1 warning

C:\Users\Admin\Desktop\LB>java Program580
Enter number of rows :
Exception in thread "main" java.util.NoSuchElementException
^C
C:\Users\Admin\Desktop\LB>java Program582
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
Summation of all elemnets from row no : 2 is : 54
Summation of diagonal elements : 45
Addition of even elements : 60
Addition of odd elements : 75
Elements from the matrix :
12      12      14
14      16      16
18      18      20
Garbage collector is collecting the memory of an object */