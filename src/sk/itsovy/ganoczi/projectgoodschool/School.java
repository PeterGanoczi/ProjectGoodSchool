package sk.itsovy.ganoczi.projectgoodschool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School implements SchoolStat {

    private List<Student> list;
    private int count = 0;

    public School() {
        list = new ArrayList<>();
    }

    public void addStudent(Student student) {
        list.add(student);
        count++;
    }

    public void printStudent() {
        for (int i = 0; i < getCount(); i++
        ) {
            System.out.println(list.get(i));
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public Student getBestStudent() {
        double bestStudent = 5;
        for (Student student : list) {
            if (student.getAverageGrade() < bestStudent) {
                bestStudent = student.getAverageGrade();
            }
        }
        for (Student student : list) {
            if (student.getAverageGrade() == bestStudent) {
                return student;
            }
        }
        return null;
    }

    @Override
    public int getAverageAbsence() {
        double abs = 0;
        for (Student student : list) {
            abs += student.getAbsence();
        }
        return (int) (abs / getCount());
    }

    @Override
    public double getAverageGrade() {
        double avg = 0;
        for (Student student : list) {
            avg += student.getAverageGrade();
        }
        return avg / getCount();
    }

    @Override
    public double getAverageGradeFromMath() {
        double avgM = 0;
        for (Student student : list) {
            avgM += student.getG_Mat();
        }
        return avgM / getCount();
    }

    @Override
    public Student getTheWorstStudent() {
        double worstStudent = 1;
        for (Student student : list) {
            if (student.getAverageGrade() > worstStudent) {
                worstStudent = student.getAverageGrade();
            }
        }
        for (Student student : list) {
            if (student.getAverageGrade() == worstStudent) {
                return student;
            }
        }
        return null;
    }

    @Override
    public int getTheLowestAbsence() {
        int lowestAbs = 150;
        for (Student student : list) {
            if (student.getAbsence() < lowestAbs) {
                lowestAbs = student.getAbsence();
            }
        }
        return lowestAbs;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        list.sort(Comparator.comparing(Student::getFirstName));
        list.sort(Comparator.comparing(Student::getLastName));
        return list;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        list.sort(Comparator.comparingInt(Student::getAbsence));
        Collections.reverse(list);
        return list;
    }
}
