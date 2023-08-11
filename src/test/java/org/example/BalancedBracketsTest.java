package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class BalancedBracketsTest {
    String balancedParens = "(1)";
    String tooManyOpenParens = "((1";
    String tooManyOpenParens1 = "(1)(";
    String tooManyClosedParens = "(1))";
    String startClosedParens = ")(";
    String emptyString = "";
    String balancedAngleBrackets = "<<>>";
    String balancedComboBrackets = "<({})>";
    String mismatchedBrackets = "<({)}>";

    BalancedBrackets bb = new BalancedBrackets();

    @Test
    public void testBalancedBrackets_balancedParens() {
      assertTrue(bb.balancedBrackets("(1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens() {
      assertFalse(bb.balancedBrackets("({1)"));
    }

    @Test
    public void testBalancedBrackets_tooManyClosedParens() {
      assertFalse(bb.balancedBrackets("({1})>"));
    }

    @Test
    public void testBalancedBrackets_startWithClosedParens() {
      assertFalse(bb.balancedBrackets(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
      assertTrue(bb.balancedBrackets(""));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
      assertTrue(bb.balancedBrackets("<({})>"));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
      assertTrue(bb.balancedBrackets("<({)}>"));
    }


    Object [] [] expectedOutputs = {
            { balancedParens, true},
            { balancedAngleBrackets, true },
            { balancedComboBrackets, true },
            { emptyString, true},
            { tooManyOpenParens, false },
            { tooManyClosedParens, false },
            { startClosedParens, false },
            { mismatchedBrackets, false }
    };

    return Arrays.asList(expectedOutputs);
}