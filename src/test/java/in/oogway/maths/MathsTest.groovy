package in.oogway.maths
import spock.lang.Specification

class MathsTest extends Specification {
    def "addition of two int numbers"(int a,int b) {
        expect:
        Maths.add(a,b)==Math.addExact(a,b)

        where:
        a | b
        1 | 3
        -1 | 4
        2 | -8
        -1 | -4
        0 | 2
        3| 0
        2147483642 | 3
        0|0
    }

    def "addition of two floats"(float x,float y) {
        float z=x+y
        expect:
        Maths.add(x,y)==z

        where:
        x | y
        1 | 3
        7 | 4
        5| 4.3
        9.8|9.9
        7.5|5
        4.7|0
        0|8.5
        0|0
        -9.7|9
        -9.8|7.6
        4|-7.9
    }
}

