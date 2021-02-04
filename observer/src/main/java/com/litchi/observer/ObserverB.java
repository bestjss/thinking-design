package com.litchi.observer;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 观察者B
 */
public class ObserverB implements Observer, DisplayElement {

    SubjectPojo subjectPojo;

    @Override
    public void display() {
        System.out.println(getName() + subjectPojo.toString());
    }

    @Override
    public String getName() {
        return "观察者B" ;
    }

    @Override
    public void update(SubjectPojo subjectPojo) {
        this.subjectPojo = subjectPojo;
        this.display();
    }
}
