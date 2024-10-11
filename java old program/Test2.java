import java.util.*;
class Test2{
    public static void main(String args[]){
     List<String> list=new ArrayList<>();
     list.add("A");
     list.add("B");
     list.add("C");
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
        iterator.next();
        list.remove("A");
     }
     System.out.println(list);
    }
}