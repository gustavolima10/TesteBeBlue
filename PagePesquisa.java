package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class PagePesquisa extends BasePage {
    public PagePesquisa(WebDriver navegador) {
        super(navegador);

    }

        public PagePesquisa pesquisaProduto() {
            navegador.findElement(By.id("inpHeaderSearch")).click();
            navegador.findElement(By.id("inpHeaderSearch")).sendKeys("Iphone 7");
            navegador.findElement((By.id("btnHeaderSearch"))).click();
            navegador.findElement(By.xpath("//*[@id=\"product_218009200\"]/div[1]/div/img")).click();
            navegador.findElement(By.cssSelector(".js-main-add-cart-button")).click();
            navegador.findElement(By.linkText("continuar")).click();
            Assert.assertEquals("iPhone 7 Apple 32GB Preto Matte 4G Tela 4.7”Retina - Câm. 12MP + Selfie 7MP iOS 11 Proc. Chip A10 ", "iPhone 7 Apple 32GB Preto Matte 4G Tela 4.7”Retina - Câm. 12MP + Selfie 7MP iOS 11 Proc. Chip A10 ");

            return this;

        }

}
