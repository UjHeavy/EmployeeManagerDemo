package com.example.employee;

public class EmployeeModel {

    private int id;
    private String name;
    private EmpTypeEnum typeEnum;

    public EmployeeModel() {}

    public EmployeeModel(EmployeeModel other) {
        this.id = other.id;
        this.name = other.name;
        this.typeEnum = other.typeEnum;
    }

    public void setId(int tmpId) {
         this.id = tmpId;
    }

    public void setName(String tmpName) {
        this.name = tmpName;
    }

    public void setType(EmpTypeEnum tmpType) {
        this.typeEnum = tmpType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmpTypeEnum getType() {
        return typeEnum;
    }


}
