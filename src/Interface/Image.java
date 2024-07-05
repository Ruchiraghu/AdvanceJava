package Interface;

public class Image implements Printable{
    private int height;
    private int width;
    Image(int height,int width){
        this.height = height;
        this.width = width;
    }
    public void print(){
        System.out.println("Image height: "+height+", "+"Image width: "+width);

    }
}
