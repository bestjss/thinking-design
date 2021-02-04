package com.litchi.observer;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 观察者
 */
public interface Observer {

    String getName();

    void update(SubjectPojo subjectPojo);
}


