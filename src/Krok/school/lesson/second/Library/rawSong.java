package Krok.school.lesson.second.Library;

public class rawSong {
    String song_name;
    String song_singer;
    public rawSong (String song_name, String song_singer){
        this.song_name = song_name;
        this.song_singer = song_singer;
    }

    public String info() {return "Song name: " + song_name + ":\n\tSinger: " + song_singer; }
}
