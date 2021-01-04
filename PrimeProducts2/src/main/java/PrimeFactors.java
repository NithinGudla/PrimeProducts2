import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

    public List<Integer> of(int n){

        if(n == 1)
            return new ArrayList<>();
        return Collections.singletonList(2);
    }
}