package xiongjiyuan.core;

/**
 * Created by xiongjiyuan on 2017/2/25.
 */
public class ObjectInvoke {
    public void invoke(String args1, String args2) {
        MockObject mock = new ObjectFactory().getObject();
        mock.execute(args1, args2);
    }

}
