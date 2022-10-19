package com.javapro.lesson19.task1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println(toList(new String[]{"Andrey","Ivan","Alex"}));
    System.out.println(toList(new Integer[]{1,2,3,4}));
  }

  public static <T> List<T> toList(T[] array){
    List<T>list = new ArrayList<>();
    Collections.addAll(list,array);
    return list;
  }

}