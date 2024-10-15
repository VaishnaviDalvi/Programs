//Singly Linear Linked List

class node
{
    public int data;
    public node next;   //reference
}
class SinglyLL
{
    public int iCount;
    public node First;

   public SinglyLL()      //Constructor
    {
        System.out.println("Object of singlyLL gets created sucessfully..");
        First=null;
        iCount=0;
    }
     public void InsertFirst(int No)
    {
            node newn=null;
            newn=new node();
            newn.data=No;
            newn.next=null;

            if(First == null)
            {
                First=newn;
            }
            else
            {
                newn.next=First;
                First=newn;
            }
            iCount++;
    }

    public void InsertLast(int No)
    {
        node newn=null;
        node temp=null;

        newn=new node();
        newn.data=No;
        newn.next=null;
        if(First == null)
         {
                First=newn;
         }
        else
        {
           temp=First;
            while(temp.next != null)
            {
                temp = temp.next;
            }
             temp.next = newn;
        }
        iCount++;
    }
    public void Display()
    {
        System.out.println("Elements of LinkedList are:");
        node temp=First;
        while(temp != null)
        {
               System.out.print("| "+temp.data+ "|->");
               temp=temp.next;  
        }
        System.out.print("null");
        
    }
    public int Count()
    {
        return iCount;
    }
    public void DeleteFirst()
    {
       
        if(First == null)//LL Empty
        {
            System.out.println("LL is empty");
            return;
        }
        else if(First.next == null)//Single Node
        {
            First = null;
        }
        else
        {
            First = First.next;
        }
        iCount--;
        }

    public void DeleteLast()
    {
        node temp=null;
        temp = First;

        if(First == null)//LL Empty
        {
            System.out.println("LL is empty");
            return;
        }   
        else if(First.next == null)//Single Node
        {
            First = null;
        }    
        else//more than one node
        {
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
     iCount--;
    }
}

class SLList

{
    public static void main(String args[])
    {
        int iRet=0;
        SinglyLL obj=new SinglyLL();   //dynamic
        obj.InsertFirst(101);
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(151);
      
        obj.Display();
        iRet=obj.Count();
        System.out.println("\nNumber of Elements are :" +iRet);

        obj.DeleteFirst();
        obj.Display();
        iRet=obj.Count();
        System.out.println("\nNumber of Elements are :" +iRet);

        obj.DeleteLast();
        obj.Display();
        iRet=obj.Count();
        System.out.println("\nNumber of Elements are :" +iRet);
        


    }
}
/*C:\Users\Admin\Desktop\LB>javac Program405.java

C:\Users\Admin\Desktop\LB>java Program405
Object of singlyLL gets created sucessfully..
Elements of LinkedList are:
| 11|->| 21|->| 51|->| 101|->| 111|->| 121|->| 151|->null
Number of Elements are :7
Elements of LinkedList are:
| 21|->| 51|->| 101|->| 111|->| 121|->| 151|->null
Number of Elements are :6
Elements of LinkedList are:
| 21|->| 51|->| 101|->| 111|->| 121|->null
Number of Elements are :5
 */