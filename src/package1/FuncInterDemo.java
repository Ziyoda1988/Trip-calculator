package package1;
@FunctionalInterface                  //if we put annotation interface does not let vreate second method
public interface FuncInterDemo {     // meaning if interface have only one abstract method
    void sayHello (String name); //abstract method (we can have only one)
    public default void greeting(){ // default method
        System.out.println("Hi");
    }

}
