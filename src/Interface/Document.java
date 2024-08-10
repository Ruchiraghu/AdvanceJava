package Interface;

public class Document implements Printable{
    private String text;
    public Document(String text){
        this.text = text;
    }
   public void print(){
       System.out.println("Printing the document: "+text);
    }
}
