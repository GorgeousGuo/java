package com.guo.bean2;

import javax.xml.crypto.Data;
import java.util.*;

public class Bean1 {
    private String strValue;

    private int intValue;

    private Map mapValue;

    private Set setValue;

    private List listValue;

    private String [] arrayValue;

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    //
    private Date dateValue;


    public Bean1(){

    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public Map getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map mapValue) {
        this.mapValue = mapValue;
    }

    public Set getSetValue() {
        return setValue;
    }

    public void setSetValue(Set setValue) {
        this.setValue = setValue;
    }

    public List getListValue() {
        return listValue;
    }

    public void setListValue(List listValue) {
        this.listValue = listValue;
    }

    public String[] getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(String[] arrayValue) {
        this.arrayValue = arrayValue;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "strValue='" + strValue + '\'' +
                ", intValue=" + intValue +
                ", mapValue=" + mapValue +
                ", setValue=" + setValue +
                ", listValue=" + listValue +
                ", arrayValue=" + Arrays.toString(arrayValue) +
                '}';
    }
}
