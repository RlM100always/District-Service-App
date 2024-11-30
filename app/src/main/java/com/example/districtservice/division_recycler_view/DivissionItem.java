package com.example.districtservice.division_recycler_view;

public class DivissionItem extends DivissionActivity {
    private int image;
    private String division;

    public DivissionItem(int image, String division) {
        this.image = image;
        this.division = division;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}

