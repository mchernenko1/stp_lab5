
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ORGJSON implements Serializer<SerializableObject> {

    @Override
    public String Serialize(SerializableObject obj) {
        JSONObject objJS = new JSONObject(obj);
        return objJS.toString();
    }

    @Override
    public SerializableObject Deserialize(String obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        JSONObject json = new JSONObject(obj);
        SerializableObject result = new SerializableObject();
        result.setFieldNumber(json.getInt("fieldNumber"));

        NestedObject objNest = new NestedObject();
        if(!json.isNull("fieldObject")) {
            objNest.setFieldName(json.getJSONObject("fieldObject").getString("fieldName"));
            result.setFieldObject(objNest);
        }
        if(!json.isNull("fieldObject")){
        ArrayList<String> resList = new ArrayList<>();
        JSONArray arr = json.getJSONArray("fieldList");
        for(int i =0;i<arr.length();i++){
            resList.add(arr.get(i).toString());
        }
        result.setFieldList(resList);
        }
        return result;
    }



}
