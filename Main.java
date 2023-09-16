public class Main {
    public static void main(String[] args) {

        // new is used to create a object of class Student
        Students std = new Students();
        std.name = "mubariz";
        std.rollno = 21;
        System.out.println(std.name);
        System.out.println(std.rollno);
        std.print(); 

        std.setSubject("Maths");
        std.getSubject();

        std.setMarks(99);
        std.getMarks();
    }


}