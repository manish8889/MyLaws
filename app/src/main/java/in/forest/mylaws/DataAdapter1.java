package in.forest.mylaws;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter1 extends RecyclerView.Adapter<DataAdapter1.ViewHolder> {
    private ArrayList<DataModel1> dataList;
    private ArrayList<DataModel1> dataListFull; // For search functionality

    public DataAdapter1(ArrayList<DataModel1> dataList) {
        this.dataList = dataList;
        this.dataListFull = new ArrayList<>(dataList); // For search functionality
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataModel1 data = dataList.get(position);
        holder.textHead.setText(data.getHead());
        holder.textCrPC.setText(data.getCrPC());
        holder.textBNSS.setText(data.getBNSS());
        holder.textProvision.setText(data.getProvisions());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textHead, textCrPC, textBNSS, textProvision;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textHead = itemView.findViewById(R.id.textHead);
            textCrPC = itemView.findViewById(R.id.textCrPC);
            textBNSS = itemView.findViewById(R.id.textBNSS);
            textProvision = itemView.findViewById(R.id.textProvision);
        }
    }

    // Search functionality
    public void filter(String searchText) {
        dataList.clear();
        if (searchText.isEmpty()) {
            dataList.addAll(dataListFull);
        } else {
            searchText = searchText.toLowerCase();
            for (DataModel1 model : dataListFull) {
                if (model.getHead().toLowerCase().contains(searchText) ||
                        model.getCrPC().toLowerCase().contains(searchText) ||
                        model.getBNSS().toLowerCase().contains(searchText) ||
                        model.getProvisions().toLowerCase().contains(searchText)) {
                    dataList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}
