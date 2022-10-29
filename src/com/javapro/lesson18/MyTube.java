package com.javapro.lesson18;

import com.javapro.lesson18.entity.DefaultUser;
import com.javapro.lesson18.entity.PremiumUser;
import com.javapro.lesson18.entity.User;
import com.javapro.lesson18.entity.Video;
import com.javapro.lesson18.service.Channel;
import java.sql.SQLOutput;

public class MyTube {

  public static void main(String[] args) {
    Channel channel = new Channel(0);
    User user = new PremiumUser("Valeriy","Zalujnii");
    User user1 = new DefaultUser("Test","Testovich");

    channel.subscribe(user);
    channel.subscribe(user1);
    channel.loadVideo(new Video(channel.getChannelId(), "How to cook russion solder",1024));
    System.out.println(channel.getSubscriberList());
  }
}
