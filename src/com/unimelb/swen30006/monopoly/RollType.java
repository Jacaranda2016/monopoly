package com.unimelb.swen30006.monopoly;

public enum RollType {
    RANDOM, USER , FILE , FILE_USER ;


    public static RollType fromValue(int value){
            if (value==0){
                return RANDOM;
            }else if(value==1){
                return USER;
            }else if(value==2){
                return FILE;
            }else {
                return FILE_USER;
            }
    }
}
