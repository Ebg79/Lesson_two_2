public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int cash = 1100;
        int bonus = 1;
        int result;
        if (cash > 1000) {
            result = balance + cash + cash * bonus / 100;
        } else result = balance + cash;
        System.out.println(result);

    }
}