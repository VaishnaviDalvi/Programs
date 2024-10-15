//concept of constructor,
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
        Scanner sobj = new Scanner(System.in);
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
    
    
}
class Constructorr
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
      sobj.close();
    }

}

