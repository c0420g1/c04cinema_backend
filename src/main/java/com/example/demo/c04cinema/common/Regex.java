package com.example.demo.c04cinema.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String NAME_REGEX = "^[a-zA-Z]+(([\\',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    private static final String BIRTH_REGEX = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
    private static final String GENDER_REGEX = "Male|Female";
    private static final String CARD_REGEX = "[\\d]{3,}(-)[\\d]{2,}(-)[\\d]{4,}";
    private static final String PHONE_REGEX = "^[\\d\\s]+$";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,20}$";
    private static Pattern pattern;
    private static Matcher matcher;

    public boolean regexEmail(String string){
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public boolean regexName(String string){
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public boolean regexGender(String string){
        pattern = Pattern.compile(GENDER_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public boolean regexCard(String string){
        pattern = Pattern.compile(CARD_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean regexPhone(String string){
        pattern = Pattern.compile(PHONE_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public boolean regexPass(String string){
        pattern = Pattern.compile(PASSWORD_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
