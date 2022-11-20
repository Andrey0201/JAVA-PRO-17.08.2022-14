package com.javapro.lesson18.api;


public interface Publisher {


  boolean subscribe(Subscriber subscriber);

  boolean unFollow(Subscriber subscriber);

  void notifySubs();
}