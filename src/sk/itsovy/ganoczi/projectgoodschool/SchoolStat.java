package sk.itsovy.ganoczi.projectgoodschool;
import java.util.List;

public interface SchoolStat {

    Student getBestStudent();
    int getAverageAbsence();
    double getAverageGrade();
    double getAverageGradeFromMath();
    Student getTheWorstStudent();
    int getTheLowestAbsence();
    List getListSortedByLastNameAsc();
    List getListSortedByAbsenceDesc();

}
