package singleton.EagerInitializedSingleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void getDbConnection() {
        System.out.println("Getting the db connection from " + this.getClass().getSimpleName());
    }
}
