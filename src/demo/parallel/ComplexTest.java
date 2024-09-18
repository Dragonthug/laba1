package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 3);

        Complex result = a.plus(b);

        assertEquals(3, result.re);
        assertEquals(4, result.im);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(2, 3);

        Complex result = a.minus(b);

        assertEquals(3, result.re);
        assertEquals(4, result.im);
    }
}