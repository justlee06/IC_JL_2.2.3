package examples.pltw.org.collegeapp;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by wdumas on 4/11/16.
 */
public class Profile extends ApplicantData {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public Profile() {
        firstName = "Alan";
        lastName = "Turing";
        dateOfBirth = new Date(84, 6, 22, 0, 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public static class Family {
        private ArrayList<FamilyMember> family;
        private static Family sFamily;
        private Family()
        {
            ArrayList<FamilyMember> fam = family;
            family.add(new Guardian("Justin", "Lee"));

        }
    }
}