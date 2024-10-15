//travese string
import java.util.*;
class StringcharAt

{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner (System.in);

        System.out.println("Enter your name:");
        String name=sobj.nextLine();
        sobj.close(); 
        int i=0;
        for(i=0;i<name.length();i++)
        { 
         System.out.println(name.charAt(i));
        }
         
    }
    
}
/*C:\Users\Admin\Desktop\LB> java Program259.java
Enter your name:
vaishu
v
a
i
s
h
u
*/