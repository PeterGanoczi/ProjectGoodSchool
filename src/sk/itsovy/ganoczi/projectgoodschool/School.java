package sk.itsovy.ganoczi.projectgoodschool;

import java.util.ArrayList;
import java.util.List;

public class School implements SchoolStat {

    private List<Student> list;
    private int count=0;

    public School() {
        list =new ArrayList<>();
    }

    public void addStudent(Student student){
        list.add(student);
        count++;
    }

    public void printStudent(){
        for (int i=0; i<list.size();i++
             ) {
            System.out.println(list.get(i));
        }
     }



    public int getCount() {
        return count;
    }

    @Override
    public Student getBestStudent() {
        double bestStudent=5;
        for (Student student:list){
            if (student.getAverageGrade()< bestStudent){
                bestStudent=student.getAverageGrade();
            }
        } for (Student student:list){
            if (student.getAverageGrade()==bestStudent){
                return student;
            }
        }
        return null;
    }

    @Override
    public int getAverageAbsence() {
        double abs=0;
        for (Student student:list){
            abs+=student.getAbsence();
        }
        return (int) ((double)abs/list.size());
    }

    @Override
    public double getAverageGrade() {
        double avg = 0;
        for(Student student: list) {
            avg += student.getAverageGrade();
        }
        return avg/getCount();
    }

    @Override
    public double getAverageGradeFromMath() {
        return 0;
    }

    @Override
    public Student getTheWorstStudent() {
        double worstStudent=1;
        for (Student student:list){
            if (student.getAverageGrade()> worstStudent){
                worstStudent=student.getAverageGrade();
            }
        } for (Student student:list){
            if (student.getAverageGrade()==worstStudent){
                return student;
            }
        }
        return null;
    }

    @Override
    public int getTheLowestAbsence() {
        return 0;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        return null;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        return null;
    }
}
