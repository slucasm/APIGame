package edu.upc.eetac.dsa;

public class Objectt {

    public String idObject;
    public String objectName;

    public Objectt() {
    }

    public Objectt(String idObject, String objectName) {
        this.idObject = idObject;
        this.objectName = objectName;
    }

    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
