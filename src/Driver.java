public class Driver extends  Employee{

    public Driver(String name) {
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

    public void driving(){
        System.out.println(getName()+" driving !");
    }

    @Override
    public void firstAid() {
        super.firstAid();
    }

    @Override
    public void swim() {
        super.swim();
    }
}
