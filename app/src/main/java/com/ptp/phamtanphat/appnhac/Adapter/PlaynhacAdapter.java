package com.ptp.phamtanphat.appnhac.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ptp.phamtanphat.appnhac.Model.Baihat;
import com.ptp.phamtanphat.appnhac.R;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 24/4/2018.
 */

public class PlaynhacAdapter extends RecyclerView.Adapter<PlaynhacAdapter.ViewHolder> {

    Context context;
    ArrayList<Baihat> mangbaihat;

    public PlaynhacAdapter(Context context, ArrayList<Baihat> mangbaihat) {
        this.context = context;
        this.mangbaihat = mangbaihat;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_play_bai_hat,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Baihat baihat = mangbaihat.get(position);
        holder.txtcasi.setText(baihat.getCasi());
        holder.txtindex.setText(position + 1 + "");
        holder.txttenbaihat.setText(baihat.getTenbaihat());
    }

    @Override
    public int getItemCount() {
        return mangbaihat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtindex,txttenbaihat,txtcasi;
        public ViewHolder(View itemView) {
            super(itemView);
            txtcasi = itemView.findViewById(R.id.textviewplaynhactencasi);
            txtindex = itemView.findViewById(R.id.textviewplaynhacindex);
            txttenbaihat = itemView.findViewById(R.id.textviewplaynhactenbaihat);
        }
    }
}
