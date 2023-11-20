import com.workintech.inheritance.model.*;

public class Main {

    public static void calculateCylinder() {
        Circle circle = new Circle(3.75);
        System.out.println(circle.getArea());

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

    public static void calculatePool() {
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    public static void createEmployee() {
        Employee employee = new Employee(1, "Gülbeyaz", 50000);
        System.out.println("employee: " + employee);
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(2, "Maya", 55000, "junior");
        juniorDeveloper.work();
        System.out.println(juniorDeveloper.getSalary());

        String[] jundevelopers=new String[4];
        String[] middevelopers=new String[4];
        String[] sendevelopers=new String[4];
        HRManager hrManager=new HRManager(3,"Mehmet",60000,jundevelopers,middevelopers,sendevelopers);
        System.out.println("**************");
        hrManager.addEmployee(3,"Gülbeyaz","mid");
        System.out.println(hrManager);
    }

    public static void main(String[] args) {
        calculateCylinder();

        System.out.println("******************");

        calculatePool();

        System.out.println("******************");

        createEmployee();


    }
}