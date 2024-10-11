import java.util.*;
public class set1 {
    public static void main(String[] args){
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        }
        Set<Integer> temp1=new HashSet<>(s1);
        temp1.retainAll(s2);
        s1.removeAll(temp1);

        s2.removeAll(temp1);
        System.out.println(s1);
        System.out.println(s2);
       /* 
        Set<Integer> s3=new HashSet<>(nums1);
        System.out.println(s3);
        */
    }
}
