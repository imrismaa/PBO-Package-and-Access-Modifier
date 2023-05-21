import package1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.staterInstruction();

        Circle circle = new Circle(45);
        System.out.println(circle.getLuas());

        LivingRoom livingRoom = new LivingRoom(4, 5);
        System.out.println(livingRoom.area());

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("Non Static : " + person1.getNonStaticCounter() + ", Static : " + person1.getStaticCounter());
        System.out.println("Non Static : " + person2.getNonStaticCounter() + ", Static : " + person2.getStaticCounter());
        System.out.println("Non Static : " + person3.getNonStaticCounter() + ", Static : " + person3.getStaticCounter());
        System.out.println("Non Static : " + person4.getNonStaticCounter() + ", Static : " + person4.getStaticCounter());
        System.out.println("Non Static : " + person5.getNonStaticCounter() + ", Static : " + person5.getStaticCounter());
    }
}