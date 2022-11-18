public class Main {
    public static void main(String[] args) {

        Employee teacher= new Teacher("Rahim");
        Teacher teacher1 = new Teacher("Mukhammed");
        Employee driver = new Driver("Nurik");
        Driver driver2 = new Driver("Ilim");
        Employee teacher2= new Teacher("Alibek");
        Teacher teacher3 = new Teacher("Baytik");
        Employee driver3 = new Driver("Nurislam");
        Driver driver4 = new Driver("Dasmia");
        Employee[] employees={teacher,teacher1,teacher2,teacher3,driver,driver2,driver3,driver4};
        for (Employee employee : employees) {
            System.out.println();
            System.out.println(employee);
            employee.firstAid();
            employee.swim();
            employee.say();
            if (employee instanceof Teacher) ((Teacher) employee).teaching();
            if (employee instanceof  Driver) ((Driver) employee).driving();
        }
    }
}
