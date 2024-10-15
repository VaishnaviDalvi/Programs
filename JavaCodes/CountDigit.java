
//Accept number from user & count Digits
import java.util.*;

class Program208
{
    public static int CountDigits(int iNo)
    {
        int iCnt=0;
        while(iNo > 0)
        {
            iCnt++;
            iNo=iNo/10;
        }
        return iCnt;
    }
    public static void main(String arg[])
    {
        int iValue=0,iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue=sobj.nextInt();
        iRet=CountDigits(iValue);
        
        System.out.println("Number of Digits are: "+iRet);
        sobj.close();
     }
}
/*
C:\Users\Admin\Desktop\LB>java Program208
Enter the Number :
123
Number of Digits are: 3 */

