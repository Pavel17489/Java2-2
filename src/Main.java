public class Main {
    public static void main(String[] args) {

        int cash = 350;
        int deposit = 250;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = cash + deposit + bonus;

        System.out.println("Итоговый счет: " + balance + " руб.");
        System.out.println("Бонусные рубли: " + bonus + " руб.");
    }
}