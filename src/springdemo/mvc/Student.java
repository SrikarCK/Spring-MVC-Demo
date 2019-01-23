package springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String operatingSystem;

    public LinkedHashMap<String, String> getoSOptions() {
        return oSOptions;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    private LinkedHashMap<String,String> favoriteLanguageOption;
    private LinkedHashMap<String,String> countryOptions;
    private LinkedHashMap<String,String> oSOptions;

    public Student(){
        //Populate Country options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("Unites States","Unites States");
        countryOptions.put("India","India");
        countryOptions.put("Canada","Canada");
        countryOptions.put("Australia","Australia");

        favoriteLanguageOption = new LinkedHashMap<>();
        favoriteLanguageOption.put("Java", "Java");
        favoriteLanguageOption.put("C#", "C#");
        favoriteLanguageOption.put("PHP", "PHP");
        favoriteLanguageOption.put("Python", "Python");

        oSOptions = new LinkedHashMap<>();
        oSOptions.put("Linux","Linux");
        oSOptions.put("Windows","Windows");
        oSOptions.put("Mac OS","Mac OS");
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public String getFavoriteLanguage() {
//        return favoriteLanguage;
//    }
//
//    public void setFavoriteLanguage(String favoriteLanguage) {
//        this.favoriteLanguage = favoriteLanguage;
//    }


    public LinkedHashMap<String, String> getFavoriteLanguageOption() {
        return favoriteLanguageOption;
    }


    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }
}
