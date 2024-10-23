package lessons.l3;

public class Cooking {
    public static void main(String[] args) {
        Ingredient potatoes = new SolidIngredient("potatoes",1.5);
        System.out.println(potatoes.getDescription());

        Ingredient milk = new LiquidIngredient("milk", 100);
        System.out.println(milk.getDescription());

        Ingredient[] allIngredients = {potatoes, milk};

        for (Ingredient ingredient:allIngredients){
            System.out.println(ingredient.howToMeasure() + " " + ingredient.getDescription());
        }

    }




}
