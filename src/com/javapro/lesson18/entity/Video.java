package com.javapro.lesson18.entity;

public class Video {

  private int channelId;
  private String name;
  private int size;

  public Video(int channelId, String name, int size) {
    this.channelId = channelId;
    this.name = name;
    this.size = size;
  }

  public int getChannelId() {
    return channelId;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }
}
