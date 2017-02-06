package com.weiggle.github.citylistproject.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.weiggle.github.citylistproject.R;
import com.weiggle.github.citylistproject.adapter.CityListAdapter;
import com.weiggle.github.citylistproject.entity.CityEntity;
import com.weiggle.github.citylistproject.entity.Datas;
import java.util.ArrayList;
import java.util.List;

public class CityRecyclerActivity extends AppCompatActivity {

    private RecyclerView mCityList;
    private List<CityEntity> mDatas = new ArrayList<>();
    private CityListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_recycler);


        mDatas = Datas.getDatas();
        initView();
    }


    private void initView(){
        mCityList = (RecyclerView) findViewById(R.id.recycler);
        mAdapter = new CityListAdapter(this,mDatas);
        final GridLayoutManager manager = new GridLayoutManager(this,4);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                switch (mAdapter.getItemViewType(position)){
                    case CityEntity.TYPE_FIRST:
                        return 4;
                    case CityEntity.TYPE_SECOND:
                        return 1;
                    default:
                        return 1;
                }

            }
        });
        mCityList.setLayoutManager(manager);
        mCityList.setAdapter(mAdapter);
    }


}
