package com.example.districtservice.district_recycler_view;

public class DistrictItem {
    private String districtName;
    private int imageResource;

    public DistrictItem(String districtName, int imageResource) {
        this.districtName = districtName;
        this.imageResource = imageResource;
    }

    public String getDistrictName() {
        return districtName;
    }

    public int getImageResource() {
        return imageResource;
    }
}
