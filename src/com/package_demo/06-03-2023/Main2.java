import com.package_demo.Child;
import com.package_demo.FinalClass;
import com.package_demo.Java;
import com.package_demo.Static;

public class Main2 {
    public static <FinalClass> void main(String[] args) {

        Java Cis = new Java();
        Cis.method1();
        Cis.method2();


        Child child1 = new Child(10, 20);
        System.out.println("Parent Variable: " + child1.getParentVariable());
        System.out.println("Child Variable: " + child1.getChildVariable());

        Child child2 = new Child(30);
        System.out.println("Parent Variable: " + child2.getParentVariable());
        System.out.println("Child Variable: " + child2.getChildVariable());


        int value = Static.getStaticVariable();
        System.out.println("Static Variable: " + value);

    }
}