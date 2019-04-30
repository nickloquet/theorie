import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThat;

public class RekeningTest {

    private Rekening rekening;
    @Before
    public void before(){
        rekening = new Rekening();
    }
    @Test
    public void hetSaldoVanEenNieuweRekeningIsNul(){
        assertThat(rekening.getSaldo()).isZero();
    }
    @Test
    public void nadatJe10StortIsSaldo10(){
        rekening.stort(BigDecimal.TEN);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("10");
    }
    @Test
    public void naJe10En1Stort(){
        rekening.stort(BigDecimal.TEN);
        rekening.stort(BigDecimal.ONE);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("11");
    }
}
