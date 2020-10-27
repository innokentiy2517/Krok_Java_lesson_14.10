package Krok.school.lesson.second.Library;

public class Song extends rawSong {
    String storage_type;

    public Song(String song_name, String song_singer, String storage_type){
        super(song_name,song_singer);
        this.storage_type = storage_type;
    }

    public String info(){return super.info() + "\n\tStorage type: " + storage_type;}
}
