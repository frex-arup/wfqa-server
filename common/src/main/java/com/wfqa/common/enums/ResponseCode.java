package com.wfqa.common.enums;

public enum ResponseCode {
    
    CREATED(1001),
    UPDATED(1002),
    DELETED(1003),
    CAN_NOT_BE_DELETED(1004),
    UPLOADED(1005),
    ENABLED(1006),
    DISABLED(1007),
    NO_DATA_AVAILABLE(1008),
    FETCHED_SUCCESSFULLY(1009),
    ASSIGNED(1010),
    
    DUPLICATE_ENTRY(2000),
    NO_DESCRIPTION(4000),
    NO_PERMISSION(4001);
    
    
    private Integer errorCode;

    private ResponseCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getResponseStatus() {
        return errorCode;
    }
    
    public int value() {
        return errorCode;
    }

}
