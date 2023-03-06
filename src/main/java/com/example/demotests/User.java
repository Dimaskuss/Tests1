package com.example.demotests;


import com.example.demotests.exceptions.LoginException;
import com.example.demotests.exceptions.WrongEmailException;
import com.example.demotests.validation.Validation;

public class User {
    private Validation validation;

    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) throws WrongEmailException, LoginException {
        if (!login.isBlank() && !login.isEmpty()) {
            this.login = login;
        } else {
            throw new LoginException("Логин не может быть пустым");
        }


        if (email.contains("@") || email.contains(".")) {
            this.email = email;
        } else {
            throw new WrongEmailException("Ведите корректный email");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
