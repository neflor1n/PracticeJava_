package practice.SomeFunctions;

import java.util.HashMap;

public class hashmap_ {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, "four");


        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("Car", "Volvo");
        hm2.put("BMW", "M4");

        //System.out.println(hm);
        //System.out.println(hm2);

//        for (String i : hm2.keySet()) {
//            System.out.println(i);
//        }
//        for (String i : hm.values()) {
//            System.out.println(i);
//        }
        for (Integer i : hm.keySet()) {
            System.out.println("key: " + i + " value: " + hm.get(i));
        }
    }
}
