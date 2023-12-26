package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageMedicalTechnologies {
    public PageMedicalTechnologies() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[@title='MEDİKAL TEKNOLOJİLER'])[1]")
    public WebElement MedicalTechSecme;


    @FindBy (xpath = "//span[text()='Medikal Teknolojiler']")
    public WebElement MedTechYazi;

    @FindBy (id="technologyType")
    public WebElement CihazTuruSecme;

    @FindBy (xpath = "(//img[@class='technology-lazy-load-img-cancelled'])[2]")
    public WebElement MedCihazSecme;


}
