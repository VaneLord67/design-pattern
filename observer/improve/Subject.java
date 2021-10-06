package observer.improve;



/**
 * @author CJR
 * @create 2021-10-06-22:05
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
