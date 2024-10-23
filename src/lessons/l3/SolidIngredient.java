package lessons.l3;

public class SolidIngredient extends Ingredient {

    public SolidIngredient(String name, double weight) {
        super(name, weight + " kg");
    }

    @Override
    public String howToMeasure() {
        return "weigh on a scale";
    }
}
