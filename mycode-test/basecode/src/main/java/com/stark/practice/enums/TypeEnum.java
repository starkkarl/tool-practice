package com.stark.practice.enums;

public enum TypeEnum {
    USER_STRING("1","用户接口"),PRODUCT_SERVICE("2","产品接口"),TEST_SERVICE("3","测试接口");
    private String no;
    private String name;

    TypeEnum(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TypeEnum getByNo(String no){
        for (TypeEnum value : values()) {
            if(value.getNo().equals(no)){
                return value;
            }
        }
        return null;
    }
}
