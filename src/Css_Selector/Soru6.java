package Css_Selector;
/*
Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
 */

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseDriver {


    @Test

    public void test1(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts= driver.findElement(By.cssSelector("[href='alerts/fake-alert-test.html']"));
        fakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement showModal= driver.findElement(By.cssSelector("[value='Show modal dialog']"));
        showModal.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.cssSelector("[class='dialog-button']"));
        ok.click();
        MyFunc.Bekle(2);


        BekleKapat();

    }
}
