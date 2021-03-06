package com.kh618.entmaa.MyClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class ListItem {

    @SerializedName("value")
    @Expose
    private Boolean value;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("data")
    @Expose
    private ArrayList<Item> data = null;

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ArrayList<Item> getData() {
        return data;
    }

    public void setData(ArrayList<Item> data) {
        this.data = data;
    }
    public class Item {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("name")
        @Expose
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}