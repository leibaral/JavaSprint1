package N102;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

public class CalculoDNITest {
    @ParameterizedTest
    @CsvSource(value = {"12345678:Z", "67954325:C", "67225983:L", "46998455:W", "75100145:Q", "99123541:G", "65652278:C", "55128873:N", "76674212:D", "12259331:D"}, delimiter = ':')
    void lletraEsOk(int dni, char lletraf){
        String nif = new CalculoDNI(dni).dniComplet;
        Assert.assertEquals(lletraf, nif.charAt(8));
    }
}
