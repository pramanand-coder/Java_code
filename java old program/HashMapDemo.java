import java.util.*;  
public class HashMapDemo   
{  
    /* Function to create HashMap from array */  
    static void HashMapCreation(int arr[])  
    {  
        /* Creates an empty HashMap */  
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();  
        for (int i = 0; i < arr.length; i++)   
        {  
            if(hashmap.containsKey(arr[i])){
                hashmap.put(arr[i],hashmap.get(arr[i])+1);
            }
            else{
                hashmap.put(arr[i],1);
            }
        } 
        System.out.println(hashmap);  
        HashMap<String,Integer> hash=new HashMap<String,Integer>();
        hash.put("Jyoti",1);
        hash.put("Swati",3); 
        /* Display HashMap */  
        System.out.println(hash);  
    }  
    /* Driver Code */  
    public static void main(String[] args)  
    {  
        int arr[] = { 1, 6, 5, 10, 6, 6, 10 };  
        HashMapCreation(arr);  
    }  
}  