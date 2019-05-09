package com.stackroute.pefive;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UpdateArrayElement {

    public List<String> updateArrayElement(List<String> list, String updateElement, String updateWith){

        ListIterator<String> iterator = list.listIterator();


        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(updateElement)) {
                iterator.set(updateWith);
            }
        }

        return list;

    }

    public static void main(String[] args) {

        UpdateArrayElement updateArrayElement = new UpdateArrayElement();
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        list = updateArrayElement.updateArrayElement(list, "Apple", "Kiwi");
        list = updateArrayElement.updateArrayElement(list, "Melon", "Mango");

        for (String fruit : list)
            System.out.println(fruit);

    }

}
