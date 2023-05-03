package ua.lviv.iot.algo.part1.lab_5;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class UnderlineFilterTest {

    public UnderlineFilter underlineFilter;
    public List<String> expected;

    @Before
    public void setUp() {
        underlineFilter = new UnderlineFilter();
        expected = new ArrayList<>();
    }

    @Test
    public void testAllPossibleOptions() {
        String input = "_q _Hello woRLD_ _Mind_ Hea_D _To_R Fac_E_ _HeADer_s_ qwerty";
        int lengthOfWord = 10;

        expected.add("q");
        expected.add("Hello");
        expected.add("woRLD");
        expected.add("Mind");
        expected.add("HeaD");
        expected.add("ToR");
        expected.add("FacE");
        expected.add("HeADers");

        expected.sort(String.CASE_INSENSITIVE_ORDER);
        List<String> result = underlineFilter.sortedListWithUnderlineWords(input, lengthOfWord);

        Assertions.assertTrue(result.containsAll(expected));
    }

    @Test
    public void testNoMatchesWord() {
        String inputText = " 12sad 213sad 213sa asd12";
        int lengthOfWord = 10;

        List<String> result = underlineFilter.
                sortedListWithUnderlineWords(inputText, lengthOfWord);

        Assertions.assertTrue(result.isEmpty());
    }
}
