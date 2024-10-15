//Addition of Two  numbers in java //glaxo
//Approach 3
//use this approach in interview
import java.util.*;    
class Arithematic
{
    public int iNo1;
    public int iNo2;
    public Arithematic(int A,int B)
    {
        iNo1=A;
        iNo2=B;
    }
    public int Addition ()
    {
        int iAns=0;
        iAns=iNo1 + iNo2;
        return iAns;
    }
}
class AdditionNo1
{
    public static void main(String arg[])
    {
        int iValue1=10,iValue2=11;
        int iAns=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the First number :");
        iValue1=sobj.nextInt();

        System.out.println("Enter the First number :");
        iValue2=sobj.nextInt();
        
        Arithematic aobj=new Arithematic(iValue1,iValue2);
        iAns=aobj.Addition();

        System.out.println("Addition is: "+iAns);
        sobj.close();
     }

}
