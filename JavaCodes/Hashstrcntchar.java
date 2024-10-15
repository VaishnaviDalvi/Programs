 //HashMap
//accept string & count which alphabate occur at how many time
//
import java.util.*;

public class Program668
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();
        //LinkedList<Integer>lobj=new LinkedList<Integer>();
        
        HashMap <Character,Integer>hobj=new HashMap<>();
        for(char ch: Arr) //foreach
        {
            int Frequency=0;
            if(hobj.containsKey(ch))
            {
                Frequency=hobj.get(ch);
                hobj.put(ch,Frequency+1);
            }
            else
            {
                hobj.put(ch,1);             //1st time sapdla
            }
           
        }
        Set<Character> setobj=hobj.keySet();
        System.out.println(setobj);

        sobj.close();

    }
}

///put(key,value)
///get(key)
//containskey(key)
/*


C:\Users\Admin\Desktop\LB>javac Program668.java

C:\Users\Admin\Desktop\LB>java Program668
Enter String:
Hello
[e, H, l, o]
*/ 
    

