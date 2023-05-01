package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;
//TODO: Вынести все локаторы в поля. А в методах использовать переменные в которые записали локаторы.


public class MainPage {

    public String basedUrl = "https://store.steampowered.com/";

    public String openPage(){
        open(basedUrl);
        return title();
    }

    public String checkDropdownList(){
        open(basedUrl);
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

    public static void main(String[] args) {
        printArray(); printArray2(); printArray3(); printArray4();
    }

    // Создаём массив целых чисел и заполняем его числами 5,8,3,9,1,2,10,4,6,5.
    public static int[] createArray() {
        return new int[] {5, 8, 3, 9, 1, 2, 10, 4, 6, 5};
    }
        public static void printArray () {
        for (int i = 0; i < createArray().length; i++) {
            System.out.println(createArray()[i]);
        }
    }


    // Cоздаём массив и заполняем его значениями, а затем выводим его размер.
    public static int[] createArray2() {
        return new int[] {5, 8, 3, 9, 1, 2, 10, 4, 6, 5};
    }
    public static void printArray2() {
        System.out.println("Размер массива: " + createArray2().length);
    }


    // Создаём массив и заполняем его значениями, а затем выводим число из массива с индексом 5:
    public static int[] createArray3() {
        return new int[] {5, 8, 3, 9, 1, 2, 10, 4, 6, 5};
    }
    public static void printArray3() {
        System.out.println("Число с индексом 5: " + createArray3()[5]);
    }


    // Создаём массив целых чисел, заполняем его числами и выводим в консоль порядковый номер последнего индекса массива.
    public static int[] createArray4() {
        return new int[] {5, 8, 3, 9, 1, 2, 10, 4, 6, 5};
    }
    public static void printArray4() {
        int[] numbers4 = createArray4();
        int lastIndex = numbers4.length - 1;
        System.out.println("Номер последнего индекса: " + lastIndex);
    }
}
