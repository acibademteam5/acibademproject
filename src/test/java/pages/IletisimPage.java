package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IletisimPage {
    public IletisimPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath ="//*[@title='İLETİŞİM']")
    public static WebElement iletisimsekmesi;

    @FindBy (xpath ="//*[@title='İletişim Formları']")
    public static WebElement iletisimformlari;

    @FindBy(xpath = "//span[text()='BİREYSEL']")
    public static WebElement bireyselsekmesi;

    @FindBy(xpath = "//input[@id='ContactForm_Firstname']")
    public static WebElement adiniz;

    @FindBy(xpath =  "//input[@id='ContactForm_Lastname']")
    public static WebElement soyadiniz;

    @FindBy(xpath = "//input[@id='ContactForm_Email']" )
    public static WebElement email;

    @FindBy(xpath = "//input[@id='ContactForm_Phone']")
    public static WebElement telno;

    @FindBy(xpath = "//textarea[@id='ContactForm_Message']")
    public static WebElement mesaj;

    @FindBy(xpath = "//input[@id='ContactForm_SecurityCode']")
    public static WebElement kod;

    @FindBy(xpath = "//body/section[4]/div[1]/div[1]/main[1]/article[1]/section[1]/div[2]/div[1]/form[1]/button[1]")
    public static WebElement gonder;

    @FindBy(id="acibademcaptchaBireysel")
    public static WebElement kodno;

    @FindBy(xpath = "//h2[contains(text(),'Teşekkürler!')]")
    public static WebElement text;

    @FindBy(xpath = " //button[contains(text(),'Kapat')]")
    public static WebElement kapatbuton;

    @FindBy(xpath = "//div[@id='sentModal']")
    public static WebElement talebinizalinmistir;
}
