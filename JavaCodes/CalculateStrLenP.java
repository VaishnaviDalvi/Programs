//Calculate string using length
import java.util.*;
class CalculateStrLenP
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner (System.in);
        System.out.println("Enter your name:");
        String name=sobj.nextLine();
         
         System.out.println("String length is:" +name.length());
         sobj.close();
    }
}