//@Author Kevin Techen

package MyTestProg;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleTest {
	
	private int a = 30;
	private int b = 20;
	private int result = 10;
	
	 @Test public void testGCDDivRestItCmd() {
		 assertTrue(GCDDivRestItCmd.EuclidDivisionRestIterative(a, b) == result);
	 }
	 
	 @Test public void testGCDDivRestRecCmd() {
		 assertTrue(GCDDivRestRecCmd.EuclidDivisionRestRecursive(a, b) == result);
	 }
	 
	 @Test public void testGCDSubItCmd() {
		 assertTrue(GCDSubItCmd.EuclidSubstractionIterative(a, b) == result);
	 }
	 
	 @Test public void testGCDSubRecCmd() {
		 assertTrue(GCDSubRecCmd.EuclidSubstractionRecursive(a, b) == result);
	 }
	 
}

