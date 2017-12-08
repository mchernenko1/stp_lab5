public class NestedObject {
    private String fieldName;

    public  NestedObject(String fieldName){this.fieldName=fieldName;}
    public NestedObject(){}
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        return fieldName;
    }
}
