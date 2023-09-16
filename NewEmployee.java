class NewEmployee extends Employee{
    private int salary;
    public  NewEmployee(String name,int Id,int salary){
        super(name,Id);
        this.salary = salary;

    }

    public  int getSalary(){
    return this.salary;
    }
}
