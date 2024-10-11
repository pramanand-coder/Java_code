public class LinkedListImplementationofQueue {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class QueueL{
        Node head=null;
        Node tail=null;
        int size=0;
        void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
           size++;
        }
        int remove(){
            if(size==0){
               return -1;
            }
            int a=head.data;
            head=head.next;
            size--;
            return a;
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                Node temp=head;
                while(temp!=tail){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println(temp.data);
            }
        }
    }
    public static void main(String[] args){
        QueueL qu=new QueueL();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
       qu.display();
        System.out.println("Removed item:"+qu.remove());
        System.out.println("After removing");
        qu.display();
        System.out.println("peek element="+qu.peek());
        System.out.println("size="+qu.size);
        qu.isEmpty();
        qu.remove();
        qu.display();
        qu.add(7);
        qu.display();
    }
}
