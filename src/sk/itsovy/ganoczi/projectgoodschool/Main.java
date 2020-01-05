package sk.itsovy.ganoczi.projectgoodschool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        School school=new School();
        Student student;
        String data;


        try {
            BufferedReader br=new BufferedReader(new FileReader("students.dat"));

            while ((data=br.readLine())!=null){
                String[] splitdata=data.split("\\s+");

                student=new Student(
                        splitdata[0],
                        splitdata[1],
                        (byte)Character.getNumericValue(splitdata[2].charAt(0)),
                        (byte)Character.getNumericValue(splitdata[3].charAt(0)),
                        (byte)Character.getNumericValue(splitdata[4].charAt(0)),
                        Integer.parseInt(splitdata[5]));

                school.addStudent(student);
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        school.printStudent();
        System.out.println("-----------------------------------------");
        System.out.println("Count of students: "+school.getCount());
        System.out.println("Best student: " +school.getBestStudent());
        System.out.println("Worst student: " +school.getTheWorstStudent());
        System.out.println("Average absence: " +school.getAverageAbsence());
        System.out.println("Average grade: "+school.getAverageGrade());
        System.out.println("Average math grade: "+school.getAverageGradeFromMath());
        System.out.println("Lowest absence: "+ school.getTheLowestAbsence());
        System.out.println("Sorted by last name:" +school.getListSortedByLastNameAsc());
        System.out.println("Sorted by absence: " +school.getListSortedByAbsenceDesc());



    }
}
