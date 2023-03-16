package qcc.school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher abuali = new Teacher(1,"abuali",500);
        Teacher hannon = new Teacher(2,"hannon",700);
        Teacher razzak = new Teacher(3,"razzak",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(abuali);
        teacherList.add(hannon);
        teacherList.add(razzak);


        Student napa = new Student(1,"napa",4);
        Student muhfat = new Student(2,"muhfat alam",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(napa);
        studentList.add(rabbi);
        studentList.add(muhfat);




        School qcc = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        qcc.addTeacher(megan);


        napa.payFees(5000);
        muhfat.payFees(6000);
        System.out.println("qcc has earned $"+ qcc.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        abuali.receiveSalary(abuali.getSalary());
        System.out.println("qcc has spent for salary to " + abuali.getName()
        +" and now has $" + qcc.getTotalMoneyEarned());

        razzak.receiveSalary(razzak.getSalary());
        System.out.println("qcc has spent for salary to " + razzak.getName()
                +" and now has $" + qcc.getTotalMoneyEarned());


        System.out.println(muhfat);

        hannon.receiveSalary(hannon.getSalary());

        System.out.println(hannon);


    }
}