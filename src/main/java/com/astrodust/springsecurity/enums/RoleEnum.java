package com.astrodust.springsecurity.enums;

public enum RoleEnum {
    ADMIN(5), USER(4), MODERATOR(3);
    private int rank;
    RoleEnum(int val){
        this.rank = val;
    }
    public int getRank(){
        return this.rank;
    }
}
