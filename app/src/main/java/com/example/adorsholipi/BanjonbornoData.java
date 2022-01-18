package com.example.adorsholipi;

public class BanjonbornoData {
    private String BletterName;
    private String BanjonWordName;
    private Integer BletterImage;

    public BanjonbornoData(String bletterName, String banjonWordName, Integer bletterImage) {
        BletterName = bletterName;
        BanjonWordName = banjonWordName;
        BletterImage = bletterImage;
    }

    public String getBletterName() {
        return BletterName;
    }

    public void setBletterName(String bletterName) {
        BletterName = bletterName;
    }

    public String getBanjonWordName() {
        return BanjonWordName;
    }

    public void setBanjonWordName(String banjonWordName) {
        BanjonWordName = banjonWordName;
    }

    public Integer getBletterImage() {
        return BletterImage;
    }

    public void setBletterImage(Integer bletterImage) {
        BletterImage = bletterImage;
    }
}
