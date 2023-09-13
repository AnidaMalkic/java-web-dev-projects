package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void isBalancedWithTwoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedbrackets((str "[[]]"))
    }


    @Test
    public void failsIfNotBalancedBalanced(){
        assertFalse(BalancedBrackets.hasBalancedbrackets((str "[[]]"))
    }

    @Test
    public void failsIfBracketsBackwards(){
        assertFalse(BalancedBrackets.hasBalancedbrackets((str "[[]]"))
    }

}