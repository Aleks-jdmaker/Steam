package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;

public class TopSellersPage {

    ElementsCollection topSellersSum = $$x("(//td[@class='weeklytopsellers_PriceCell_3IyfU'])");

    public void openTopSellersPage() {
        open("https://store.steampowered.com/charts/topselling/RU");
        sleep(1000);
    }

    public String parseGamePrices(int resultNumber) {
        return topSellersSum.get(resultNumber).getText();
    }
}
