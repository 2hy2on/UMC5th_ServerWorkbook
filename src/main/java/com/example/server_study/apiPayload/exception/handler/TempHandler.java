package com.example.server_study.apiPayload.exception.handler;

import  com.example.server_study.apiPayload.code.BaseErrorCode;
import  com.example.server_study.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode){
        super(errorCode);
    }
}
