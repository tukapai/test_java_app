package com.example.tukapai;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginServiceTest {

    LoginService sut = new LoginService();

    @Test
    public void ハッシュのテスト() throws Exception {
        String password = "isuconpass1";
        String salt = "salt1";
        String actual = sut.calculatePasswordHash(password, salt);
        assertThat(actual, is("6d7de4d284887f04c5a1d9e3431e9d7865a88bb6a7eab73ea6a22ac2d51d4db0"));
    }
