package Lec46;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
//        HashMap<String,Integer> map=new HashMap<>();
//        map.put("Ram",1);
//        map.put("Shyam",2);
//        map.put("Sohan",1);
//        map.put("Mohan",3);
//        map.put("Ram",4);
//        map.put("Prince",5);
//        map.put("Sudhakar",6);
//        map.put("tushar",7);
//        map.put("Shivam",8);
//        System.out.println(map);
//        System.out.println(map.containsKey("r"));

//        TreeMap<String,Integer> map=new TreeMap<>();
//        map.put("Ram",1);
//       map.put("Shyam",2);
//       map.put("Sohan",1);
//        map.put("Mohan",3);
//        map.put("Ram",4);
//        map.put("Prince",5);
//        map.put("Sudhakar",6);
//        map.put("tushar",7);
//        map.put("Shivam",8);
//        System.out.println(map);
//    }
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Ram", 1);
        map.put("Shyam", 2);
        map.put("Sohan", 1);
        map.put("Mohan", 3);
        map.put("Ram", 4);
        map.put("Prince", 5);
//        map.put("Sudhakar",6);
//        map.put("tushar",7);
//        map.put("Shivam",8);
        System.out.println(map);
    }
}
