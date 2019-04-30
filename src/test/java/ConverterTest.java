import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {
    @Test
    public void eenInchIs254Centimeter(){
        Converter converter = new Converter();
        assertThat(converter.inchNaarCenti(BigDecimal.ONE)).isEqualByComparingTo("2.54");
    }
    @Test
    public void tweehonderdInchesIs508Centimeter(){
        Converter converter = new Converter();
        assertThat(converter.inchNaarCenti(BigDecimal.valueOf(200)))
                .isEqualByComparingTo(BigDecimal.valueOf(508));
    }
}

//kan met BigDecimal.valueOf(..) of met String: ("..")