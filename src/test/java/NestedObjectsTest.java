import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NestedObjectsTest {
    NestedObject testObj;
    String testField;

    @Before
    public void init(){
        testObj= new NestedObject("NAME");
        testField="123";
    }

    @Test
    public void getterSetterTest(){
        Assert.assertNotEquals(testField,testObj.getFieldName());
        testObj.setFieldName(testField);
        Assert.assertEquals(testField,testObj.getFieldName());
    }




}
