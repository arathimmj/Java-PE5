package com.stackroute.pefive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SetInterface {

    public HashSet<String> sortSet(HashSet<String> strSet){

        List<String> strList = new ArrayList<>(strSet);

        Collections.sort(strList);

        strSet = new LinkedHashSet<String>(strList);

        return strSet;

    }

    public static void main(String[] args) throws IOException {

        SetInterface setInterface = new SetInterface();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> strSet = new LinkedHashSet<String>();

        System.out.println("Enter your limit:");

        int limit = Integer.parseInt(bufferedReader.readLine());

        for (int i=0;i<limit;i++)
            strSet.add(bufferedReader.readLine());

        strSet = setInterface.sortSet(strSet);

        System.out.println(strSet);


    }

}
