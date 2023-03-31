package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
      */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple1() {
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        StringBuffer target = new StringBuffer();
        for(int i = 0; i < 10; i++) {
            boolean currElemIsPrime = Primes.isPrime(arr[i]);
            if(currElemIsPrime){
                target.append(arr[i]*arr[i]).append(" -> ");
            }else {
                target.append(arr[i]).append(" -> ");
            }
        }
        target.delete(target.length()-4,target.length());
        IntList lst = IntList.of(arr);
        boolean changed = IntListExercises.squarePrimes(lst);

        assertEquals(target.toString(), lst.toString());
//        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple2() {
        for(int i = 0; i < 50; i++) {
            testSquarePrimesSimple1();
        }
    }
}


