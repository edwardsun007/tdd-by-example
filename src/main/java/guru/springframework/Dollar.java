package guru.springframework;

public class Dollar {
    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar( amount * multiplier);
    }
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object; // cast into Dollar type
        return amount == dollar.amount;
    }
}
