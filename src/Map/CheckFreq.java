package Map;

import java.util.*;

public class CheckFreq {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "banana", "orange", "banana", "apple", "orange"};
        HashMap <String,Integer> hashMap = new HashMap<>();
        for(String Words :words){
            if(hashMap.containsKey(Words)){
                hashMap.put(Words,hashMap.get(Words)+1);
            }
            else{
                hashMap.put(Words,1);
            }
        }
        for (Map.Entry<String,Integer>hash:hashMap.entrySet()){
            System.out.println(hash.getKey()+" - "+hash.getValue());
        }
    }
}
