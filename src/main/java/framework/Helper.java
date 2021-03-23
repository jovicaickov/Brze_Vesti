package framework;

public class Helper {

    public static int getRandomInteger(int range) {
        return (int) (Math.random() * range);
    }
    
    public static int getRandomInteger() {
        return (int) (Math.random() * 10000);
    }
    
    public static String getRandomText() {
        return "Jovica-" + getRandomInteger();
    }
    
    public static String getRandomUrl() {
        return "https://www.test-" + getRandomInteger() + ".com/";
    }
}
