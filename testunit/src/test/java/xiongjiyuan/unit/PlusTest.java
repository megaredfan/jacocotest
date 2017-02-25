package xiongjiyuan.unit;

import org.junit.Test;
import xiongjiyuan.core.ObjectInvoke;
import xiongjiyuan.test.main.TestMain;

/**
 * Created by xiongjiyuan on 2017/2/24.
 */
public class PlusTest {
    @Test
    public void test() {
        TestMain.test();
        new ObjectInvoke().invoke("2", "3");
    }
}
