package examples.pltw.org.collegeapp;

/**
 * Created by ckinnard on 4/3/2017.
 */
public class Guardian extends FamilyMember {
    public Guardian(String firstName, String lastName)
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }
    public Guardian() {
        super();
    }
    private String occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
