package com.javapro.lesson19.task2;

import com.javapro.lesson19.task2.model.Apple;
import com.javapro.lesson19.task2.model.Box;
import com.javapro.lesson19.task2.model.Orange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Orange> orangeListList = new ArrayList<>();
    Collections.addAll(orangeListList, new Orange(), new Orange(), new Orange());

    List<Apple> appleList = new ArrayList<>();
    Collections.addAll(appleList, new Apple(), null, new Apple(), new Apple(), new Apple());

    Box<Orange> orangeBox = new Box<>();
    Box<Orange> orangeBox1 = new Box<>();

    Box<Apple> appleBox = new Box<>();
    Box<Apple> appleBox1 = new Box<>();

    appleBox.addAllFruit(appleList);
    appleBox1.addAllFruit(appleList);
    orangeBox1.addAllFruit(orangeListList);
    orangeBox.addAllFruit(orangeListList);

    orangeBox.addFruit(null);
    appleBox.addFruit(new Apple());

    orangeBox.getWeight();
    appleBox.getWeight();
    orangeBox1.getWeight();
    appleBox1.getWeight();

    System.out.println(orangeBox);
    System.out.println(orangeBox1);
    System.out.println(appleBox);
    System.out.println(appleBox1);

    System.out.println(appleBox.compare(orangeBox));
    System.out.println(orangeBox1.compare(appleBox1));
    appleBox1.merge(appleBox);
    orangeBox1.merge(orangeBox);
    System.out.println(appleBox1);
    System.out.println(orangeBox1);
  }

}
