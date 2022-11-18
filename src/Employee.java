public abstract class Employee implements Helpable,Swimable {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void firstAid() {
        System.out.println(getName()+" provides first aid ");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" swiming ");
    }

    public void  say(){
        System.out.println(getName()+" saying ");
    }

    @Override
    public String toString() {
        return "name='" + name;
    }
}
