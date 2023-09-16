public class Cat extends Animals {
    // first parent constructor will be called and followed by child
    public Cat(){
        System.out.println("Cat contractor is executed");
    }

    // this is method overriding ,if  same method are in parent class and child class then child will override parent
    public void itSays(){
        System.out.println("meow....");
    }
    
}
