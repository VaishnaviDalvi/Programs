//convert string into char array
import java.util.*;
class program261
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner (System.in);

        System.out.println("Enter your name:");
        String name=sobj.nextLine();
        //inbuilt method
        char Arr[]=name.toCharArray();
        

        System.out.println("Array length is:"+Arr.length);//property
        System.out.println("String length is:"+name.length());//method
        sobj.close(); 
    }
}