package TryWithResource;

import java.io.FileOutputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileOutputStream fos= new FileOutputStream("file.txt")){
        String msg = "Welcome";
        byte byteArray[]= msg.getBytes();
        fos.write(byteArray);
        System.out.println("message written");

    }catch(Exception e){
            System.out.println(e);
        }

    }
}