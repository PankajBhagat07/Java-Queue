package Classes;

public class Student1 implements Comparable<Student1> {
    private int rollno;
    private String name;
    private int age;

    public  Student1(int rollno,String name,int age) {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    //set
    public void setRollno(int rollno) {
        this.rollno=rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //get
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Override
    public int compareTo(Student1 obj){
        return Integer.compare(this.age, obj.age);
    }

    //override
    @Override
    public String toString() {
        return "The Roll no is "+rollno+". Name is "+name+", And Age is "+age;
    }


}
