package com.one7.more;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringReverseTest {

    @Test
    @DisplayName("Test String Reverse")
    public void mainTest() {
        String testString = "abc";
        String output = StringReverse.solution2(testString);
        Assertions.assertEquals("cba", output);
    }

}