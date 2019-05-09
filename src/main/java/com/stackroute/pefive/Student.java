package com.stackroute.pefive;

import java.util.*;

public class Student {

    Student(int id, String name, int age){

        this.name = name;
        this.age = age;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int id;
    private String name;
    private int age;

}
class StudentSorter implements Comparator<Student>{

    @Override
    public int compare(Student customer1, Student customer2) {

        int num = customer1.getName().compareTo(customer2.getName());

        if (num == 0){

            if (customer1.getAge() > customer2.getAge())
                num = 1;
            else if(customer1.getAge() < customer2.getAge())
                num = -1;
            else if (customer1.getAge() == customer1.getAge()){

                if (customer1.getId() > customer2.getId())
                    num = 1;
                else if(customer1.getId() < customer2.getId())
                    num = -1;

            }

        }

        return num;
    }


    public static void main(String[] args) {

        List<Student> al = new ArrayList<>();

        Student obj1 = new Student(1,"Ajay", 22);
        Student obj2 = new Student(2,"Sneha", 23);
        Student obj3 = new Student(3,"Simran", 37);
        Student obj4 = new Student(4,"Ajay", 22);
        Student obj5 = new Student(5,"Ajay", 29);
        Student obj6 = new Student(6,"Sneha", 22);

        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        System.out.println("Before Sorting:");
        for (Student student : al){
            System.out.print(student.getName()+"\t");
            System.out.print(student.getAge()+"\t");
            System.out.println(student.getId());
        }

        Collections.sort(al, new StudentSorter());

        System.out.println("After Sorting:");
        for (Student customer : al) {
            System.out.print(customer.getName()+"\t");
            System.out.print(customer.getAge()+"\t");
            System.out.println(customer.getId());
        }
    }
}


