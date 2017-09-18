package megha.g_play_store;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Megha Chauhan on 17-Sep-17.
 */

public class FragTwo extends Fragment{
    public FragTwo(){

    }
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
        return inflater.inflate(R.layout.fragment_two,viewGroup,false);
    }
}
