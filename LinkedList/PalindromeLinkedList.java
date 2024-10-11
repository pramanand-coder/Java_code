import java.util.*;
public class PalindromeLinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static boolean Palindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newNode=Reverse(slow.next);
        slow.next=newNode;
        Node p1=head;
        Node p2=newNode;
        while(p2!=null){
            if(p1.data!=p2.data){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        Node head=new Node(-1);
        Node temp=head;
        for(int i=0;i<n;i++){
          System.out.println("Enter the data:");
          int a=sc.nextInt();
          Node t1=new Node(a);
          temp.next=t1;
          temp=t1;
        }
        temp=head.next;
        while(temp!=null){
          System.out.print(temp.data+"-->");
          temp=temp.next;
          if(temp==null){
              System.out.println("Null");
          }
        }
        System.out.println(Palindrome(head.next));

    }
}