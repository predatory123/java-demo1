package com.qa.xuexiaoxiao.eighteen;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * junit单元测试
 *
 * @author: wenyongjie
 * @date: 2021/7/4 17:52
 */
public class EinfacheTests {

    @Test
    public void ganzEinfacherTest() {
        assertEquals("Schuhe", "Schuhe");
        assertTrue(2 == 2);
        assertFalse(2 == 7);
        assertNotNull("ZWEI");
        assertNull(null);
    }

    @Test
    public void testAuoString() {
        assertEquals("Sachrodinger","SchroDinger");
    }

}
