package megha.g_play_store;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Megha Chauhan on 15-Sep-17.
 */

public class SectionDataListAdapter extends RecyclerView.Adapter<SectionDataListAdapter.SingleViewHolder> {
    private ArrayList<SingleItemModel> list;
    private Context context;

    public SectionDataListAdapter(Context context, ArrayList<SingleItemModel> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public SingleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, null, false);
        return new SingleViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(final SingleViewHolder holder, int pos) {
        SingleItemModel singleItemModel = list.get(pos);

        holder.textView.setText(singleItemModel.getName());
        holder.ImView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(context, holder.ImView);
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                      switch (menuItem.getItemId()){
                          case R.id.m1:
                              menuItem.getTitle();
                              break;
                          case R.id.m2:
                              menuItem.getTitle(); break;
                          case R.id.m3:
                              menuItem.getTitle();break;
                      }
                      return false;
                    }

                });
                popupMenu.show();
            }

        });
    }

    public class SingleViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;
        protected ImageView image;
        protected ImageView ImView;

        public SingleViewHolder(View view) {
            super(view);
            this.image = view.findViewById(R.id.Image);
            this.textView = view.findViewById(R.id.title);
            this.ImView=view.findViewById(R.id.Imbt);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), textView.getText(), Toast.LENGTH_SHORT).show();
                }
            });

        }

    }
}
