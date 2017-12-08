import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class OrgJsonSerializerTest {
    String resultAfterDeserialize = "1 nested [qwerty, why not]";
    String resultAfterSerialize = "{\"fieldNumber\":1,\"fieldObject\":{\"fieldName\":\"nested\"},\"fieldList\":[\"qwerty\",\"why not\"]}";
    SerializableObject testObj;
    Serializer<SerializableObject> ser;

    @Before
    public  void init(){NestedObject nestedObj;
        ser = new ORGJSON();
        ArrayList<String> list = new ArrayList<String>();
        list.add("qwerty");
        list.add("why not");
        nestedObj = new NestedObject("nested");
        testObj = new SerializableObject(1,nestedObj,list);
    }

    @Test
    public void OrgJsonTest() throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String res = ser.Serialize(testObj);
        Assert.assertEquals(resultAfterSerialize,res);
        SerializableObject  resultObj = ser.Deserialize(res);
        Assert.assertEquals(resultAfterDeserialize,resultObj.toString());
    }
}
