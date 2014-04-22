package kr.pe.ihoney.groovy.study.begin

import static org.junit.Assert.*;

import org.junit.Test;

class CollectTest {

    @Test
    void 일반적인범위테스트() {
        assert (0..10).contains(0)
        assert (0..10).contains(5)
        assert (0..10).contains(10)

        assert (0..10).contains(-1) == false
        assert (0..10).contains(11) == false
    }

    @Test
    void 한쪽경계만_포함하는_범위_테스트() {
        assert (0..<10).contains(9)
        assert (0..<10).contains(10) == false
    }

    @Test
    void 범위를_가지는_참조변수를_이용한테스트() {
        def a = 0..10
        assert a instanceof Range<Comparable>
        assert a.contains(0)
        assert a.contains(5)
        assert a.contains(10)
    }

    @Test
    void 명시적으로_범위선언() {
        def a = new IntRange(0, 10)
        assert a.contains(5)
        assert a.contains(10)
        assert (0.0..1.0).containsWithinBounds(0.5)
    }

    @Test
    void 날짜범위(){
        def today = new Date()
        def yesterday = today -1
        assert (yesterday..today).size() == 2
    }

    @Test
    void 문자범위() {
        assert ('a'..'c').contains('b')
    }

    @Test
    void 범위가사용된_for루프() {
        def log = ''
        for(element in 5..9) {
            log += element
        }
        assert log == '56789'
    }

    @Test
    void 역범위가사용된_for루프() {
        def log = ''
        for(element in 9..5) {
            log += element
        }
        assert log =='98765'
    }

    @Test
    void 한쪽경계만포함한_역범위를_클로저로되풀이() {
        def log = ''
        (9..<5).each { element -> log += element }
        assert log == '9876'
    }
    //범위는 객체다!
    @Test
    void 범위를이용한_되풀이() {
        def result = ''
        (5..9).each { element -> result += element }
        assert result == '56789'

        assert (0..10).isCase(5)
    }

    @Test
    void 분류에_범위_사용하기() {
        def age = 36
        def insuranceRate = 0
        switch(age) {
            case 16..20: insuranceRate = 0.05; break
            case 21..50: insuranceRate = 0.06; break
            case 51..65: insuranceRate = 0.07; break
            default: throw new IllegalArgumentException()
        }
        assert insuranceRate == 0.06
    }

    @Test
    void 범위를_이용한_필터링() {
        def ages = [20, 36, 42, 51]
        def midage = 21..50
        assert ages.grep(midage) == [36, 42]
    }
    
    @Test
    void 리스트_재정의_연산() {
        def myList = ['a', 'b', 'c', 'd', 'e', 'f']
        
        assert myList[0..2] == ['a', 'b', 'c']
        assert myList[0,2,4] == ['a', 'c', 'e']
        
        myList[0..2] = ['x', 'y', 'z']
        assert myList == ['x', 'y', 'z', 'd', 'e', 'f']
        
        myList[3..5] = []
        assert myList == ['x', 'y', 'z']
        
        myList[1..1] = ['y', '1', '2']
        assert myList == ['x', 'y', '1', '2', 'z']
    }
}
