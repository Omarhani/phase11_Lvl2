package t;

import base.BaseTests;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class T extends BaseTests {



    @Test
    public void t1() throws FileNotFoundException {
        System.out.println(dataModel().Login.ValidCredentials.Username);
        System.out.println(dataModel().Login.ValidCredentials.Password);
    }
    @Test
    public void t2() throws FileNotFoundException {
        System.out.println(dataModel().Login.InvalidCredentials.InvalidUsername.Username);
        System.out.println(dataModel().Login.InvalidCredentials.InvalidUsername.Password);
    }
    @Test
    public void t3() throws FileNotFoundException {
        System.out.println(dataModel().Login.InvalidCredentials.InvalidPassword.Username);
        System.out.println(dataModel().Login.InvalidCredentials.InvalidPassword.Password);
    }
}
