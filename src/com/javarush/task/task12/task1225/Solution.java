package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        //boolean w = "Cat".equals(o.getClass().getSimpleName());
          //  System.out.println(o.getClass());
/*
        if ("Cat".equals(o.getClass().getSimpleName()))
            return "Кот";
        else if ("Tiger".equals(o.getClass().getSimpleName()))
            return "Тигр";
        else if (o instanceof Lion)
            return "Лев";
        */
        if (o instanceof Cat) {
            if (o instanceof Tiger)
                return "Тигр";
            if (o instanceof Lion)
                return "Лев";
            return "Кот";
        } else if (o instanceof Animal) {
            if (o instanceof Cow)
               return "Корова";
            if (o instanceof Bull)
                return "Бык";
            return "Животное";
        }
        else return "";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
