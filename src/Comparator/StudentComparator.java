package Comparator;
import java.util.Comparator;

import Classes.*;

public class StudentComparator implements Comparator<Student1> {
    
    @Override
    public int compare (Student1 obj1,Student1 obj2) {
        //Integer .compare to
        return obj1.getName().compareTo(obj2.getName());
    }
}
