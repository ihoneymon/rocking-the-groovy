package kr.pe.ihoney.groovy.study.begin;

import static org.junit.Assert.*;

import org.junit.Test;

class MoneyTest {

    Money money
    
    @Test
    public void test() {
        def bulk = new Money(1000, "WON")
        assert bulk
        assert bulk == new Money(1000, "WON")
        assert bulk + bulk == new Money(2000, "WON")
    }

}
