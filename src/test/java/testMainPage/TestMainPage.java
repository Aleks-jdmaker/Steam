package testMainPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.SearchPage;
import pages.TopSellersPage;

public class TestMainPage {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    TopSellersPage topSellersPage = new TopSellersPage();

    String searchValue = "Dota 2";

    @Test
    public void firstTest() {
        Assertions.assertEquals("Добро пожаловать в Steam", mainPage.openPage());
    }

    @Test
    public void secondTest() {
        mainPage.openPage();
        Assertions.assertEquals("100 самых популярных игр\n" +
                "По текущему количеству игроков", mainPage.checkDropdownList());
    }

    @Test
    public void topSellersPageTest() {
        topSellersPage.openTopSellersPage();
        System.out.println(topSellersPage.parseGamePrices(1));
        int priceValue = Integer.parseInt(topSellersPage.parseGamePrices(1).replaceAll("[^0-9]", ""));
        Assertions.assertTrue(priceValue != 0);
    }

    @ParameterizedTest(name = "Параметризованный тест поиска Steam.")
    @ValueSource(strings = {"Dota 2", "Soundpad", "Legion TD 2", "Red Solstice 2", "The Lab"})
    public void searchTest(String parameter) {
        mainPage.searchValue(parameter);
        Assertions.assertTrue(searchPage.parseSearchResult(0).contains(parameter));
    }
}
