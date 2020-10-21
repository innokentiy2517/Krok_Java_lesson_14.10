package Krok.school.lesson.second;

import Krok.school.lesson.second.Devices.CompactDiskPlayer;
import Krok.school.lesson.second.Devices.Device;
import Krok.school.lesson.second.Devices.VinylPlayer;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\tMusic system. Initialization..."+
                            "\n\t\t\t\tWelcome!"+
                            "\n\t\t\tMain menu:" +
                            "\n\t\t\t");

        Device vp = new VinylPlayer("Грамофон");
        vp.getInfo();

        Device cdp = new CompactDiskPlayer("Компакт плейер");
        cdp.getInfo();
    }
}
