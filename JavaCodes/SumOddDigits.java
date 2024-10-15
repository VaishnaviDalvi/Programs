//Accept No from user & return sum of Odd Digit;


import java.util.*;

class SumOddDigit
{
    public static int SumOddDigits(int iNo)
    {
        int iDigit=0,iSum=0;
        while(iNo > 0)
        {
            iDigit=iNo % 10;
            if(iDigit % 2 != 0)
            {
                iSum=iSum +iDigit;
            }
             iNo= iNo / 10;
        }
        return iSum;
    }
    public static void main(String arg[])
    {
        int iValue=0,iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue=sobj.nextInt();
        iRet=SumOddDigits(iValue);
        
        System.out.println("Summattion of Odd Digits are: "+iRet);
        sobj.close();
    }
}

