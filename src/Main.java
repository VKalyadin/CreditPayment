public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1000000;
        double percent = 0.0999;
        double term = 12;

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту сроком 1 год");
        System.out.println(service.calculate(credit, percent, term));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту сроком 2 года");
        System.out.println(service.calculate(credit, percent, 24));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту сроком 3 года");
        System.out.println(service.calculate(credit, percent, 36));

    }
}