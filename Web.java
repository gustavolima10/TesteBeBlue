package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        //Abrindo navegador
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\gusta\\source\\repos\\TesteGustavo\\packages\\Selenium.Chrome.WebDriver.2.40\\driver\\ChromeDriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para pagina Taskit
        navegador.get("http://www.magazineluiza.com.br");

        return navegador;
    }

}
