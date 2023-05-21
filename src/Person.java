public class Person {
    private static int staticCounter = 0;
    private int nonStaticCounter;

    public Person() {
        staticCounter++;
        nonStaticCounter = staticCounter;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }

    public static void setStaticCounter(int staticCounter) {
        Person.staticCounter = staticCounter;
    }

    public int getNonStaticCounter() {
        return nonStaticCounter;
    }

    public void setNonStaticCounter(int nonStaticCounter) {
        this.nonStaticCounter = nonStaticCounter;
    }
}
