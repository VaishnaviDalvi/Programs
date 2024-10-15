//String Programs(Complex)
//Count Number of word in string
//india is my country 4

import java .util.*;
class Strreplacenewchar
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        System.out.println(" String before Replace ments:"+str);
        str=str.replaceAll("a","z");
        System.out.println(" String after Replace ments:"+str);
        sobj.close();
    }
}