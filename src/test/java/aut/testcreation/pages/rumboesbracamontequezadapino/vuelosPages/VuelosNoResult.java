package aut.testcreation.pages.rumboesbracamontequezadapino.vuelosPages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosNoResult extends SeleniumWrapper {
    public VuelosNoResult(WebDriver driver) {
        super(driver);
    }
    By locatorTxtSinVuelos = By.xpath("//div[@class='modal-body']");

    public String mensajeSinVuelos(){
        return getText(locatorTxtSinVuelos);
    }
}
