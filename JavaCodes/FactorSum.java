//Addition of factors using another class

//main asel  tr static function liha
import java.util.*;

class Program206
{
    public static int SumFactors(int iNo)
    {
         int iCnt=0,iSum=0;
        for(iCnt=1; iCnt<=(iNo/2);iCnt++)
        {
            if((iNo % iCnt)==0)
            {
                iSum= iSum + iCnt;
            }
        }
        return iSum;
    }
    public static void main(String arg[])
    {
        int iValue=0,iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the Number :");
        iValue=sobj.nextInt();
        iRet=SumFactors(iValue);
        
        System.out.println("Summation of Factors  is: "+iRet);
        sobj.close();
     }
}
/*

C:\Users\Admin\Desktop\LB>java Program206
Enter the Number :
25
Summation of Factors  is: 6              // 1,5
 */
