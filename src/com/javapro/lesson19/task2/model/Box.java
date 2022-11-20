package com.javapro.lesson19.task2.model;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruitavailable> {

  private float weightBox;
  private final List<T> boxFruit = new ArrayList<>();

  public void addFruit(T fruit) {
    if (fruit != null) {
      boxFruit.add(fruit);
    }
  }

  public void addAllFruit(List<T> fruits) {
    for (T fruit : fruits) {
      if (fruit != null) {
        boxFruit.add(fruit);
      }
    }
  }

  public void getWeight() {
    for (Fruitavailable fruit : boxFruit) {
      weightBox += fruit.getWeight();
    }
  }

  public Boolean compare(Box<?> box) {
    if (box == null) {
      System.out.println("Box can't be null");
      return null;
    } else {
      return this.weightBox == box.weightBox;
    }
  }

  public void merge(Box<T> box) {
    if (box == null) {
      System.out.println("Box can't be null");
    } else {
      this.boxFruit.addAll(box.boxFruit);
      getWeight();
    }
  }

  @Override
  public String toString() {
    return "Box" + boxFruit.get(0).getClass().getSimpleName() + "{" +
        "weightBox=" + weightBox +
        ", boxFruit=" + boxFruit +
        '}';
  }
}
