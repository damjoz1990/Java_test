package t7_Abstrtact_class;

public class TeaMaker extends DrinkMaker{
    @Override
    public void getRightCup() {
        System.out.println("Weź kubek na herbatę");
    }

    @Override
    public void addIngredients() {
        System.out.println("Dodaj liście herbaty");
    }

    @Override
    public void pour() {
        System.out.println("Napełnij wrzątkiem");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
