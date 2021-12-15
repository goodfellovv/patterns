public class Main {
    public static void main(String[] args) {
        Prototype prototype = new Person("Yura", 43);
        System.out.println("=================Prototype created=====================");
        System.out.println(prototype);
        System.out.println("=======================================================");

        Person clone = (Person) prototype.getClone();
        System.out.println("=================Clone created=====================");
        System.out.println(clone);
        System.out.println("=======================================================");

        clone.setName("Yura_2");
        clone.setAge(22);
        System.out.println("=================Clone changed=====================");
        System.out.println(prototype);
        System.out.println(clone);
        System.out.println("=======================================================");
    }
}
