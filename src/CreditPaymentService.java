public class CreditPaymentService {

    public double calculate(double credit, double percent, double term) {
        double monthlyRate = percent / 12;
        double coefficient = (monthlyRate * Math.pow(1 + monthlyRate, term)) / (Math.pow(1 + monthlyRate, term) -1);
        double monthlyPayment = Math.round(credit * coefficient);

        return monthlyPayment;
    }
}
