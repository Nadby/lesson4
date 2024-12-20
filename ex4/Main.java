package ex4;

public class Main {

    public static void main(String[] args) {

        ObjectClass[] objectClasses = new ObjectClass[10];
        for (int i = 0; i < objectClasses.length; i++) {
            objectClasses[i] = new ObjectClass();
        }
        //доступ до счетчика из любого элемента массива
        System.out.printf("Количество созданных объектов ObjectClass: %s", objectClasses[6].getObjectsCount());
    }

}
