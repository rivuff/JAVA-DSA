package LLD.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Email e1 = new Email("Rivu", "someone", "body body");
        PremiumEmail e3 = new PremiumEmail("Rivu", "someone", "body", "cc", "bc");

        Email ee = e1.copy();
        PremiumEmail pe2 = e3.copy();
    }
}
