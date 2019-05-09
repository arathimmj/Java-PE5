package com.stackroute.pefive;

import java.util.HashMap;
import java.util.Map;

public class HashMapUpdate {

    public HashMap<String, String> updateHash(HashMap<String, String> hashMap){

        String val = "";
        for(Map.Entry m:hashMap.entrySet()){
            if (m.getKey().equals("val1")){
                val = m.getValue().toString();
                m.setValue(" ");
            }
            else if (m.getKey().equals("val2"))
                if (val != "")
                    m.setValue(val);
        }

        return hashMap;
    }

    public static void main(String[] args) {

        HashMapUpdate hashMapUpdate = new HashMapUpdate();

        HashMap<String, String> map = new HashMap<>();

        map.put("val1","java");
        map.put("val2", "help");

        map = hashMapUpdate.updateHash(map);

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }

    }

}
