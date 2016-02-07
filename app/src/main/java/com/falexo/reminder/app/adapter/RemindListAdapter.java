package com.falexo.reminder.app.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.falexo.reminder.app.R;
import com.falexo.reminder.app.dto.RemindDTO;

import java.util.List;

/**
 * Created by newman on 07.02.2016.
 */
public class RemindListAdapter extends RecyclerView.Adapter<RemindListAdapter.RemidViewHolder> {

    private List<RemindDTO> data;

    public RemindListAdapter(List<RemindDTO> data) {
        this.data = data;
    }

    @Override
    public RemidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item, parent, false);
        return new RemidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RemidViewHolder holder, int position) {
        RemindDTO item = data.get(position);
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class RemidViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView title;

        public RemidViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
