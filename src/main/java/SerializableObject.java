import java.util.ArrayList;

public class SerializableObject {
    private int fieldNumber;
    private NestedObject fieldObject;
    private ArrayList<String> fieldList;

    public SerializableObject(int fieldNumber,NestedObject fieldObj,ArrayList<String> fieldList) {
        this.fieldNumber = fieldNumber;
        this.fieldObject=fieldObj;
        this.fieldList=fieldList;
    }
    public SerializableObject(){}

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public NestedObject getFieldObject() {
        return fieldObject;
    }

    public void setFieldObject(NestedObject fieldObject) {
        this.fieldObject = fieldObject;
    }

    public ArrayList<String> getFieldList() {
        return fieldList;
    }

    public void setFieldList(ArrayList<String> fieldList) {
        this.fieldList = fieldList;
    }

    @Override
    public String toString() {
        return fieldNumber+" "+fieldObject.toString()+" "+fieldList.toString();
    }
}
