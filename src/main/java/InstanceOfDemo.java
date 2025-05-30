public class InstanceOfDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instance of Parent:" + (obj1 instanceof Parent));
        System.out.println("obj1 instance of Child:" + (obj1 instanceof Child));
        System.out.println("obj2 instance of myInterface:" + (obj2 instanceof MyInterface));
        System.out.println("obj2 instance of Parent:" + (obj2 instanceof Parent));
    }
}
class Parent{}
class  Child extends Parent implements MyInterface{}
interface MyInterface{}

