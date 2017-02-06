package com.weiggle.github.citylistproject.entity;

import java.io.Serializable;

/**
 * Created by weiggle on 2017/2/4.
 */

public class CityEntity implements Serializable {

    public static final int TYPE_FIRST = 0;
    public static final int TYPE_SECOND = 1;

    private String cityName;
    private int type;

    public CityEntity(String name, int type) {
        this.cityName = name;
        this.type = type;
    }

    public String getCityName() {
        return cityName;
    }

    public int getType() {
        return type;
    }

}
