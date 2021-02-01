package com.codeup.adlister.dao;

class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    public String getUser() {
        return "username";
    }
    public String getPassword() {
        return "password";
    }
}
