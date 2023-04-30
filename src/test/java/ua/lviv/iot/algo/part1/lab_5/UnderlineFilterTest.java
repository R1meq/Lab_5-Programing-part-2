package ua.lviv.iot.algo.part1.lab_5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnderlineFilterTest {
    @Test
    public void testWriteSomeWorlds() {
        String input = "Hello World_ and _Earth_";
        int lengthOfWord = 4;

        List<String> expected = new ArrayList<>();
        expected.add("world");
        expected.add("earth");
        Collections.sort(expected);
        List<String> result = UnderlineFilter.sortedListWithUnderlineWords(input,lengthOfWord);
        Assertions.assertEquals(expected,result);
    }


    @Test
    public void testAllPossibleOptions(){
        String input = " _ _q _Hello woRLD_ _Mind_ Hea_D _To_R Fac_E_ _HeADer_s_  ";
        int lengthOfWord= 1;

        List<String> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("world");
        expected.add("mind");
        expected.add("head");
        expected.add("tor");
        expected.add("face");
        expected.add("headers");
        Collections.sort(expected);

        List<String> result = UnderlineFilter.sortedListWithUnderlineWords(input,lengthOfWord);

        Assertions.assertEquals(expected,result);
    }
}
