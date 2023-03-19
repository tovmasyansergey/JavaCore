package classwork.classwork24;

public enum Language {

    HY("armenia"),
    RU("ruussia"),
    ENG;
    private String country;

    Language(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

     Language() {

    }
}
