package Krok.school.lesson.second.Devices;

public class Device {
    private String device_name;

    public Device(String device_name){
        this.setDevice_name(device_name);
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public void getInfo(){
        System.out.println(getDevice_name());
    }
}

