package com.stark.practice.service;

import com.stark.practice.enums.TypeEnum;

public interface BaseService {
    public TypeEnum getType();
    public abstract String selectService(String str);
}
