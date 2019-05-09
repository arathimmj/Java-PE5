package com.stackroute.pefive;

import java.util.*;

public class FindOccurrenceInArray {

    static Map<String, Boolean> mapping = new HashMap<>();

    public Boolean isGreaterThanOrEqualTo2(int num){

        if (num >= 2)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;

    }

    public Map<String, Boolean> findOccurrence(List<String> list, String str){

        FindOccurrenceInArray findOccurrenceInArray = new FindOccurrenceInArray();

        mapping.put(str, findOccurrenceInArray.isGreaterThanOrEqualTo2(Collections.frequency(list, str)));

        return mapping;

    }

    public static void main(String[] args) {

        FindOccurrenceInArray findOccurrenceInArray = new FindOccurrenceInArray();

        String[] strArray = new String[]{"a","b","c","d","a","c","c"};

        List<String> strList = new ArrayList<>();

        for (String string : strArray){

            strList.add(string);

        }

        Map<String,Boolean> map = new HashMap<>();

        for (String string : strList)
            map = findOccurrenceInArray.findOccurrence(strList, string);

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"-"+m.getValue());
        }

    }
}
