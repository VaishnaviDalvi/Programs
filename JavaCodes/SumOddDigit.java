//Accept No from user & return count  of Odd Digit;


import java.util.*;

class SumOddDigit
{
    public static int OddDigits(int iNo)
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
        iRet=OddDigits(iValue);
        
        System.out.println("Summattion of Odd Digits are: "+iRet);
        sobj.close();
    }
}
/*C:\Users\Admin\Desktop\LB>java Program212
Enter the Number :
235
Summattion of Odd Digits are: 8
 */
