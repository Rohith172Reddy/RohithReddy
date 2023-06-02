public class Main {
    public static void main(String[] args) {

        subDepartment department= new subDepartment();
        System.out.println(department.getDepartmentSize());

        Product product=new Product();
        System.out.println("Original price is "+product.getPrice());
        System.out.println("price with quantity is "+product.getPrice(4));

        Runtime runtime=new Runtime();
        System.out.println("Overriding method " +runtime.Demo());

    }
}