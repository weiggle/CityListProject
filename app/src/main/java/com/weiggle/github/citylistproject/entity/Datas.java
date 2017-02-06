package com.weiggle.github.citylistproject.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weiggle on 2017/2/4.
 */

public class Datas {

    private static List<CityEntity> mDatas;

    {
        mDatas = new ArrayList<>();
        mDatas.add(new CityEntity("城市推荐",0));
        mDatas.add(new CityEntity("迪拜",1));
        mDatas.add(new CityEntity("美国",1));
        mDatas.add(new CityEntity("越南",1));
        mDatas.add(new CityEntity("韩国",1));
        mDatas.add(new CityEntity("日本",1));
        mDatas.add(new CityEntity("泰国",1));
        mDatas.add(new CityEntity("法国",1));


        mDatas.add(new CityEntity("亚洲",0));
        mDatas.add(new CityEntity("新加坡",1));
        mDatas.add(new CityEntity("泰国",1));
        mDatas.add(new CityEntity("马来西亚",1));
        mDatas.add(new CityEntity("印度",1));
        mDatas.add(new CityEntity("尼泊尔",1));
        mDatas.add(new CityEntity("日本",1));
        mDatas.add(new CityEntity("韩国",1));
        mDatas.add(new CityEntity("越南",1));
        mDatas.add(new CityEntity("朝鲜",1));
        mDatas.add(new CityEntity("普吉岛",1));
        mDatas.add(new CityEntity("巴厘岛",1));
        mDatas.add(new CityEntity("文莱",1));
        mDatas.add(new CityEntity("印度尼西亚",1));


        mDatas.add(new CityEntity("欧洲",0));
        mDatas.add(new CityEntity("美国",1));
        mDatas.add(new CityEntity("加拿大",1));
        mDatas.add(new CityEntity("巴西",1));
        mDatas.add(new CityEntity("墨西哥",1));
        mDatas.add(new CityEntity("古巴",1));
        mDatas.add(new CityEntity("智利",1));
        mDatas.add(new CityEntity("阿根廷",1));

        mDatas.add(new CityEntity("海岛",0));
        mDatas.add(new CityEntity("巴厘岛",1));
        mDatas.add(new CityEntity("塞班",1));
        mDatas.add(new CityEntity("普吉",1));
        mDatas.add(new CityEntity("马尔代夫",1));
        mDatas.add(new CityEntity("长滩",1));
        mDatas.add(new CityEntity("夏威夷",1));
        mDatas.add(new CityEntity("冲绳",1));
        mDatas.add(new CityEntity("苏梅岛",1));
        mDatas.add(new CityEntity("斯里兰卡",1));
        mDatas.add(new CityEntity("沙巴",1));
        mDatas.add(new CityEntity("帕劳",1));
        mDatas.add(new CityEntity("斯米兰岛",1));


        mDatas.add(new CityEntity("中东非",0));
        mDatas.add(new CityEntity("埃及",1));
        mDatas.add(new CityEntity("南非",1));
        mDatas.add(new CityEntity("迪拜",1));
        mDatas.add(new CityEntity("阿联酋",1));
        mDatas.add(new CityEntity("伊朗",1));
        mDatas.add(new CityEntity("肯尼亚",1));
        mDatas.add(new CityEntity("突尼斯",1));

    }

    public static List<CityEntity> getDatas(){
        return mDatas;
    }
}
