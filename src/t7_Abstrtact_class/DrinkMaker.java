package t7_Abstrtact_class;

public abstract class DrinkMaker {
    public abstract void getRightCup();
    public abstract void addIngredients();
    public abstract void pour();

    void makeDrink(){
        getRightCup();
        addIngredients();
        pour();
    }
}
