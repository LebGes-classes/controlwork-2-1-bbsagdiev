
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {

    @Test
    void testPutAndGet() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("один", 1);
        hashMap.put("два", 2);
        hashMap.put("три", 3);

        assertEquals(1, hashMap.get("один"));
        assertEquals(2, hashMap.get("два"));
        assertEquals(3, hashMap.get("три"));
    }

    @Test
    void testPutSameKey() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("один", 1);
        hashMap.put("один", 100);

        assertEquals(100, hashMap.get("один"));
    }

    @Test
    void testGetNonExistentKey() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("один", 1);
        assertNull(hashMap.get("два"));
    }

    @Test
    void testNullKey() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(null, 5);
        assertEquals(5, hashMap.get(null));
    }

    @Test
    void testNullKeyCollision() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(null, 5);
        hashMap.put(null, 10);
        assertEquals(10, hashMap.get(null));
    }

    @Test
    void testCapacityIncrease() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            hashMap.put(i, "Value" + i);
        }

        assertEquals("Value10", hashMap.get(10));
        assertEquals("Value19", hashMap.get(19));
    }


}
