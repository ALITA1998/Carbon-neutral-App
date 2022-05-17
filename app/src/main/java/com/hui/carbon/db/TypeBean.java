package com.hui.carbon.db;
/*
* 表示收入或者支出具体类型的类
* */
public class TypeBean {
    int id;
    String typename;   //类型名称
    int imageId;    //未被选中图片id
    int simageId;    //被选中图片id
    int kind;     //收入-1  支出-0
    float carbon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getSimageId() {
        return simageId;
    }

    public void setSimageId(int simageId) {
        this.simageId = simageId;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public void setCarbon(float carbon){this.carbon = carbon;}

    public float getCarbon(float carbon){return carbon;}


    public TypeBean() {
    }

    public TypeBean(int id, String typename, int imageId, int simageId, int kind, float carbon) {
        this.id = id;
        this.typename = typename;
        this.imageId = imageId;
        this.simageId = simageId;
        this.kind = kind;
        this.carbon = carbon;
    }
}