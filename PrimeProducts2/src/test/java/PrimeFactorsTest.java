import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.*;

public class PrimeFactorsTest {
    @Test
    void thereAreNoPrimeFactorsFor1() {
        Assertions.assertEquals(emptyList(), new PrimeFactors().of(1));
    }

    @Test
    void primeFactorOf2Is2Itself() {
        Assertions.assertEquals(singletonList(2), new PrimeFactors().of(2));
    }
}