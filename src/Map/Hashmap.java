package Map;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        map.put("ruchi",4);
        map.put("anmay",10);
        System.out.println(map);
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("vinit",10);
        map1.put("jai",11);
        map1.put("ajay",9);
        map.putAll(map1);
        System.out.println(map);
//        for (Map.Entry<String,Integer>e:map.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
        for (Map.Entry<String,Integer>e:map.entrySet()) {
            System.out.println(e.getKey()+" = "+e.getValue());
        }
    }
}
