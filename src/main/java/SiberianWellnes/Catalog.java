package SiberianWellnes;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Catalog {
    public static void parseInfo () {
        open("https://kz.siberianwellness.com/kz-ru/c/katalog-9160/?isAvailable=" +
                "true&sorting=price-abs&minPrice=2000&maxPrice=5100");
        sleep(300);

        String info = Selenide.$(".product-card-c__info").getText();
/*        System.out.println(info);*/

        String[] newInfo = info.split(" ");
        String sum = newInfo[15] + newInfo[16];

        String cutSum = sum.replaceAll("[^0-9]", "");
        System.out.println(cutSum);

    }

    @Test
    public void startTest(){
        parseInfo();
    }
}
