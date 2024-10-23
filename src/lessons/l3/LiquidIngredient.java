package lessons.l3;

public class LiquidIngredient extends Ingredient {
    public LiquidIngredient(String name, int volumeInMl) {
        super(name, volumeInMl + " ml");
    }

    @Override
    public String howToMeasure() {
        return "pour in a cup";
    }
}
