package com.deniz;

/**
 * Created by Coşkun on 2.3.2017.
 */
public class User {
    private String name;
    private String surname;

    /**
     * Kişinin ismini getirir.
     * @return kişinin ismi.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
