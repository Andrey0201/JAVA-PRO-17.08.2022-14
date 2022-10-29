package com.javapro.lesson18.entity;

import com.javapro.lesson18.api.Subscriber;


public abstract class User implements Subscriber {

  private final String name;
  private final String sureName;

  public User(String name, String sureName) {
    this.name = name;
    this.sureName = sureName;


  }

  public String getName() {
    return name;
  }

  @Override
  public void update(Update update) {
    System.out.println(update.getInfo());

  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", sureName='" + sureName + '\'' +
        '}';
  }
}

