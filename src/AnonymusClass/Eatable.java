package AnonymusClass;

public interface Eatable {
    void eat();

    public static void main(String[] args) {
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Good meal :)");
            }
        };
        e.eat();
    }
}
