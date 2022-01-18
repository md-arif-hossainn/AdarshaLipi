package com.example.adorsholipi;

public class shorbornoData {

    private String letterName;
    private String shorbornoWordName;
    private Integer letterImage;


    public shorbornoData(String letterName, String shorbornoWordName, Integer letterImage) {
        this.letterName = letterName;
        this.shorbornoWordName = shorbornoWordName;
        this.letterImage = letterImage;
    }

    public String getLetterName() {
        return letterName;
    }

    public void setLetterName(String letterName) {
        this.letterName = letterName;
    }

    public String getShorbornoWordName() {
        return shorbornoWordName;
    }

    public void setShorbornoWordName(String shorbornoWordName) {
        this.shorbornoWordName = shorbornoWordName;
    }

    public Integer getLetterImage() {
        return letterImage;
    }

    public void setLetterImage(Integer letterImage) {
        this.letterImage = letterImage;
    }
}
