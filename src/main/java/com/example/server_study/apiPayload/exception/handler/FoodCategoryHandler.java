package com.example.server_study.apiPayload.exception.handler;

import  com.example.server_study.apiPayload.code.BaseErrorCode;
import  com.example.server_study.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode code) {
        super(code);
    }
}
