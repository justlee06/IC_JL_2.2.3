package examples.pltw.org.collegeapp;

import java.util.ArrayList;
import android.util.Log;
/**
 * Created by lee56281 on 1/22/2018.
 */

public class Family {
    private static String TAG; //step 3
    private ArrayList<FamilyMember> family; //step 4
    private static Family sFamily; //step 6
    private Family() //step 7
    {
        family = new ArrayList<FamilyMember>(); //step 10
        family.add(new Guardian("Justin", "Lee"));
        family.add(new Guardian());
    }
    public static Family getFamily() //step 12
    {
        if(sFamily == null)
        {
            sFamily = new Family();
            return sFamily;
        }
        else
            return sFamily;
    }
    public ArrayList<FamilyMember> getFamilyList()
    {
        return family;
    }
    public void setFamilyList(ArrayList<FamilyMember> family)
    {
        this.family = family;
    }
}
