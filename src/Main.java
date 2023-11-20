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
        JuniorDeveloper jundevelopers=new JuniorDeveloper(1,"Gülbeyaz");
        MidDeveloper middevelopers=new MidDeveloper(2,"Maya");
        SeniorDeveloper sendevelopers=new SeniorDeveloper(3,"Mehmet");
        jundevelopers.work();
        middevelopers.work();
        sendevelopers.work();
        System.out.println(jundevelopers);
        System.out.println(middevelopers);
        System.out.println(sendevelopers);

        System.out.println("***************");

        HRManager hrManager=new HRManager(4,"Doğancan",new JuniorDeveloper[3],new MidDeveloper[1],new SeniorDeveloper[4]);
        hrManager.work();
        hrManager.addEmployee(0,jundevelopers);
        hrManager.addEmployee(0,middevelopers);
    }

    public static void main(String[] args) {
        calculateCylinder();

        System.out.println("******************");

        calculatePool();

        System.out.println("******************");

        createEmployee();


    }
}