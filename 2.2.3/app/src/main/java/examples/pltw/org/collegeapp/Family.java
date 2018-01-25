package examples.pltw.org.collegeapp;

import java.util.ArrayList;
import android.util.Log;
/**
 * Created by lee56281 on 1/22/2018.
 */

public class Family {
    private static String TAG;
    private ArrayList<FamilyMember> family;
    private static Family sFamily;
    private Family()
    {
        family = new ArrayList<FamilyMember>();
        family.add(new Guardian("Justin", "Lee"));
        family.add(new Guardian());
    }
    public static Family getFamily()
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