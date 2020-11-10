package com.example.uploadingfiles.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

    @NotNull(message = "userNameId can not be null")
    @Size(min = 10, max = 10 , message = "userNameId should only have 10 numbers")
    @Pattern(regexp="^\\d+$", message = "userNameId should only have digits")
    private String userNameId;

    @NotNull(message = "numberOfCoins can not be null")
    @Pattern(regexp="^\\d+$", message = "userNameId should only have digits")
    private String numberOfCoins;

    @NotNull(message = "userName can not be null")
    private String userName;


    public String getUserNameId() {
        return userNameId;
    }

    public void setUserNameId(String userNameId) {
        this.userNameId = userNameId;
    }

    public String getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(String numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
