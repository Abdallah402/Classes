public class Pillow extends Weapon {
    public Pillow() {
        super("Pillow", "Made of soft wool to sleep on",
                10, 5);

    }
    public Pillow(String name, String description, int value, int damage) {
        super("Soft Pillow", "A pillow made from sheep wool",
                10, 20);
    }
}