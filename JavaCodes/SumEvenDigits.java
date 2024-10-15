//Accept No from user & return sum  of Even Digit;


import java.util.*;

class  SunEvenDigits
{
    public static int SumEvenDigits(int iNo)
    {
        int iDigit=0,iSum=0;
        while(iNo > 0)
        {
            iDigit=iNo % 10;
            if(iDigit % 2 == 0)
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
        iRet=SumEvenDigits(iValue);
        
        System.out.println("Number of Digits are: "+iRet);
        sobj.close();
    }
}

/*
C:\Users\Admin\Desktop\LB>java Program209
Enter the Number :
357
Number of Digits are: 0

C:\Users\Admin\Desktop\LB>java Program209
Enter the Number :
234
Number of Digits are: 6
 */