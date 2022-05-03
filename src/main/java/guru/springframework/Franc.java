package guru.springframework;

public class Franc {
    private int amount;
    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc( amount * multiplier);
    }
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object object){
        Franc franc = (Franc) object; // cast into Dollar type
        return amount == franc.amount;
    }
}
