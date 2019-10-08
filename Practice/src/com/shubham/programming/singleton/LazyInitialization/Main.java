package singleton.LazyInitialization;

public class Main {
    public static void main(String[] args) {
        LazyInitialization lazyInitialization = LazyInitialization.getInstance();
        lazyInitialization.getDbConnection();
    }
}
