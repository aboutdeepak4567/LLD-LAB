package DesignPattern.behavioral.Observer.Observable;

import DesignPattern.behavioral.Observer.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void  setStockCounts(int newStockAdded);

    public int getStockCounts();
}
