package MobilePhone;

public class Device {
   protected String brand,model;
   boolean isOn;
   public Device(String brand,String model){

       this.brand = brand;
       this.model = model;
       this.isOn  = false;
   }
   public void powerOn(){
       if(!isOn){
           isOn = true;
           System.out.println(brand+" "+model+" is now ON");
       }
       else {
           System.out.println(brand+" "+model+" is already ON.");
       }
   }
   public void powerOff(){
       if(isOn){
           isOn=false;
           System.out.println(brand+" "+model+" is currently OFF.");

       }
       else{
           System.out.println(brand+" "+model+" is already OFF.");
       }
   }
   public void display(){
       System.out.println("Brand: "+brand);
       System.out.println("Model: "+model);
   }

    }

