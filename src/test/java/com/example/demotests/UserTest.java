package com.example.demotests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.demotests.constants.UserTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    public void shouldEqualEmailAndLogin() {
        User result = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertNotEquals(result.getLogin(), result.getEmail());
    }

    @Test
    public void shouldCreateUserWithTwoParams() {
        User result = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        Assertions.assertTrue(result.getLogin().equals(CORRECT_LOGIN) && result.getEmail().equals(CORRECT_EMAIL));


    }

    @Test
    public void shouldCreateUserWithNoParams() {
        User result = new User();
        Assertions.assertTrue(result.getLogin() == null && result.getEmail() == null);

    }

    @Test
    public void shouldValidateEmailParam() {
        Assertions.assertFalse(WRONG_EMAIL.contains("@") && WRONG_EMAIL.contains("."));
        Assertions.assertTrue(CORRECT_EMAIL.contains("@") && CORRECT_EMAIL.contains("."));

    }

}