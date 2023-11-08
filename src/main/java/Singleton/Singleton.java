package Singleton;

public class Singleton {

    private static Singleton instance;
    private final String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance() {return  instance;}

    public static String getName(String name) {
        if (instance == null)
            instance = new Singleton(name);
        return name;
    }

}
