package in.myEmployee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp =new Employee("Golu",30,45000);


        System.out.println(emp.getEmployeeDetails());

//        System.out.println(emp);

        emp.setName("Chandramauli");

        System.out.println(emp.getEmployeeDetails());
    }
}
