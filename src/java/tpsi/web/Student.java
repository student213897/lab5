package tpsi.web;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String groupID;
    private List<Double> grades = new ArrayList<>();

    private String firstName;
    private String lastName;
    private String email;

    
    public Student(String firstName, String lastName, String emailAddress, String groupID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emailAddress;
        this.groupID = groupID;
    }

    public String getGroupID() {
        return this.groupID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }
    
            public void setLastName(String _lastName) {
        this.lastName = _lastName ;
    }
            
                    public void setEmail(String _email) {
        this.email = _email;
    }

    public void setGroupID(String _groupID) {
        this.groupID = _groupID;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public List<Double> getGrades() {
        return this.grades;
    }

    double getGradesAverage() {
        double average = 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        average = sum / grades.size();

        return average;
    }

}
