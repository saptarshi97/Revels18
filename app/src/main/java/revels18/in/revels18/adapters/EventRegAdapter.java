package revels18.in.revels18.adapters;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import revels18.in.revels18.R;
import revels18.in.revels18.models.registration.RegEvent;
import revels18.in.revels18.models.results.EventResultModel;
import revels18.in.revels18.utilities.IconCollection;

/**
 * Created by Saptarshi on 12/6/2017.
 */

public class EventRegAdapter extends RecyclerView.Adapter<EventRegAdapter.EventRegViewHolder>{

    private List<RegEvent> regEventsList;
    private Context context;

    public EventRegAdapter(List<RegEvent> regEventsList, Context context) {
        this.regEventsList = regEventsList;
        this.context = context;
    }

    @Override
    public EventRegViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EventRegViewHolder(LayoutInflater.from(context).inflate(R.layout.item_event_reg, parent, false));
    }

    @Override
    public void onBindViewHolder(EventRegViewHolder holder, int position) {
        RegEvent regEvent = regEventsList.get(position);
        holder.eventName.setText(regEvent.getEventName());
        holder.teamID.setText(regEvent.getTeamID());
    }

    @Override
    public int getItemCount() {
        return regEventsList.size();
    }

    class EventRegViewHolder extends RecyclerView.ViewHolder {
        TextView eventName;
        TextView teamID;

        public EventRegViewHolder(View itemView) {
            super(itemView);
            eventName = (TextView)itemView.findViewById(R.id.event_name);
            teamID = (TextView)itemView.findViewById(R.id.team_id);
        }
    }
}