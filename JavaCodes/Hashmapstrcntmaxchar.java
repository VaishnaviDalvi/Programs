 //HashMap
//accept string & count maximum occurence variable
import java.util.*;

public class Hashmapstrcntmaxchar
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sobj.nextLine();
        str=str.replaceAll(" ", "");
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
        int iMax=0;
        char ch='\0';
        for(char data : setobj)
        {
            
            iMax=hobj.get(data);
            ch =data;
        }
        System.out.println("Character "+ch+" occurs maximum number of times in string is  "+iMax+" times");
        
            //System.out.println(data+ " occurs "+hobj.get(data)+"  times");
        
        sobj.close();

    }
}

///put(key,value)
///get(key)
//containskey(key)
/*


C:\Users\Admin\Desktop\LB>javac Program670.java

C:\Users\Admin\Desktop\LB>java Program670
Enter String:
Hello
[e, H, l, o]
e occurs 1  times
H occurs 1  times
l occurs 2  times
o occurs 1  times

*/ 
    

