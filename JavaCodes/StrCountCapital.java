//Accept string & count capital letters.
import java.util.*;
class StrCountCapital

{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner (System.in);

        System.out.println("Enter your name:");
        String name=sobj.nextLine();
        sobj.close(); 
        int i=0,iCnt=0;
        char ch;
        for(i=0;i<name.length();i++)
        { 
            ch=name.charAt(i);
            if((ch >= 'A') && (ch <='Z'))
            {
                iCnt++;
            }
         
        }
        
        System.out.println("Capital charatcter are:"+iCnt);
        
    }
}