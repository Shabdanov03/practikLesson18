public class Teacher extends  Employee{

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void say() {
        super.say();
    }

    public void teaching(){
        System.out.println(getName()+ " teaching ");
    }

    @Override
    public void firstAid() {
        super.firstAid();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public String toString() {
        return "Teacher{}";
    }
}
