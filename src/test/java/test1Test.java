import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class test1Test {
    test1 t = new test1();
    @ParameterizedTest
    @DisplayName("Tests the negative method")
    @ValueSource(ints = {5,10,15,20,200,1390})
    void negative_test(int val){
        assertTrue(t.negative(val) < 0);
    }
}