package TestPackage;

public class ChangedFields
{
        public String fieldType;
        public String fieldName;

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public ChangedFields(String fieldType, String fieldName) {
        this.fieldType = fieldType;
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        return "ChangedFields{" +
                "fieldType='" + fieldType + '\'' +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}
