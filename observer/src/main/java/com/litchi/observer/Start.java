package com.litchi.observer;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description Start
 */
public class Start {

    public static void main(String[] args) {
        // 指定一个订阅数据
        SubjectPojo subjectPojo = new SubjectPojo();
        // 初始化主题
        ConcreteSubject subject = new ConcreteSubject(subjectPojo);
        // 初始化观察者A
        Observer observerA = new ObserverA();
        // 观察者A订阅主题
        subject.registerObserver(observerA);
        // 初始化观察者B
        Observer observerB = new ObserverB();
        // 观察者B订阅主题
        subject.registerObserver(observerB);
        // 更新变化数据
        subjectPojo.setHumidity(10.2f);
        subjectPojo.setPressure(20.2f);
        subjectPojo.setTemperature(36.7f);
        subject.setSubjectPojo(subjectPojo);
        // 注意观察变化
        // 观察者B取消注册
        subject.removeObserver(observerB);
        // 观察者C加入主题
        Observer observerC = new ObserverC();
        subject.registerObserver(observerC);
        // 更新数据
        subjectPojo.setHumidity(11.3f);
        subjectPojo.setPressure(21.3f);
        subjectPojo.setTemperature(37.3f);
        subject.setSubjectPojo(subjectPojo);
        // 注意观察变化
    }
}
