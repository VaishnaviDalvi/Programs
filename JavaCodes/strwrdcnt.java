//String Programs(Complex)
//Count Number of word in string
//india is my country 4

//char array convert kel ahe//finalnhi
import java .util.*;
class strwrdcnt
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sobj.nextLine();
        str=str.trim();
        str=str.replaceAll("  "," ");
        char Arr[]=str.toCharArray();
        int iCnt=0,i=0;
        for(i=0;i < Arr.length;i++)
        {
            if(Arr[i]== ' ')
            {
                iCnt++;
            }
        }
        System.out.println("Number of words are in String:"+(iCnt+1));
    }
}
/*C:\Users\Admin\Desktop\LB>java Program592
Enter String
india  is  my  Country
Number of words are in String:4

C:\Users\Admin\Desktop\LB>java Program592
Enter String
india   is   my   country
Number of words are in String:7 */