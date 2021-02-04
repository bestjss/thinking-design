package com.litchi.observer;

/**
 * @Auther Litchi_duan
 * @Date 2021/2/5
 * @Description 主题
 */
public interface Subject {

    /**
     * 订阅
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 取消订阅
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 提醒
     */
    void notifyObservers();
}
