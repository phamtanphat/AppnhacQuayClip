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
import com.ptp.phamtanphat.appnhac.Model.Album;
import com.ptp.phamtanphat.appnhac.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 23/4/2018.
 */

public class AllAlbumAdapter extends RecyclerView.Adapter<AllAlbumAdapter.ViewHolder>{

    Context context;
    ArrayList<Album> albumArrayList;

    public AllAlbumAdapter(Context context, ArrayList<Album> albumArrayList) {
        this.context = context;
        this.albumArrayList = albumArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_all_album,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Album album = albumArrayList.get(position);
        Picasso.with(context).load(album.getHinhanhAlbum()).into(holder.imgallalbum);
        holder.txttenallalbum.setText(album.getTenAlbum());
    }

    @Override
    public int getItemCount() {
        return albumArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgallalbum;
        TextView txttenallalbum;
        public ViewHolder(View itemView) {
            super(itemView);
            imgallalbum = itemView.findViewById(R.id.imageviewallalbum);
            txttenallalbum = itemView.findViewById(R.id.textviewtenallalbum);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DanhsachbaihatActivity.class);
                    intent.putExtra("album",albumArrayList.get(getPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }
}
