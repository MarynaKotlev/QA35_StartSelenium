import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;

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

    @Test
    public void loginTest() {

        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        //найти элемент (один) по тэгу. + Создается элемент
       WebElement element =  wd.findElement(By.tagName("h1"));
       //взаимодействие с єлементом:
        //кликнуть
        element.click();

        //найти элементы (все) по тэгу. + Создать коллекцию элементов
        List<WebElement> list = wd.findElements(By.tagName("h1"));
        //получить элемент под индексом 1
        WebElement element1 = list.get(1);
        element1.click();

        //найти элемент по ID
        wd.findElement(By.id("root"));

        //найти элемент по классу
        wd.findElement(By.className("container"));

        //найти по тексту ссылки
        wd.findElement(By.linkText("ABOUT"));
        // найти по части ссылки
        wd.findElement(By.partialLinkText("AB"));
        //найти по имени
        wd.findElement(By.name("name"));

        // найти по css selector (используется надстройка selectors hub). В кавычках - тэг нэйм
        wd.findElement(By.cssSelector("h1"));
        //поиск в селекторе по айди: "#название"
        wd.findElement(By.cssSelector("#root"));
        //поиск в селекторе по классу: ".название"
        wd.findElement(By.cssSelector(".container"));
        //поиск в селекторе по другим атрибутам: "[название='/значение']" (точное совпадение значения)
        wd.findElement(By.cssSelector("[href='/home']"));
        // только по атрибуту
        wd.findElement(By.cssSelector("[href]"));
        //..... если значение начинается на определенные символы
        wd.findElement(By.cssSelector("[href ^='/ho']"));
        //..... если значение содержит  определенные символы
        wd.findElement(By.cssSelector("[href *='/om']"));
        //..... если значение заканчивается на определенные символы
        wd.findElement(By.cssSelector("[href $='/om']"));

        //можно использовать два признака для поиска в css selector
        wd.findElement(By.cssSelector("a[href]"));
        // тэг нэйм "див", атрибут "айди", класс "контейнер"
        wd.findElement(By.cssSelector("div[id].container"));
        // тэг "а", атрбитут "хреф" со значением "/хоум"
        wd.findElement(By.cssSelector("a[href='/home']"));

        // ПРОБЕЛ или > позволяет двигаться вниз (локатор)
        // > только на один "этаж" ниже
        wd.findElement(By.cssSelector("div#root>div>h1"));
        // ПРОБЕЛ - все, что ниже, несмотря на количество этажей
        wd.findElement(By.cssSelector("div#root h1"));

        // найти ребенка
        wd.findElement(By.cssSelector("div#root :first-child"));
        // last-child, nth-child(2)




        // найти по x path

        wd.quit();

        }

    }

