public class Main {
    public static void main(String[] args) {
        int ticket = 17_357; // стоимость билета
        int costMile = 20; // количество рублей за одну бонусную милю

        int bonusMiles = (ticket / costMile);
        System.out.println("Итоговый результат: " + bonusMiles);
    }
}
