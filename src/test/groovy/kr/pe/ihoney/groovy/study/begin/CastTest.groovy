package kr.pe.ihoney.groovy.study.begin

import static org.junit.Assert.*;

import org.junit.Test;

class CastTest {

    @Test
    void testAutoboxing() {
        assert 'ABCDE'.indexOf(67) == 2
    }
    
    @Test
    void testOperator() {
        assert 3.plus(4) == 7
        assert 7.minus(4) == 3
        assert 4.multiply(5) == 20
        assert 28.div(7) == 4
        assert 4.next() == 5
        assert 13.previous() == 12
    }
}
