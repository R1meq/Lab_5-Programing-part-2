package ua.lviv.iot.algo.part1.lab_5;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
;import static org.junit.Assert.assertArrayEquals;

public class TextReaderTest {

    @Test
    public void testInput() throws Exception {
        String input = "The_ Lockheed_ SR_71 Blackbird_ is_ a _long-range_" +
                " _high_altitude_, Mach 3+ _strategic_reconnaissance" +
                "aircraft_  developed_and__manufactured_bythe_American" +
                "_aerospace company Lockheed_ Corporation._It _was_ " +
                "operated_ by _the_ United States_ Air Force_(USAF)_and NASA";
        byte[] buf  = input.getBytes();
        InputStream in = new ByteArrayInputStream(buf);
        System.setIn(in);

        String result = TextReader.inPutTextReader();
        Assertions.assertEquals(input,result);
    }

    @org.junit.Test
    public void testIntType(){
        String word = "2";
        byte[] buf = word.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        System.setIn(byteArrayInputStream);

        int result = TextReader.getMaxLengthOfWord();
        Assertions.assertEquals(2,result);
    }


    @org.junit.Test
    public void testIntTypeButLessThan1(){
        String word = "-1\n2";
        byte[] buf = word.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        System.setIn(byteArrayInputStream);

        int result = TextReader.getMaxLengthOfWord();
        Assertions.assertEquals(2,result);
    }

    @org.junit.Test
    public void testIsIntType(){
        String word = "string\n2";
        byte[] buf = word.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        System.setIn(byteArrayInputStream);

        int result = TextReader.getMaxLengthOfWord();
        Assertions.assertEquals(2,result);
    }
}
