package com.unni.Dao;

import com.unni.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by unnkrish on 27-02-2017.
 */
@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static{
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Paru", "Chemistry"));
                put(2, new Student(2, "Achu", "English"));
                put(3, new Student(3, "Ammu", "Malayalam"));
            }
        };
    }


    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void removeStudentById(int id) {
        this.students.remove(id);
    }
}

