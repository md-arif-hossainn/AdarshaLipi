package com.example.adorsholipi;

public class FruitsData {


    private String folname;
    private String folnameE;
    private Integer folimage;


    public FruitsData(String folname, String folnameE, Integer folimage) {
        this.folname = folname;
        this.folnameE = folnameE;
        this.folimage = folimage;
    }


    public String getFolname() {
        return folname;
    }

    public void setFolname(String folname) {
        this.folname = folname;
    }

    public String getFolnameE() {
        return folnameE;
    }

    public void setFolnameE(String folnameE) {
        this.folnameE = folnameE;
    }

    public Integer getFolimage() {
        return folimage;
    }

    public void setFolimage(Integer folimage) {
        this.folimage = folimage;
    }
}
