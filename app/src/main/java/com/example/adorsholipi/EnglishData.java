package com.example.adorsholipi;

public class EnglishData {


    private String letterneme;
    private String letterwordname;
    private Integer letterphoto;


    public EnglishData(String letterneme, String letterwordname, Integer letterphoto) {
        this.letterneme = letterneme;
        this.letterwordname = letterwordname;
        this.letterphoto = letterphoto;



    }

    public String getLetterneme() {
        return letterneme;
    }

    public void setLetterneme(String letterneme) {
        this.letterneme = letterneme;
    }

    public String getLetterwordname() {
        return letterwordname;
    }

    public void setLetterwordname(String letterwordname) {
        this.letterwordname = letterwordname;
    }

    public Integer getLetterphoto() {
        return letterphoto;
    }

    public void setLetterphoto(Integer letterphoto) {
        this.letterphoto = letterphoto;
    }
}
