import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TaakBVeilingTest {
    @Test
    public void geenBodIs0(){
        TaakBVeiling veiling = new TaakBVeiling();
        assertThat(veiling.getHoogsteBod()).isZero();
    }
    @Test
    public void bodIsGelijkAanHoogsteBod(){
        TaakBVeiling veiling = new TaakBVeiling();
        veiling.doeBod(100);
        assertThat(veiling.getHoogsteBod()).isEqualTo(100);
    }
    @Test
    public void meerdereBodenHoogsteBodIsHoogsteBedrag(){
        TaakBVeiling veiling = new TaakBVeiling();
        veiling.doeBod(120);
        veiling.doeBod(250);
        veiling.doeBod(150);
        assertThat(veiling.getHoogsteBod()).isEqualTo(250);
    }
}
