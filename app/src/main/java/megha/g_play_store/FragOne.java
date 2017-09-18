package megha.g_play_store;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Megha Chauhan on 17-Sep-17.
 */

public class FragOne extends Fragment {
    private Toolbar toolbar;
    ArrayList<SectionDataModel> sectionDataModels;

    public FragOne(){

    }
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
    }
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup,Bundle bundle){
      View view= layoutInflater.inflate(R.layout.fragment_one,viewGroup,false);

        toolbar =(Toolbar) view.findViewById(R.id.tool);
        sectionDataModels = new ArrayList<SectionDataModel>();
        toolbar.setTitle("G Play");

        createDummyData();
         RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view);
        RecyclerViewDataAdapter recyclerViewDataAdapter=new RecyclerViewDataAdapter(getActivity(),sectionDataModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(recyclerViewDataAdapter);
        return view;
    }

    public void createDummyData() {
        for (int i = 1; i <= 5; i++) {
            SectionDataModel section= new SectionDataModel();
            section.setHeaderTitle("section"+i);
            ArrayList<SingleItemModel> singleItemModels=new ArrayList<SingleItemModel>();

            for(int j=1;j<=5;j++){
                singleItemModels.add(new SingleItemModel("item"+j,"url"+j));
            }
            section.setAllItemsInSection(singleItemModels);
            sectionDataModels.add(section);

        }
    }
}
