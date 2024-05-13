package in.forest.mylaws;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<DataModel> dataList;
    private ArrayList<DataModel> dataListFull; // For search functionality

    public DataAdapter(ArrayList<DataModel> dataList) {
        this.dataList = dataList;
        this.dataListFull = new ArrayList<>(dataList); // For search functionality
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataModel data = dataList.get(position);
        holder.textCrimeHead.setText(data.getCrimeHead());
        holder.textIPC.setText(data.getIPC());
        holder.textBNS.setText(data.getBNS());
        holder.textPunishment.setText(data.getPunishment());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textCrimeHead, textIPC, textBNS, textPunishment;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textCrimeHead = itemView.findViewById(R.id.textCrimeHead);
            textIPC = itemView.findViewById(R.id.textIPC);
            textBNS = itemView.findViewById(R.id.textBNS);
            textPunishment = itemView.findViewById(R.id.textPunishment);
        }
    }

    // Search functionality
    public void filter(String searchText) {
        dataList.clear();
        if (searchText.isEmpty()) {
            dataList.addAll(dataListFull);
        } else {
            searchText = searchText.toLowerCase();
            for (DataModel model : dataListFull) {
                if (model.getCrimeHead().toLowerCase().contains(searchText) ||
                        model.getIPC().toLowerCase().contains(searchText) ||
                        model.getBNS().toLowerCase().contains(searchText) ||
                        model.getPunishment().toLowerCase().contains(searchText)) {
                    dataList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}
