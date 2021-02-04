package com.litchi.observer;

import java.util.ArrayList;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 具体主题
 */
public class ConcreteSubject implements Subject {

    private ArrayList<Observer> observers;

    SubjectPojo subjectPojo;

    public ConcreteSubject(SubjectPojo subjectPojo) {
        this.observers = new ArrayList<>();
        this.subjectPojo = subjectPojo;
    }

    /**
     * 订阅
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getName() + "加入主题");
    }

    /**
     * 取消订阅
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
            System.out.println(observer.getName() + "离开主题");
        }
    }

    /**
     * 提醒
     */
    @Override
    public void notifyObservers() {
        observers.forEach(r -> {
            r.update(this.subjectPojo);
        });
    }

    /**
     * 数据变化
     *
     * @param subjectPojo
     */
    public void setSubjectPojo(SubjectPojo subjectPojo) {
        this.subjectPojo = subjectPojo;
        notifyObservers();
    }
}
