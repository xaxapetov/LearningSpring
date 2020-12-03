package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player1 = context.getBean("testPlayer", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("testPlayer", MusicPlayer.class);
        player1.playMusic();
        player2.playMusic();
        System.out.println(player1 == player2);
        System.out.println(player1);
        System.out.println(player2);
        context.close();

    }
}
