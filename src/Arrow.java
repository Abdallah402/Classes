public class Arrow extends Weapon {
    public Arrow() {
        super("Arrow", "A arrow. Better for long range attacks.",
                10, 20);
    }
    public Arrow(String name, String description, int value, int damage) {
        super("", "Used by a bow",
                10, 20);

    }
}