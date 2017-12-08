import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SerializeObjectTest {
    SerializableObject objTest;
    NestedObject nesObjTest;
    ArrayList<String> list;
    @Before
    public void init(){
        nesObjTest=new NestedObject("NESTED");
        list = new ArrayList<String>();
        list.add("qwerty");
        list.add("why not");
        objTest = new SerializableObject(15,nesObjTest,list);
    }

    @Test
    public void fieldNumberTest(){
        Assert.assertNotEquals(20,objTest.getFieldNumber());
        objTest.setFieldNumber(20);
        Assert.assertEquals(20,objTest.getFieldNumber());
    }
    @Test
    public void fieldObjectTest(){
        Assert.assertNotEquals(new NestedObject("obj").toString(),objTest.getFieldObject().toString());
        objTest.setFieldObject(new NestedObject("obj"));
        Assert.assertEquals(new NestedObject("obj").toString(),objTest.getFieldObject().toString());
    }
    @Test
    public void fieldListTest(){
        Assert.assertNotEquals(null,objTest.getFieldList());
        Assert.assertEquals(list,objTest.getFieldList());
    }
}
