//traverse array accept input from user.
import java.util.*;//useri/p
class TraverseArray

{
    public static void main(String A[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter number of Elments :");
      int iSize=sobj.nextInt();
    
      int Arr[]=new int [iSize];
      System.out.println("Enter the Element :");

      for(int i=0;i<Arr.length;i++)
      {
        Arr[i]=sobj.nextInt();
      }
      System.out.println("Entered Elements are :");
       for(int j=0;j<Arr.length;j++)
      {
       System.out.println(Arr[j]);
       sobj.close();
      }
    }

}

