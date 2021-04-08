package com.Testing;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class typic {
    public static void main(String... args){

        Map<Person, List<? extends Pet>> personMap = new HashMap<>();

        personMap.put(new Person("Иван"), Arrays.asList(new Cat("Барсик"), new Cat("Мурзик")));
        personMap.put(new Person("Маша"), Arrays.asList(new Cat("Васька"), new Dog("Бобик")));
        personMap.put(new Person("Ирина"), Arrays.asList(new Cat("Рыжик"), new Dog("Шарик"), new Parrot("Гоша")));

        System.out.println("personMap: " + personMap);
        System.out.println("personMap.keySet(): " + personMap.keySet());

        for(Person person : personMap.keySet()){
            System.out.println(person.name + " имеет");
            for (Pet pet : personMap.get(person)){
                System.out.println("  " + pet.name);
            }
        }
        roof roof = new roof();
        house house = new house();
        paper paper = new paper();
        sun sun = new sun();
        hand hand = new hand();
        button button = new button();

        button.add(roof);
        button.add(sun);
        button.add(hand);
        button.add(house);
        button.add(paper);

        button.onClick();
    }
}

class Person{
    String name;
    Person(String s){
        name = s;
    }

}


class Pet{
    int age;
    String name;
    public void burk(){

    }
}

class Parrot extends  Pet{
    Parrot(String s){
        name = s;
    }
    public void puk(){

    }
}

class Cat extends  Pet{
    Cat(String s){
        name = s;
    }
    public void kus(){

    }
}

class Dog extends Pet{
    Dog(String s){
        name = s;
    }
    public void gav(){

    }
}