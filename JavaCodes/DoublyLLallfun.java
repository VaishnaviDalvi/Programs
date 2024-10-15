//Doubly Linear Linked List

class node
{
    public int data;
    public node next;   //reference
    public node prev; 
    //Prametertized constructor 
    public node(int Value)
    {
        data=Value;
        next=null;
        prev=null;
    }
}
class DoublyCL
{
    public int iCount;
    public node First;
    public node Last;
    public DoublyCL()      //Constructor
    {
        System.out.println("Object of DoublyCL gets Created Successfully");
        First=null;
        Last=null;
        iCount=0;
    }
    public void InsertFirst(int No)
    {
        node newn=null;
        newn=new node(No);
        if((First == null) && (Last == null))
        {
            First=newn;
            Last=newn;
        }
        else
        {
            newn.next=First;
            First.prev=newn;
            First=newn;
        }
        Last.next=First;
        First.prev=Last;
        iCount++;
    }
    public void InsertLast(int No)
    {
       node newn=null;
        newn=new node(No);
        if((First == null) && (Last == null))
        {
            First=newn;
            Last=newn;
        }
        else
        {
            Last.next=newn;
            newn.prev=Last;
            Last=newn;
        }
        Last.next=First;
        First.prev=Last;
        iCount++;  
    }
    public void Display()
    {
        if((First == null) && (Last == null))
        {
           System.out.println("LL is Empty");
           return;
        }
        System.out.println("Elements of LL are:");
       // System.out.println("<=>");
       do
       {
        System.out.print("|"+First.data+"|<=>");
        First=First.next;


       }while(First != Last.next);
       System.out.println("");
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
            Last=null;
        }
        else
        {
            First = First.next;
            Last.next=First;
            First.prev=Last;
        }
        iCount--;
 }

    public void DeleteLast()
    {
       
        if(First == null)//LL Empty
        {
            System.out.println("LL is empty");
            return;
        }
        else if(First.next == null)//Single Node
        {
            First = null;
            Last=null;
        }
        else
        {
            Last= Last.prev;
            Last.next=First;
            First.prev=Last;
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
            int i=0;
            node newn = new node(No);
            node temp = First;
            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next.prev = newn;
            temp.next=newn;
            newn.prev=temp;
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
            temp.next.prev=temp;
            iCount--;
        }
            
    }
}

class DoublyLLallfun
{
    public static void main(String args[])
    {
        int iRet=0;
        DoublyCL obj = new DoublyCL();   //dynamic
        
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(151);
      
      
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of Elements are :" +iRet);

        obj.DeleteFirst();
        obj.DeleteLast();
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of Elements are :" +iRet);

        obj.InsertAtPos(105,5);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of Elements are :" +iRet);

        obj.DeleteAtPos(5);
        obj.Display();
        iRet=obj.Count();
        System.out.println("Number of Elements are :" +iRet);
    }
}
//Homework 02/07/2024
//Singly circular
//doubly linear Linked List
//stack
//queue java madhe
/*C:\Users\Admin\Desktop\LB>javac Program419.java

C:\Users\Admin\Desktop\LB>java Program419
Object of DoublyCL gets Created Successfully
Elements of LL are:
|11|<=>|21|<=>|51|<=>|101|<=>|111|<=>|121|<=>|151|<=>
Number of Elements are :7
Elements of LL are:
|21|<=>|51|<=>|101|<=>|111|<=>|121|<=>
Number of Elements are :5
Elements of LL are:
|21|<=>|51|<=>|101|<=>|111|<=>|105|<=>|121|<=>
Number of Elements are :6
Elements of LL are:
|21|<=>|51|<=>|101|<=>|111|<=>|121|<=>
Number of Elements are :5
 */