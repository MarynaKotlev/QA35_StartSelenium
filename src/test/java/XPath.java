import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XPath {

    WebDriver wd;

    @Test
    public void xPathTests() {
        wd = new ChromeDriver();
        //раскрыть браузер на весь экран:
        wd.manage().window().maximize();

        // ожидание после неудачного поиска, перед выдачей ошибки
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        // один слеш / для абсолютного пути, два слеша // для относительного
        // в Хpath все атрибуты пишутся в [] и начинаются с @
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();

        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.click(); // ставим курсор в поле для ввода
        inputEmail.clear(); // очистить поле перед тем, как печатать в нем
        inputEmail.sendKeys("noa@gmail.com");

        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Nnoa12345$");

        WebElement loginButton = wd.findElement(By.xpath("//button[1]"));
        // второй вариант - //button[text()=" Login"]
        // //*[text()=" Login"]

        loginButton.click();

        // чтобы от ребенка найти родителя: поставить после ребенка ..



    }

}
