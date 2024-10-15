
//Accept number from user & return summation of factor and non factors
import java.util.*;

class Program207
{
    public static int Difference(int iNo)
    {
         int iCnt=0,iSumF=0,iSumN=0;
        for(iCnt=1; iCnt < iNo;iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                iSumF= iSumF + iCnt;
            }
            else//non Factor
            {
                 iSumN= iSumN + iCnt;
            }
        }
        return iSumN-iSumF;
    }
    public static void main(String arg[])
    {
        int iValue=0,iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue=sobj.nextInt();
        iRet=Difference(iValue);
        
        System.out.println("Difference of Factors is:"+iRet);
        sobj.close();
     }
}

/*
 
C:\Users\Admin\Desktop\LB>java Program207
Enter the Number :
14
Difference of Factors is: 71

logic
    Difference = iSumN-iSumF
                = 81-10
                = 71       
14 chy factors   1+2+7=10
14 chy Non-Factor 3+4+5+6+8+9+10+11+12+13=81
 */