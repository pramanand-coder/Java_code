public class ArrayImplementationofQueue {
    public static class QueueA{
        int[] arr=new int[10];
        int f=-1,r=-1;
        int size=0;
        void add(int num){
            if(size==arr.length){
                System.out.println("Queue if Full");
            }
            else if(size==0){
                f=r=0;
                arr[f]=num;
            }
            else{
                arr[++r]=num;
            }
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            else{
                size--;
                f++;
            }
            return arr[f-1];
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
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
                System.out.println("Queue is Empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        QueueA qu=new QueueA();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.display();
        System.out.println(qu.remove());
        qu.display();
        System.out.println(qu.peek());
        System.out.println(qu.size());
        System.out.println(qu.isEmpty());
    }
}
