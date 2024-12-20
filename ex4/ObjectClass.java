package ex4;

public class ObjectClass {

    private static int counter = 0;

    public ObjectClass() {
        counter++;
    }

    public int getObjectsCount() {
        return counter;
    }

}
