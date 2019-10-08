package singleton.EagerInitializedSingleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializedSingleton staticBlockInitialization = EagerInitializedSingleton.getInstance().getInstance();
        staticBlockInitialization.getDbConnection();
    }
}
