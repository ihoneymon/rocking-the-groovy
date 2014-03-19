package kr.pe.ihoney.groovy.study.begin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class FibonacciTest {

    Fibonacci fibonacci
    
    @Before
    void before() {
        fibonacci = new Fibonacci();
    }
    
    @Test
    public void test() {
        fibonacci.fibonacci(10, 10)
    }

}
