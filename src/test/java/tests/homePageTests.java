package tests;

import org.testng.annotations.Test;
import page.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class homePageTests{
    public static void sayfaGeriAlma(){
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
    }
    HomePage homePage =new HomePage();
    @Test
    public void homepagetesti(){
        Driver.getDriver().get(ConfigReader.getProperty("asmUrl"));


        homePage.anaSayfaMenu.click();

        homePage.genelMenu.click();
        sayfaGeriAlma();

        homePage.aileSagligiCalisanlari.click();
        sayfaGeriAlma();

        homePage.doktorlarimiz.click();
        sayfaGeriAlma();

        homePage.aileHekiminiOgrenSonYazilar.click();
        sayfaGeriAlma();

        homePage.fotografGalerisi.click();
        sayfaGeriAlma();

        homePage.hizmetlerimiz.click();
        sayfaGeriAlma();

        homePage.iletisim.click();
        sayfaGeriAlma();

        homePage.mesaiSaatleri.click();
        sayfaGeriAlma();

        homePage.personellerimiz.click();
        sayfaGeriAlma();

        homePage.mevsimselGripSonYazilar.click();
        sayfaGeriAlma();

        homePage.evlilikOncesiSpinalSonYazilar.click();
        sayfaGeriAlma();

        homePage.aileHekiminiOgrenSonYazilar.click();
        sayfaGeriAlma();


        homePage.aramaBoxMenu.sendKeys(ConfigReader.getProperty("aranacakKelime"));
        homePage.araTusu.click();
        homePage.aramaBoxMenu.clear();
        homePage.aramaBoxMenu.sendKeys(ConfigReader.getProperty("aranacakKelime2"));
        homePage.araTusu.click();


        ReusableMethods.bekle(2);
        Driver.closeDriver();

    }
}
