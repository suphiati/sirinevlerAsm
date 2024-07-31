package page;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Doktorlar {

    public Doktorlar(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
