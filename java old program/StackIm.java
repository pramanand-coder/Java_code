import java.util.Stack;
import java.util.Scanner;
public class StackIm
{
   public static void display(Stack<Integer>st){
    Stack<Integer> gt=new Stack<>();
    while(st.size()>0){
        gt.push(st.pop());
    }
    while(gt.size()>0){
        int top=gt.pop();
        System.out.print(top+" ");
        st.push(top);
    }
    System.out.println();
   }
   public static void Insert(Stack<Integer> st){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index:");
        int idx=sc.nextInt();
        System.out.println("Enter the item:");
        int item=sc.nextInt();
    Stack<Integer> gt=new Stack<>();
    while(st.size()>idx){
        gt.push(st.pop());
    }
    st.push(item);
    while(gt.size()>0){
        st.push(gt.pop());
    }
   }
   public static void Remove(Stack<Integer> st){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the index:");
    int idx=sc.nextInt();
    Stack<Integer> gt=new Stack<>();
    while(st.size()>idx+1){
        gt.push(st.pop());
    }
    st.pop();
    while(gt.size()>0){
        st.push(gt.pop());
    }

   }
   public static void Rdisplay(Stack<Integer> st){
      if(st.size()==0){
        return;
      }
      int top=st.pop();
      Rdisplay(st);
      System.out.print(top+" ");
      st.push(top);
   }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        StackIm obj=new StackIm();
        st.push(10);
        st.push(7);
        st.push(12);
        obj.display(st);
        //obj.Insert(st);
        //obj.Insert(st,idx,item);
        //obj.display(st);
        //obj.Remove(st);
        System.out.println(st);
        obj.Rdisplay(st);
        //System.out.println();
        //System.out.println(st);
        

    }
}