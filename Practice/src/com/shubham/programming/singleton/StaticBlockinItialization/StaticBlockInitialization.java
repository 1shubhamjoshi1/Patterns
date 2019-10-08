package singleton.StaticBlockinItialization;

public class StaticBlockInitialization {
    private final static StaticBlockInitialization instance;

    private StaticBlockInitialization() {
    }

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Issues will creating the instance .");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }

    public void getDbConnection() {
        System.out.println("Getting the db connection from " + this.getClass().getSimpleName());
    }
}
