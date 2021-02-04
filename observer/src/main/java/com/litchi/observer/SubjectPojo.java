package com.litchi.observer;

import lombok.Data;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 主题内容
 */
@Data
public class SubjectPojo {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 压力
     */
    private float pressure;
}
