package t7_Abstrtact_class;

public class Main {
    public static void main(String[] args) {
        WhiteCoffe latte = new WhiteCoffe();
        TeaMaker tea = new TeaMaker();

        latte.makeDrink();
        tea.makeDrink();
    }
}

