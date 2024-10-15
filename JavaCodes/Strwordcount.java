//String Programs(Complex)
//accept string display each word Count
//india is my country   o/p:4
//5     2  2   7

//accept string display length of words
import java.util.*;

class Strwordcount
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");
        sobj.close();
        int i = 0;
        for(i = 0 ; i < Arr.length; i++)
        {
            System.out.println("Length of "+Arr[i]+" is : "+Arr[i].length());
        }
       
    }
    
}
/*


 */ 
