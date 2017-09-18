package megha.g_play_store;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Megha Chauhan on 15-Sep-17.
 */

public class RecyclerViewDataAdapter extends RecyclerView.Adapter<RecyclerViewDataAdapter.MyViewHolder> {
    ArrayList<SectionDataModel> dataList;
    private Context context;
    RecyclerViewDataAdapter(Context context,ArrayList<SectionDataModel> dataList){
        this.context=context;
        this.dataList=dataList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;
        protected Button button;
        protected RecyclerView recyclerView;

        public MyViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.itemTitle);
            button = (Button) view.findViewById(R.id.btn);
            recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(MyViewHolder holder, int pos) {
        final String Sectionname = dataList.get(pos).getHeaderTitle();
        ArrayList singleSectionItems = dataList.get(pos).getAllItemsInSection();
        holder.textView.setText(Sectionname);

        SectionDataListAdapter itemListDataAdapter = new SectionDataListAdapter(context,singleSectionItems);

        holder.recyclerView.setAdapter(itemListDataAdapter);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "clicked event" + Sectionname, Toast.LENGTH_SHORT).show();
            }
        });
    }
}



