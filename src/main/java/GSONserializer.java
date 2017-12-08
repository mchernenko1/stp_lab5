import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GSONserializer<T> implements Serializer<T> {
    private Class<T> className;
    public GSONserializer(Class<T> cls){
        className=cls;
    }
    @Override
    public String Serialize(T obj) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(obj);
    }

    @Override
    public T Deserialize(String obj) {
        Gson gson = new GsonBuilder().create();
        return  gson.fromJson(obj,className);
    }
}
