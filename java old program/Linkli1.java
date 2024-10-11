import java.util.*;
public class Linkli1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void SpecificData(Node head,int position){
        Node temp=head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void Reverse(Node head){
        Node prev=head;
        Node current=head.next;
        Node agla=head.next;
        prev.next=null;
        while(current!=null){
            agla=agla.next;
            current.next=prev;

            prev=current;
            current=agla;
        }
        Node temp=prev;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
            if(temp==null){
                System.out.println("Null");
            }
        }
            
    }
    public static void AlternateDisplay(Node head){
        Node temp=head;
        while(temp!=null){
        int[] arr1=new int[3];
        int n1=0;
        for(int i=0;i<3 && temp!=null;i++){
            arr1[i]=temp.data;
            temp=temp.next;
            n1+=1;
        }
        for(int i=0;i<n1;i++){
            System.out.print(arr1[i]+" ");
        }
        int[] arr2=new int[3];
        int n2=0;
        for(int i=0;i<3 && temp!=null;i++){
            arr2[i]=temp.data;
            temp=temp.next;
            n2+=1;
        }
        for(int i=n2-1;i>=0;i--){
            System.out.print(arr2[i]+" ");
        }
     }
    }
    public static Node AddLast(Node head,int data){
       
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(data);
        temp.next=t;
        //temp=t;
        return head;
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
        temp=temp.next;
      }
      temp=head.next;
      while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
        if(temp==null){
            System.out.println("Null");
        }
      }
      SpecificData(head.next,3);
     // Reverse(head.next);
      //head=AddLast(head.next,99);
      AlternateDisplay(head.next);
    }
}
