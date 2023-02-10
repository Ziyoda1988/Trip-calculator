package package1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Student student = new Student();
      String name = "Ali";
      FuncInterDemo funcInterDemo = (t) -> System.out.println(t);
      FuncInterDemo funcInterDemo1 = (t) -> System.out.println(t);
      funcInterDemo.sayHello(name);
    }

}
