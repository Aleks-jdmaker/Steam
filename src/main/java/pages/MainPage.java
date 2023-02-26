package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;
//TODO: Вынести все локаторы в поля. А в методах использовать переменные в которые записали локаторы.
basedUrl

public class MainPage {
    public String openPage(){
        open("https://store.steampowered.com/");
        return title();
    }

    public String checkDropdownList(){
        open("https://store.steampowered.com/");
        $("#noteworthy_tab").hover();
        sleep(3000);
        $x("//a[@class='popup_menu_item'][contains(text(),'Самые популярные')]").click();
        sleep(3000);
        return $(".steamchartsshell_PageSubtitle_3wxTK").getText();
    }

    public void searchValue(String requiredValue){
        open("https://store.steampowered.com/");
        $("#store_nav_search_term").setValue(requiredValue).pressEnter();
        sleep(3000);
        /*$x("//a[@class='popup_menu_item'][contains(text(),'Самые популярные')]").click();
        sleep(3000);
        return $(".steamchartsshell_PageSubtitle_3wxTK").getText();*/
    }

    //TODO: ввести в окно поиска Dota 2, нажать энтер. после проверить, что в результатах поиска есть Dota 2.
    //span[normalize-space()='Dota 2']
}
