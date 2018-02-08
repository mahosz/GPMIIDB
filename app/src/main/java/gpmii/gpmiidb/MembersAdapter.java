package gpmii.gpmiidb;

import android.content.Context;
import android.content.PeriodicSync;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mchho on 06/02/2018.
 */

public class MembersAdapter extends RecyclerView.Adapter<MembersAdapter.MyViewHolder> {
private List<Members> resultList;
private Context context;


public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView id,name,bod,address,division,region;

    public MyViewHolder(View view) {
        super(view);
        id = (TextView) view.findViewById(R.id.id);
        name = (TextView) view.findViewById(R.id.name);
        bod = (TextView) view.findViewById(R.id.bod);
        address = (TextView) view.findViewById(R.id.address);
        division = (TextView) view.findViewById(R.id.division);
        region = (TextView) view.findViewById(R.id.region);
    }
}


    public MembersAdapter(Context context, List<Members> resultList) {
        this.resultList = resultList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.prsn_details, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Members person = resultList.get(position);
        holder.name.setText(person.getName());
        holder.address.setText(person.getAddress());
        holder.bod.setText(person.getBod());
        holder.division.setText(person.getDivision());
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }
}
