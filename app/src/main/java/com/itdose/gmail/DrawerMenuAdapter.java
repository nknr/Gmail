package com.itdose.gmail;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DrawerMenuAdapter extends RecyclerView.Adapter<DrawerMenuAdapter.ItemDrawerMenuViewHolder> {
    private String prevItemTitle = "";
    private List<DrawerMenu> tecList;

    public DrawerMenuAdapter(List<DrawerMenu> list) {
        tecList = new ArrayList<>();
        tecList.addAll(list);
        Log.d("List ","size" +tecList.size());
    }

    public void setDrawerItemList(List<DrawerMenu> list) {
        tecList.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ItemDrawerMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item,parent,false);
        return new ItemDrawerMenuViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemDrawerMenuViewHolder holder, int position) {
        DrawerMenu drawerMenu = tecList.get(position);
        holder.name.setText(drawerMenu.getName());
        int count = drawerMenu.getCount();
        holder.count.setText(count !=0? String.valueOf(count):"");
        holder.icon.setBackgroundResource(drawerMenu.getIcon());

        if (drawerMenu.getHeading().isEmpty()){
            holder.title.setVisibility(View.GONE);
        }else if (!drawerMenu.getHeading().equals(prevItemTitle)){
            holder.title.setText(drawerMenu.getHeading());
            prevItemTitle = drawerMenu.getHeading();
            holder.title.setVisibility(View.VISIBLE);
        }else{
            holder.title.setVisibility(View.GONE);
        }

        //if (tecList.get(position).isSelected())
        //holder.itemLayout.setBackgroundResource(tecList.get(position).getBackGroundDrawable());
    }


    @Override
    public int getItemCount() {
        return tecList.size();
    }

    public class ItemDrawerMenuViewHolder extends RecyclerView.ViewHolder {
        private TextView title,name,count;
        private ImageView icon;
        private RelativeLayout itemLayout;

        ItemDrawerMenuViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            name = view.findViewById(R.id.name);
            count = view.findViewById(R.id.count);
            icon = view.findViewById(R.id.icon);
            itemLayout = view.findViewById(R.id.item_layout);

        }

    }
}

