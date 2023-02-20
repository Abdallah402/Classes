public class Wizard extends Enemy{
    private Spells spells;
    public Wizard(Spells spells) {
        super("Wizard", 20, 15);
        this.spells = spells;
    }


}
