import org.codehaus.jackson.map.*;

import java.io.IOException;

public class Jackson<T> implements Serializer<T> {
    private Class<T> className;
    public Jackson(Class<T> cls){
        className=cls;
    }
    @Override
    public String Serialize(T obj) throws IOException {
        ObjectMapper map=new ObjectMapper();
        map.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
        return map.writeValueAsString(obj);

    }

    @Override
    public T Deserialize(String obj) throws IOException {
        ObjectMapper map=new ObjectMapper();
        return map.readValue(obj,className);
    }
}
