package kr.pe.ihoney.groovy.study.begin

import static org.junit.Assert.*;

import org.junit.Test;

class MapTest {

    @Test
    void 맵정의방법() {
        def myMap = [a:1, b:2, c:3]

        assert myMap instanceof HashMap
        assert myMap.size() == 3
        assert myMap['a'] == 1

        def emptyMap = []
        assert emptyMap.size() == 0

        def explicitMap = new TreeMap()
        explicitMap.putAll(myMap)
        assert explicitMap.size() == 3
        assert explicitMap['a'] == 1
    }
    
    @Test
    void 맵에서_요소_얻기() {
        def myMap = [a:1, b:2, c:3]
        assert myMap['a'] == 1
        assert myMap.a == 1
        assert myMap.get('a') == 1
        assert myMap.get('a', 0) == 1
    }
    
    @Test
    void 없는요소_가져오기() {
        def myMap = [a:1, b:2, c:3]
        assert myMap.d == null
        assert myMap.get('d') == null
    }
    
    @Test
    void 디폴트값을_지정하면서_얻기() {
        def myMap = [a:1, b:2, c:3]
        assert myMap.get('d', 0) == 0
    }
    
    @Test
    void 맵에서_간단하게_할당하기() {
        def myMap = [a:1, b:2, c:3]
        myMap['d'] = 4
        assert myMap.d == 4
        myMap.d = 5
        assert myMap.d == 5
    }
}
