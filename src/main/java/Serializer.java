import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface Serializer<T> {
    String Serialize(T obj) throws IOException;
    T Deserialize(String obj) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
