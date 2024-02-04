package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[text()='Anasayfa']")
    public WebElement anaSayfaMenu;

    @FindBy(xpath = "//a[text()='Genel']")
    public WebElement genelMenu;

    @FindBy(xpath = "//input[@class='arama']") // Header arama kutusu
    public WebElement aramaBoxMenu;

    @FindBy(xpath = "//input[@class='buton']") // Header arama tuşu
    public WebElement araTusu;

    ///--- Sayfalar ---///
    @FindBy(xpath = "//a[text()='Aile Sağlığı Çalışanlarımız']")
    public WebElement aileSagligiCalisanlari;

    @FindBy(xpath = "//a[text()='Doktorlarımız']")
    public WebElement doktorlarimiz;

    @FindBy(xpath = "//a[text()='Fotoğraf Galerisi']")
    public WebElement fotografGalerisi;

    @FindBy(xpath = "//a[text()='Hizmetlerimiz']")
    public WebElement hizmetlerimiz;

    @FindBy(xpath = "//a[text()='İletişim']")
    public WebElement iletisim;

    @FindBy(xpath = "//a[text()='Mesai Saatleri']")
    public WebElement mesaiSaatleri;

    @FindBy(xpath = "//a[text()='Personellerimiz']")
    public WebElement personellerimiz;

    @FindBy(xpath = "//input[@id='s']")
    public WebElement sayfalarAltiAramaKutusu;

    @FindBy(xpath = "//input[@value='Ara']")
    public WebElement sayfalarAltiAraTusu;


    ///--- Son Yazılar ---///

    @FindBy(xpath = "//a[text()='Mevsimsel Grip']")
    public WebElement mevsimselGripSonYazilar;

    @FindBy(xpath = "(//a[text()='Evlilik Öncesi Spinal Musküler Atrofi (SMA) Taşıyıcı Tarama Programı'])[3]")
    public WebElement evlilikOncesiSpinalSonYazilar;

    @FindBy(xpath = "(//a[text()='Aile Hekimini Öğren'])[3]")
    public WebElement aileHekiminiOgrenSonYazilar;



}
