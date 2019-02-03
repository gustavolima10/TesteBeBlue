package Tests;
//import Pages.elementosPage;
import Pages.PagePesquisa;
import Suporte.Web;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

@RunWith(DataDrivenTestRunner.class)
//@DataLoader(filePaths = "InformacoesUsuarioPageObjectsTest.csv" )
public class PesquisaProdutoTests {
    private WebDriver navegador;


    @Before
    public void setUp(){
        navegador = Web.createChrome();

    }

    @Test
    public void testPesquisaProduto()
             {

                 PagePesquisa pagePesquisa = new PagePesquisa(navegador)
                         .pesquisaProduto();

    }

    @After
    public void tearDown() {
        navegador.quit();

    }

}
