package com.company;

import java.util.*;

public class Main{
    public static void main(String[] args){
        String[] animalNames = {"Fluffy","Bob","Lucky","Lucy","Жека","Лёлик","Грымзик","Попс","Щучка","Жучка"};
        Map<Integer, Animal> map = new HashMap<>();
        Dog dog = new Dog(30,30,"Caps");
        map.put(0,dog);
        Cat cat = new Cat(29,29,"Barsik");
        map.put(1,cat);
        Sparrow sparrow = new Sparrow(25,25,"Chukcha");
        map.put(2,sparrow);
        ArrayList<Animal> newList = new ArrayList<>();
        for (int s: map.keySet()) {
            newList.add(map.get(s));
        }
        int i = 0;
        while (i<5){
            int age =(int) (Math.random()* 15);
            int size =(int) (Math.random()*20);
            int numberOfName = (int)(Math.random()* animalNames.length);
            String nameOfAnimal = animalNames[numberOfName];
            if (i<=1){
                Animal doggy = new Dog(age,size,nameOfAnimal);
                map.put(i+3,new Dog(age,size,nameOfAnimal));
            }else if ((i>=2)&&(i<=3)){
                Animal catty = new Cat(age,size,nameOfAnimal);
                map.put(i+3,new Cat(age,size,nameOfAnimal));
            }else{
                Animal spar = new Sparrow(age,size,nameOfAnimal);
                map.put(i+3,new Sparrow(age,size,nameOfAnimal));
            }
            i++;
        }
        System.out.println("map = " + map);
        i += 3;
        int j = 0;
        ArrayList<Animal> arrayList = new ArrayList<>();
        Map<Integer,Animal> transportMap = new HashMap<>();
        Set<Animal> outputSet = new HashSet<>();
        while (j<4)
        {
            int age =(int) (Math.random()* 15);
            int size =(int) (Math.random()*20);
            int numberOfName = (int)(Math.random()* animalNames.length);
            String nameOfAnimal = animalNames[numberOfName];
            if (j<=1){
                Animal doggy = new Dog(age,size,nameOfAnimal);
                arrayList.add(doggy);
            }else if (j==2){
                Animal catty = new Cat(age,size,nameOfAnimal);
                arrayList.add(catty);
            }else{
                Animal spar = new Sparrow(age,size,nameOfAnimal);
                arrayList.add(spar);
            }
            transportMap.put(j,arrayList.get(j));
            outputSet.add(transportMap.get(j));
            j++;
            if (j == 4){
                System.out.println("outputSet = " + outputSet);
            }
        }

        Short aShort = 32000;
        Integer integer = 2000000;
        Float fLoad = 13000.5f;
        Double doIdle = 6000000.78d;
        String str = "I don't know what to print, so i'll print this: ";
        print(aShort,str);
        print(integer,str);
        print(fLoad,str);
        print(doIdle,str);
    }

    public static <T> void print(T item, String str){
        System.out.println(str + item);
    }

}
