package com.vea.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vea.study.entity.UserEntity;
import org.springframework.stereotype.Repository;

// 在对应的mapper上面继承基本的类 BaseMapper
@Repository
public interface UserMapper extends BaseMapper<UserEntity> { //看BaseMapper源码，这个泛型操作什么东西就传什么对象进去
    //配置完这个就完成了基本的CRUD
    //不需要以前的配置一堆文件
}
