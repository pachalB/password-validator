package com.acme.csci3130;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest extends MainActivity {
    @Test
    public void checkPassword() throws Exception {
        assertTrue(verifyPassword("password")==1);
        assertTrue(verifyPassword("1")==1);
        assertTrue(verifyPassword("somepass")==2);
    }
}