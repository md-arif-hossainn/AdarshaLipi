package com.example.adorsholipi;

public class flowerData {

    private String fulname;
    private String fulEnglishname;
    private Integer fulImage;


    public flowerData(String fulname, String fulEnglishname, Integer fulImage) {
        this.fulname = fulname;
        this.fulEnglishname = fulEnglishname;
        this.fulImage = fulImage;


    }

    public String getFulname() {
        return fulname;
    }

    public void setFulname(String fulname) {
        this.fulname = fulname;
    }

    public String getFulEnglishname() {
        return fulEnglishname;
    }

    public void setFulEnglishname(String fulEnglishname) {
        this.fulEnglishname = fulEnglishname;
    }

    public Integer getFulImage() {
        return fulImage;
    }

    public void setFulImage(Integer fulImage) {
        this.fulImage = fulImage;
    }
}
