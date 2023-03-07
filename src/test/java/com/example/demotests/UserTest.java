package com.example.demotests;

import com.example.demotests.exceptions.LoginException;
import com.example.demotests.exceptions.WrongEmailException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static com.example.demotests.constants.UserTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    public void shouldEqualEmailAndLogin() throws WrongEmailException, LoginException {
        User result = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertNotSame(result.getLogin(), result.getEmail());
    }

    @Test
    public void shouldCreateUserWithTwoParams() throws WrongEmailException, LoginException {
        User result = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        Assertions.assertEquals(CORRECT_LOGIN, result.getLogin());
        Assertions.assertEquals(CORRECT_EMAIL, result.getEmail());

    }

    @Test
    public void shouldCreateUserWithNoParams() {
        User result = new User();
        assertNull(result.getLogin());
        assertNull(result.getEmail());
    }

    @Test
    public void shouldValidateEmailParam() {

        assertThrows(WrongEmailException.class, () -> new User(CORRECT_LOGIN, WRONG_EMAIL));


    }

}