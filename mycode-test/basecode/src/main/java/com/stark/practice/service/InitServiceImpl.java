package com.stark.practice.service;

import com.stark.practice.enums.TypeEnum;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class InitServiceImpl implements ApplicationContextAware,InitializingBean {
    private Map<TypeEnum,BaseService> baseServiceMap;
    private ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        baseServiceMap = new HashMap<TypeEnum,BaseService>();
        Map<String, BaseService> beansOfTypeSpring = applicationContext.getBeansOfType(BaseService.class);
        Iterator<Map.Entry<String, BaseService>> iterator = beansOfTypeSpring.entrySet().iterator();
        BaseService baseService = null;
        while (iterator.hasNext()){
            baseService = iterator.next().getValue();
            baseServiceMap.put(baseService.getType(),baseService);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String testService(String no){
        TypeEnum byNo = TypeEnum.getByNo(no);
        BaseService baseService = baseServiceMap.get(byNo);
        String str = baseService.selectService("走到哪了？");
        return str;
    }

}
