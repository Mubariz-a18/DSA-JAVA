public abstract class  Employee {

    String name;
    int age;

    int Id = (int) (Math.random() * 10);
    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public double getId() {
        return Id;
    }
}
