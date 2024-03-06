package patterns.creational;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private Singleton() {

    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}
