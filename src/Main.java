public class Main {

    public static void main(String[] args) {
        int startAccount = 1500;
        int addedMoney = 1000;

        int bonus = addedMoney >= 1000 ? addedMoney / 100 : 0;

        int finalAccount = startAccount + addedMoney + bonus;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счёе: " + finalAccount);
    }
}