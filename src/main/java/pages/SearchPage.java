package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    ElementsCollection searchResults = $$x("//div[@id='search_results']//a");

    public String parseSearchResult(int numberElement) {
        return searchResults.get(numberElement).getText();
    }
}
