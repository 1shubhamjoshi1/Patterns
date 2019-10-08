package singleton.ThreadSafeSingleton;

public class ThreadSaveSingleton {
    private static ThreadSaveSingleton instance;

    private static synchronized ThreadSaveSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSaveSingleton();
        }
        return instance;
    }
    
    public void getDbConnection() {
        System.out.println("Getting the db connection from " + this.getClass().getSimpleName());
    }
}
