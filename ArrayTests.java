import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test 
	public void testReverseArray3() {
    int[] input1 = { 3, 1, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 1, 3 }, input1);
	}
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed2() {
    int[] input1 = { 5, 4, 3 };
    assertArrayEquals(new int[]{ 3, 4, 5 }, ArrayExamples.reversed(input1));
  }

}
