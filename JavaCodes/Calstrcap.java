//accept string & calculate capital char
import java.util.*;
class Calstrcap

{
    public static int CountCapital(String str)
    {
        char Arr[]=str.toCharArray();//convert array to straing
        int i=0,icnt=0;
        for(i=0;i<Arr.length;i++)
        {

            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                icnt++;
            }
        }
        return icnt;
    }
   

public static void main(String args[])
{
    Scanner sobj= new Scanner (System.in);

    System.out.println("Enter your name:");
    String name=sobj.nextLine();
       
    int iRet=0;
    iRet=CountCapital(name);
    System.out.println("Number of Capital Characters :" +iRet);
    sobj.close(); 
}
}