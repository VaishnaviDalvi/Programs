//calculate average,
import java.util.*;
class ArrayX
{
    public int Arr[];
    public ArrayX(int no)
    {
         Arr=new int[no];
    }
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the Elements");
        int i=0;
        for(i=0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
            sobj.close();
        }
    }
     public void Display()
    {    
        System.out.println("Elements of the Array are:");
        int i=0;
        for(i=0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
    public float Average()
    {
        float fAvg=0.0f;
        int iSum=0,i=0;
        for( i=0;i<Arr.length;i++)
        {
            iSum=iSum+Arr[i];
        }
        fAvg=(float)iSum/(float)(Arr.length);
        return fAvg;
    }

}

class ArrayEleAverage
{
   public static void main(String A[])
   {
        
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter number of the Elements u want to store: ");
      int iNo=sobj.nextInt();

      ArrayX aobj = new ArrayX(iNo);
      System.out.println("Array size is:"+aobj.Arr.length);
      aobj.Accept();
      aobj.Display();
      float fRet=aobj.Average();
      System.out.println("Average is:"+fRet);
      sobj.close();
    }

}

/*
 

C:\Users\Admin\Desktop\LB>javac Program242.java

C:\Users\Admin\Desktop\LB>java Program242
Enter number of the Elements u want to store:
4
Array size is:4
Enter the Elements
1
2
5
8
Elements of the Array are:
1
2
5
8
Average is:4.0
 */