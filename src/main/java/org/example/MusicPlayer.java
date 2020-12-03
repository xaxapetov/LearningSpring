package org.example;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;

    private MusicPlayer(){
    }

    public void initMethod(){
        System.out.println("Init Method");
    }

    public void destroyMethod(){
        System.out.println("Destroy Method");
    }

    public static MusicPlayer factoryMethod(){
        return new MusicPlayer();
    }

    public void playMusic(){
        System.out.println("Play " + music.getSong() + " music");
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume= volume;
    }
}
