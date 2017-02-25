package xiongjiyuan.core.test;

import org.junit.Test;
import xiongjiyuan.core.ObjectInvoke;
import xiongjiyuan.core.PlusFunction;

/**
 * Created by xiongjiyuan on 2017/2/24.
 */
public class TestCore {
    @Test
    public void test() {
//        System.out.println(PlusFunction.plus(2, 4));
        new ObjectInvoke().invoke("2", "2");
    }
}
