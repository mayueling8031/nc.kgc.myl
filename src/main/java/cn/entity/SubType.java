package cn.entity;

import java.io.Serializable;
//商品小分类信息表
public class SubType implements Serializable {
    private Integer id;
    private String typeName;
    private String superType;

    public SubType() {
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

    public String getSuperType() {
        return superType;
    }

    public void setSuperType(String superType) {
        this.superType = superType;
    }
}
