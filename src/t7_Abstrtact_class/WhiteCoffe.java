package t7_Abstrtact_class;

public class WhiteCoffe extends DrinkMaker{
    @Override
    public void getRightCup() {
        System.out.println("Weź filiżankę kawy");
    }

    @Override
    public void addIngredients() {
        System.out.println("Zrób kawę");
    }

    @Override
    public void pour() {
        System.out.println("Napełnij spienionym mlekiem");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
