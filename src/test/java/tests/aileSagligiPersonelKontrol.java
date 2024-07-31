package tests;

import org.testng.annotations.Test;
import page.AileSagligiCalisanlari;
import page.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class aileSagligiPersonelKontrol {

    AileSagligiCalisanlari aileSagligiCalisanlari=new AileSagligiCalisanlari();

    HomePage homePage =new HomePage();

    @Test
    public void AileSagligiCalisanlari () {

        Driver.getDriver().get(ConfigReader.getProperty("asmUrl"));

        homePage.aileSagligiCalisanlari.click();
        aileSagligiCalisanlari.personelAri.isDisplayed();
        aileSagligiCalisanlari.personelAslan.isDisplayed();
        aileSagligiCalisanlari.personelDurmus.isDisplayed();
        aileSagligiCalisanlari.personelKecici.isDisplayed();
        aileSagligiCalisanlari.personelKizmaz.isDisplayed();
        aileSagligiCalisanlari.personelToraman.isDisplayed();
        aileSagligiCalisanlari.personelYayici.isDisplayed();


    }
}
