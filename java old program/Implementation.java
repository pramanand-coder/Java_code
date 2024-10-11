import java.util.*;
public class Implementation{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;

        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
                if(temp==null){
                    System.out.print("null");
                }
            }
        }
         Node Revdisplay(Node t){
            Node temp=t;
            while(temp!=null){
                if(temp.next==null){
                    return temp;
                }
                temp=temp.next;
                Node t1=Revdisplay(temp);
                System.out.print(t1.data+"->");
            }
            return temp;
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            System.out.println(" ");
            return count;
        }
        void insertAtBegning(int val)
        {  
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            temp.next=head;
            head=temp;
        }
        void insertAt(int idx,int data){
            if(idx==0){
                insertAtBegning(data);
            }
            else if(idx==size()){
                insertAtEnd(data);
                return;
            }
            else if(idx<0 && idx>size()){
                System.out.println("Invalid index");
            }
            else{
                Node t=new Node(data);
                Node temp=head;
                for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;
            }
        }
        int getElement(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAtIndex(int idx){
            if(idx==0){
                head=head.next;
            }
            else if(idx==size()-1){
                Node temp=head;
                for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
            }
            else if(idx<0 && idx>size()){
                System.out.println("Invalid index");
                return ;
            }
           else{
            Node temp=head;
           for(int i=1;i<=idx-1;i++){
            temp=temp.next;
           }
           temp.next=temp.next.next;
           }

        }
    }
    public static void main(String[] args){
        Linkedlist obj=new Linkedlist();
        obj.insertAtBegning(99);
        obj.insertAtEnd(8);
        obj.insertAtEnd(3);
        obj.insertAtEnd(9);     //99->8->3->9->null
        obj.insertAt(3,7);
        obj.insertAt(0,1);
        obj.insertAt(6,100);

        obj.display();                                //1->99->8->3->7->9->100->null
        //System.out.println(obj.getElement(3));
        //obj.size();
        //obj.deleteAtIndex(6);
        //obj.display();
        //System.out.println(obj.tail.data);
        //int n=7/2;
        //System.out.println(n);
        obj.Revdisplay(obj.head);
        
    }
}