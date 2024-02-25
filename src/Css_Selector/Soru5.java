package Css_Selector;
/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseDriver {

    @Test

    public void test1(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts= driver.findElement(By.cssSelector("[href='alerts/fake-alert-test.html']"));
        fakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement show= driver.findElement(By.cssSelector("[value='Show fake alert box']"));
        show.click();
        MyFunc.Bekle(2);

        WebElement ok= driver.findElement(By.cssSelector("[class='dialog-button']"));
        ok.click();
        MyFunc.Bekle(2);


        BekleKapat();

    }
}
