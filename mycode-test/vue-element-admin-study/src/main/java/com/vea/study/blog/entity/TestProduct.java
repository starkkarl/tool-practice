package com.vea.study.blog.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 枯灯少年
 * @since 2021-08-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TestProduct对象", description="")
public class TestProduct implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "pid", type = IdType.ID_WORKER)
    private Integer pid;

    private String pname;

    private String ptype;

    private BigDecimal price;

    private String testAttr;


}
