import java.math.BigDecimal;

public class Converter {
    private static final BigDecimal CENT_IN_INCH = BigDecimal.valueOf(2.54);

    public BigDecimal inchNaarCenti(BigDecimal inches){
        return inches.multiply(CENT_IN_INCH);
    }
}
