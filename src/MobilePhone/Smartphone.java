package MobilePhone;

public class Smartphone extends Device{
  private String operatingSystem,cameraResolution;

    public Smartphone(String brand, String model, String operatingSystem,String cameraResolution) {
        super(brand, model);
        this.operatingSystem= operatingSystem;
        this.cameraResolution = cameraResolution;
    }
    public void clickPhoto(){
        if(isOn){
            System.out.println("Clicking photo with "+cameraResolution+" resolution.");
        }
        else {
            System.out.println("Your device is switch off can't take picture.");

        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Operating System: "+operatingSystem);
        System.out.println("Camera Resolution: "+cameraResolution);
    }
}
