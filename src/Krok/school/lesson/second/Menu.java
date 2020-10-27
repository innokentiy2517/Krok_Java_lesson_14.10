package Krok.school.lesson.second;

import Krok.school.lesson.second.Devices.Device;
import Krok.school.lesson.second.Library.Song;
import Krok.school.lesson.second.Library.rawSong;

import java.util.ArrayList;

public class Menu {
    private ArrayList<rawSong> rawSongList;
    private ArrayList<Song> SongList;
    private ArrayList<Device> DeviceList;

    public Menu(ArrayList<rawSong> rawSongList, ArrayList<Song> SongList, ArrayList<Device> DeviceList){
        this.rawSongList = rawSongList;
        this.SongList = SongList;
        this.DeviceList = DeviceList;
    }
}
