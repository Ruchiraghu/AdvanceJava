package MobilePhone;

public class Main {
    public static void main(String[] args) {
        Device d = new Device("Realme","Realme 8 pro");
        d.display();
        d.powerOn();
        d.powerOff();

        System.out.println();
        Smartphone s = new Smartphone("OnePlus","OnePlus nord","Android","12MP");
        s.display();
        s.powerOn();
        s.clickPhoto();
        s.powerOff();
        s.clickPhoto();

    }
}
