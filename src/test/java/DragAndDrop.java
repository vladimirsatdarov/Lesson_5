import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void dad() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(200,0).release().perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
    }
}