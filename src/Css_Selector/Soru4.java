package Css_Selector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

    İlk input'a herhangi bir sayı giriniz.

    İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.

 */

public class Soru4 extends BaseDriver {

    @Test

    public void test1() {

        driver.get("https://testpages.eviltester.com/styled/index.html");

        WebElement calculator = driver.findElement(By.cssSelector("[id='calculatetest']"));
        calculator.click();
        MyFunc.Bekle(2);

        WebElement sayi1 = driver.findElement(By.cssSelector("[action='calculator']>div>input"));
        sayi1.sendKeys("15");

        WebElement sayi2 = driver.findElement(By.cssSelector("[action='calculator']>div>:nth-child(3)"));
        sayi2.sendKeys("16");
        MyFunc.Bekle(2);

        WebElement calculate = driver.findElement(By.cssSelector("[value='Calculate']"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement sonuc = driver.findElement(By.cssSelector("[action='calculator']+div>p>span"));
        sonuc.getText();
        System.out.println("sonuc = " + sonuc.getText());

        BekleKapat();


    }
}
