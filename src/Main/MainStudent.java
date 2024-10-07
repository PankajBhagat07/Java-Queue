package Main;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import Classes.Student1;
import Comparator.StudentComparator; // The StudentCoparator class dose not used in it , insted of that Lamda is used

public class MainStudent {
    public static void main(String[] args) {
        // Using Lamda
        Comparator <Student1> stdcom=(obj1, obj2)->obj1.getAge()-obj2.getAge();
        Comparator <Student1> stdcom1=(obj1, obj2)->obj1.getName().compareTo(obj2.getName());
        Comparator <Student1> stdcom2=(obj1, obj2)->{return Integer.compare(obj1.getRollno(),obj2.getRollno());};
        
        //--------------------------------------------------
        
        Queue <Student1> record1=new PriorityQueue<>(stdcom);
        
        record1.offer(new Student1(1, "Pankaj", 24));
        record1.offer(new Student1(2,"Omkar",23));
        record1.offer(new Student1(3,"Tushar",22));
        record1.offer(new Student1(4,"Vishal",21));
        record1.offer(new Student1(5,"Akash",25));

        Student1 student1=record1.poll();
        System.out.println(student1);
        System.out.println(record1.poll());
        System.out.println(record1.poll());
        System.out.println(record1.poll());
        System.out.println(record1.poll());
        System.out.println();
        
        //----------------------------------------------------
        Queue <Student1> record2=new PriorityQueue<>(stdcom1);
        
        record2.offer(new Student1(1, "Pankaj", 24));
        record2.offer(new Student1(2,"Omkar",23));
        record2.offer(new Student1(3,"Tushar",22));
        record2.offer(new Student1(4,"Vishal",21));
        record2.offer(new Student1(5,"Akash",25));
        
        Student1 student2=record2.poll();
        System.out.println(student2);
        System.out.println(record2.poll());
        System.out.println(record2.poll());
        System.out.println(record2.poll());
        System.out.println(record2.poll());
        System.out.println();
        //-----------------------------------------------------

        Queue <Student1> record3=new PriorityQueue<>(stdcom2);
        
        record3.offer(new Student1(1, "Pankaj", 24));
        record3.offer(new Student1(2,"Omkar",23));
        record3.offer(new Student1(3,"Tushar",22));
        record3.offer(new Student1(4,"Vishal",21));
        record3.offer(new Student1(5,"Akash",25));

        Student1 student3=record3.poll();
        System.out.println(student3);
        System.out.println(record3.poll());
        System.out.println(record3.poll());
        System.out.println(record3.poll());
        System.out.println(record3.poll());
        System.out.println();

        //----------------------------------------------------------

        //from Student class
        Queue <Student1> rec=new PriorityQueue<>();
        
        rec.offer(new Student1(1, "Pankaj", 24));
        rec.offer(new Student1(2,"Omkar",23));
        rec.offer(new Student1(3,"Tushar",22));
        rec.offer(new Student1(4,"Vishal",21));
        rec.offer(new Student1(5,"Akash",25));


        Student1 std1=record1.poll();
        System.out.println(std1);
        System.out.println(record1.poll());
        System.out.println(record1.poll());
        System.out.println(record1.poll());
        System.out.println(record1.poll());
        System.out.println();


    }
}
