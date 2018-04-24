package com.ptp.phamtanphat.appnhac.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ptp.phamtanphat.appnhac.Activity.DanhsachbaihatActivity;
import com.ptp.phamtanphat.appnhac.Model.Playlist;
import com.ptp.phamtanphat.appnhac.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 23/4/2018.
 */

public class DanhsachcacplaylistAdapter extends RecyclerView.Adapter<DanhsachcacplaylistAdapter.ViewHolder> {

    Context context;
    ArrayList<Playlist> mangplaylist;

    public DanhsachcacplaylistAdapter(Context context, ArrayList<Playlist> mangplaylist) {
        this.context = context;
        this.mangplaylist = mangplaylist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_danh_sach_cac_playlist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Playlist playlist = mangplaylist.get(position);
        Picasso.with(context).load(playlist.getHinhPlaylist()).into(holder.imghinhnen);
        holder.txttenplaylist.setText(playlist.getTen());
    }

    @Override
    public int getItemCount() {
        return mangplaylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imghinhnen;
        TextView txttenplaylist;
        public ViewHolder(View itemView) {
            super(itemView);
            imghinhnen = itemView.findViewById(R.id.imageviewdanhsachcacplaylist);
            txttenplaylist = itemView.findViewById(R.id.textviewtendanhsachcacplaylist);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DanhsachbaihatActivity.class);
                    intent.putExtra("itemplaylist",mangplaylist.get(getPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }
}
