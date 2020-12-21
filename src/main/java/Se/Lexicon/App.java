package Se.Lexicon;

import Se.Lexicon.List.CourseDaoList;
import Se.Lexicon.List.StudentDaoList;

import java.time.LocalDate;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        Course course1 = new Course(1,"OOP1", LocalDate.of(2019,9,15), 10);
        Course course2 = new Course(2,"OOP2", LocalDate.of(2020,1,26), 9);
        Course course3 = new Course(3,"Intro to Programming", LocalDate.of(2020,3,11), 11);
        Course course4 = new Course(4,"Project Management", LocalDate.of(2020,9,1), 8);
        Course course5 = new Course(5,"Statistic", LocalDate.of(20202,10,26), 10);

        CourseDaoList courseDaoList = new CourseDaoList();
        courseDaoList.saveCourse(course1);
        courseDaoList.saveCourse(course2);
        courseDaoList.saveCourse(course3);
        courseDaoList.saveCourse(course4);
        courseDaoList.saveCourse(course5);
        System.out.println(courseDaoList.findById(3));

        Student student1 = new Student(11,"Michael", "olusanya@yahoo.com", "GL 10A");
        Student student2 = new Student(12,"Samuel", "samuel@yahoo.com", "Vatertonet 2K");
        Student student3 = new Student(13,"Martin", "martin@yahoo.com", "Dalbovagen 9C");

        StudentDaoList studentDaoList = new StudentDaoList();
        studentDaoList.saveStudent(student1);
        studentDaoList.saveStudent(student2);
        studentDaoList.saveStudent(student3);
        System.out.println("Find Student by name = " + studentDaoList.findByName("Michael"));

        course1.register(student1);
        course1.register(student2);

        course2.register(student1);
        course2.register(student2);

        course4.register(student1);
        course4.register(student2);


        System.out.println("Student registered for course 1 " + course1.getStudents());

        System.out.println("Find course with ID 4 = " + courseDaoList.findById(4));




    }


}
