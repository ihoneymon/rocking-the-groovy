package kr.pe.ihoney.groovy.study.begin

import static org.junit.Assert.*;

import org.junit.Test;

class GStringTest {
    def me = 'Tarzan'
    def you = 'Jane'
    def line = "me $me - you $you"
    def twister = 'she sells sea shells at the sea shore of seychelles'

    @Test
    void testReference() {
        assert "abc" == /abc/
        assert twister =~ /s.a/
        print line
    }    
}
