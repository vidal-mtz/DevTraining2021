package com.sngular.devTrining2021.test.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
        //Implement tests cases
        assertEquals("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu",AlgorithmName.accum("ZpglnRxqenU"),);
        assertEquals("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb",AlgorithmName.accum("NyffsGeyylB"));
        assertEquals("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu",AlgorithmName.accum("MjtkuBovqrU"),);
        assertEquals("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm",AlgorithmName.accum("EvidjUnokmM"));
        assertEquals( "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc",AlgorithmName.accum("HbideVbxncC"));
    }
}