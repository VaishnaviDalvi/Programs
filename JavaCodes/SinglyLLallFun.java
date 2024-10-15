//Singly Linear Linked List
//impp a prameterized use kel
class node
{
    public int data;
    public node next;   //reference

    //Prametertized constructor 
    //dar veles lihav lagt mahnun
    public node(int Value)
    {
        data=Value;
        next=null;
    }

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
            newn=new node(No);
           // newn.data=No;
           // newn.next=null;
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
        newn=new node(No);//
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
    public void InsertAtPos(int No,int iPos)
    {
        if((iPos < 1) || (iPos > iCount+1))
        {
            System.out.println("Invaild Position");
            return;
        }
        if(iPos == 1)
        {
            InsertFirst(No);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(No);
        }
        else
        {
            node temp = First;
            int i=0;
            node newn = new node(No);
           
            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            iCount++;
        }
    }
     public void DeleteAtPos(int iPos)
    {
        if((iPos < 1) || (iPos > iCount))
        {
            System.out.println("Invaild Position");
            return;
        }
        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else
        {
            node temp = First;
            int i=0;
            
            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            iCount--;
        }
    }
}

class SinglyLLallFun
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

        obj.InsertAtPos(105,5);
      
        obj.Display();
        iRet=obj.Count();
        System.out.println("\nNumber of Elements after Insertatpos 5 are :" +iRet);

        obj.DeleteAtPos(4);
        obj.Display();
        iRet=obj.Count();
        System.out.println("\nNumber of Elementssfter Deleteatpos 4 are :" +iRet);

        obj.DeleteFirst();
        obj.DeleteLast();
        obj.Display();
        iRet=obj.Count();
        System.out.println("\nNumber of Elements are :" +iRet);
      


    }
}
/*C:\Users\Admin\Desktop\LB>java Program414
Object of singlyLL gets created sucessfully..
Elements of LinkedList are:
| 11|->| 21|->| 51|->| 101|->| 111|->| 121|->| 151|->null
Number of Elements are :7
Elements of LinkedList are:
| 11|->| 21|->| 51|->| 101|->| 105|->| 111|->| 121|->| 151|->null
Number of Elements after Insertatpos 5 are :8
Elements of LinkedList are:
| 11|->| 21|->| 51|->| 105|->| 111|->| 121|->| 151|->null
Number of Elementssfter Deleteatpos 4 are :7
Elements of LinkedList are:
| 21|->| 51|->| 105|->| 111|->| 121|->null
Number of Elements are :5
 */