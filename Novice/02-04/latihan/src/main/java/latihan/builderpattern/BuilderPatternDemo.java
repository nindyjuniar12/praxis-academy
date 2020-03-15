package latihan.builderpattern;

public class BuilderPatternDemo
{
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Biaya: " + vegMeal.getBiaya());

        
        Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Veg Meal");
        nonvegMeal.showItems();
        System.out.println("Total Biaya: " + vegMeal.getBiaya());


    }
}