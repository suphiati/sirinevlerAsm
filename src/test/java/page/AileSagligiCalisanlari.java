package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AileSagligiCalisanlari {

    public AileSagligiCalisanlari(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy (xpath = "//*[text()='Hemşire Tuğba Toraman']")
    public WebElement personelToraman;

    @FindBy (xpath = "//*[text()='Ebe Nurhan Durmuş']")
    public WebElement personelDurmus;

    @FindBy (xpath = "//*[text()='Ebe Zeynep Kızmaz']")
    public WebElement personelKizmaz;

    @FindBy (xpath = "//*[text()='Ebe Elif Özdemir Yayıcı']")
    public WebElement personelYayici;

    @FindBy (xpath = "//*[text()='Ebe Esra Aslan']")
    public WebElement personelAslan;

    @FindBy (xpath = "//*[text()='Hemşire Esra İbal Keçici']")
    public WebElement personelKecici;

    @FindBy (xpath = "//*[text()='Ebe Nuray Arı']")
    public WebElement personelAri;


}
