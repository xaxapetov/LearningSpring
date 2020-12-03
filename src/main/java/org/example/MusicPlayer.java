package org.example;
import java.util.List;

public class MusicPlayer {

    private List<Music> music;
    private String name;
    private int volume;

    public MusicPlayer(List<Music> music){
        this.music = music;
    }

    public void playMusic(){
        music.forEach((x)->System.out.println("Play " + x.getSong() + " music"));
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
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
