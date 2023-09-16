public class Students {

    // by default variables are public in class of java
    String name;
    int rollno ;

    private String subject;
    private int marks;


    // setter and getter
    public void getMarks() {
        System.out.println(marks);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // to access the pivate properties of class outside of this class u must create a contructor
    public Students(){
        System.out.println("constructor is called");
    }

    // setter
    public void setSubject(String subject){
        this.subject = subject;
    }

    public void getSubject(){
        System.out.println(this.subject);
    }

    //method
    public void print(){
        System.out.println("studyingg....");
    }
}
