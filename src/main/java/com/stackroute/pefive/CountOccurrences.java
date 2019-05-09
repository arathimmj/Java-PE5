package com.stackroute.pefive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurrences {

    static HashMap<String,Integer> hm = new HashMap<>();

    public HashMap<String,Integer> findOccurrence(String text){

        HashMap<String,Integer> hashMap = new HashMap<>();

        CountOccurrences countOccurrences = new CountOccurrences();

        List<String> numList = countOccurrences.populateNumberList();

        for (String num : numList)
            hashMap = countOccurrences.match(text, num);

        return hashMap;

    }

    public HashMap<String,Integer> match(String text, String patternString){

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        while(matcher.find()) {

            count++;
            hm.put(patternString, count);

        }

        return hm;

    }

    public List<String> populateNumberList(){

        List<String> list = new ArrayList<>();

        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");

        return list;

    }

    public static void main(String[] args) {

        CountOccurrences countOccurrences = new CountOccurrences();

        HashMap<String,Integer> hashMap = new HashMap<>();

        String text =
                "one one -one___two,,three,one @three*one?two";

            hashMap = countOccurrences.findOccurrence(text);

        for(Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+"-"+m.getValue());
        }

    }

}
