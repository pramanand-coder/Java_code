public class DoubleLinkedList{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static class DLL{
        Node insertAtBeg(Node head,int x){
            Node t=new Node(x);
            t.next=head;
            head.prev=t;
            return t;
        }
        void displayRandom(Node random){
            Node temp=random;
            while(temp.prev!=null){
                temp=temp.prev;
            }
           display(temp);
        }
        void displayRev(Node tail){
            Node temp=tail;
            while(temp.next!=null){
                temp=temp.next;
            }
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.prev;
            }
            System.out.println();
        }
       void display(Node head){
         Node temp=head;
         while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
         }
         System.out.println();
       } 
    }
    public static void main(String[] args){
        DLL obj=new DLL();
        Node a=new Node(10);
        Node b=new Node(13);
        Node c=new Node(15);
        Node d=new Node(17);
        Node e=new Node(19);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        obj.display(a);
        obj.displayRev(e);
        obj.displayRandom(c);
        
        Node newHead=insertAtBeg(a,7);
        obj.display(newHead);
    }
    
}