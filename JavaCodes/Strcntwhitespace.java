//String Programs(Complex)
//Count white spce
//char array convert kel ahe
import java .util.*;
class Strcntwhitespace
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        char Arr[]=str.toCharArray();
        int iCnt=0,i=0;
        for(i=0;i < Arr.length;i++)
        {
            if(Arr[i]== ' ')
            {
                iCnt++;
            }
        }
        System.out.println("Number of whitespaces in String:"+iCnt);
        sobj.close();
    }

}
/*
C:\Users\Admin\Desktop\LB>javac Program587.java

C:\Users\Admin\Desktop\LB>java Program587
Enter String
Vaishnavi Heyy
Number of whitespaces in String:1
 */