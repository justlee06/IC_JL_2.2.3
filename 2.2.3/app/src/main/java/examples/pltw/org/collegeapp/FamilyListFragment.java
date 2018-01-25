package examples.pltw.org.collegeapp;

import examples.pltw.org.collegeapp.Family;
import android.os.Bundle;
import android.support.v4.app.ListFragment; //step 18
import examples.pltw.org.collegeapp.Family;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lee56281 on 1/23/2018.
 */

public class FamilyListFragment extends ListFragment {
    private static String TAG; //step 19
    private Family mFamily; //step 20
    public FamilyListFragment() //step 21
    {
        mFamily = Family.getFamily();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) { //step 23
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.family_members_title);

        FamilyMemberAdapter adapter = new FamilyMemberAdapter(mFamily.getFamily());
        setListAdapter(adapter);
    }
    private class FamilyMemberAdapter extends ArrayAdapter<FamilyMember> { //step 24
        public FamilyMemberAdapter(ArrayList<FamilyMember> family) {
            super(getActivity(), 0, family);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_family_member, null);
            }

            FamilyMember f = getItem(position);

            TextView nameTextView =
                    (TextView)convertView
                            .findViewById(R.id.family_member_list_item_nameTextView);
            nameTextView.setText(f.getFirstName() + " " + f.getLastName());

            return convertView;
        }
    }
}
