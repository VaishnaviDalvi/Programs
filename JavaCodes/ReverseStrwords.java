import java.util.*;

class ReverseStrwords
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        StringBuffer temp = null;
        StringBuffer finalstr = null;

        for(String s : Arr)
        {
            temp = new StringBuffer(s);
            temp = temp.reverse();

            System.out.println(temp);
        }
        sobj.close();
    }
}
