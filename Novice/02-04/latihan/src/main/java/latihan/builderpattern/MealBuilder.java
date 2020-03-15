package latihan.builderpattern;

public class MealBuilder {

    public Meal prepareVegMeal (){
       Meal makan = new Meal();
       makan.addList(new VegBurger());
       makan.addList(new Coke());
       return makan;
    }   
 
    public Meal prepareNonVegMeal (){
       Meal makan = new Meal();
       makan.addList(new ChickenBurger());
       makan.addList(new Pepsi());
       return makan;
    }
 }