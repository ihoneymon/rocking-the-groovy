package kr.pe.ihoney.groovy.study.begin

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

class CalculateTest {

    Calculate cal

    @Before
    void before() {
        cal = new Calculate();
    }

    @Test
    void 더하기() {
        int result = cal.add(10, 15)
        assertThat(result, is(25))
    }
}
