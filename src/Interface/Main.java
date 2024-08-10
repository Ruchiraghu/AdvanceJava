package Interface;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("Document text file");
        Image img = new Image(126,200);
        doc.print();
        img.print();
    }
}
