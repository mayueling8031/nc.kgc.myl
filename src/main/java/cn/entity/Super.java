package cn.entity;

import java.io.Serializable;

public class Super implements Serializable {
    private Integer id;
    private String typeName;

    public Super() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
