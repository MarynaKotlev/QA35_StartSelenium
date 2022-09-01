import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Start {
    WebDriver wd;

    @Test
    public void poToPhomeBook(){
        //open browser
        wd = new ChromeDriver();
        //go to PhoneBook
     //  without history:
    //    wd.get("https://contacts-app.tobbymarshall815.vercel.app/");

        // with history fixations:
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
     //   wd.navigate().back();
     //   wd.navigate().forward();
     //   wd.navigate().refresh();

        //close browser
    //    wd.close(); //закрывает только одну вкладку (таб)
        wd.quit(); //закрывает все табы вместе с браузером

    }
}
