package com.vea.study.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResultUtil implements Serializable {

    private Integer code;
    private String status;
    private Map<String, Object> data = new HashMap<String, Object>();

    public static ResultUtil ok() {
        ResultUtil r = new ResultUtil();
        r.setStatus("success");
        r.setCode(200);
        return r;
    }

    public ResultUtil data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public ResultUtil data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
