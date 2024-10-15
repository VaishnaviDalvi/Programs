//HashMap
//accept string & count which alphabate occur at how many time
import java.util.*;

public class Program666
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();
        for(char ch: Arr)//foreach
        {
            System.out.println(ch);
        }
        sobj.close();

    }
}
/*
C:\Users\Admin\Desktop\LB>javac Program666.java

C:\Users\Admin\Desktop\LB>java Program666
Enter String:
Hello
H
e
l
l
o
*/