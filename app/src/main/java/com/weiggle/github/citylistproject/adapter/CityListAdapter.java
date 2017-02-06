package com.weiggle.github.citylistproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.weiggle.github.citylistproject.R;
import com.weiggle.github.citylistproject.entity.CityEntity;

import java.util.List;

/**
 * Created by weiggle on 2017/2/4.
 */

public class CityListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context mContext;
    private List<CityEntity> mList;
    private LayoutInflater mInflater;

    public CityListAdapter(Context context, List<CityEntity> list) {
        mContext = context;
        mList = list;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == CityEntity.TYPE_FIRST){
            return new FirstViewHolder(mInflater.inflate(R.layout.first_layout,null,false));
        }else{
            return new SecondViewHolder(mInflater.inflate(R.layout.second_layout,null,false));
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (getItemViewType(position)){
            case CityEntity.TYPE_FIRST:
                FirstViewHolder secondViewHolder = (FirstViewHolder) holder;
                secondViewHolder.mView.setText(mList.get(position).getCityName());
                break;
            case CityEntity.TYPE_SECOND:
                SecondViewHolder thirdViewHolder = (SecondViewHolder) holder;
                thirdViewHolder.mView.setText(mList.get(position).getCityName());
                break;
        }

    }

    @Override
    public int getItemCount() {
        return (mList != null && mList.size()>0)?mList.size():0;
    }


    private class FirstViewHolder extends RecyclerView.ViewHolder{

        private TextView mView;
        public FirstViewHolder(View itemView) {
            super(itemView);
            mView = (TextView) itemView.findViewById(R.id.first_text);
        }
    }

    private class SecondViewHolder extends RecyclerView.ViewHolder{
        private TextView mView;
        public SecondViewHolder(View itemView) {
            super(itemView);
            mView = (TextView) itemView.findViewById(R.id.second_text);
        }
    }
}
