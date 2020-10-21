package Krok.school.lesson.second.Devices;

public class VinylPlayer extends Device{
    public VinylPlayer(String device_name){
        super(device_name);
    }

    @Override
    public void getInfo() {
        System.out.println(getDevice_name());
    }
}
