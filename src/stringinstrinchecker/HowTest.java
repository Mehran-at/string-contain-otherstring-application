package stringinstrinchecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HowTest {
How how = new How();
    @ParameterizedTest
    @CsvSource({
            "abcdef,bcd,true",
            "sdfsf,sdfd,false",
            "adasd,32,false",
            "dasdsfsdfgdgghfgsdfgsdfg,dfg,true",
            "ooo,oo,true"
    })
    void contain(String one, String two, Boolean expected) {
        Boolean actual = how.contain(one, two);
        Assertions.assertEquals(actual, expected);
    }
}