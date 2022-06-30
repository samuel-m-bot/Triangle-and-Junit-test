import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
    Triangle t;

    @Test
    public void getType() {
        t = new Triangle(3,  3,  3);
        assertEquals("Equilateral",t.getType());
    }
    @Test
    public void getType2() {
        t = new Triangle(3,3,2);
        assertEquals("Isosceles",t.getType());
    }
    @Test
    public void getType3() {
        t = new Triangle(3,4,5);
        assertEquals("Scalene",t.getType());
    }
    @Test
    public void getType4() {
        t = new Triangle(3,4,0);
        assertEquals("Not a triangle",t.getType());
    }
}
