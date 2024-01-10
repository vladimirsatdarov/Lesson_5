import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class HoverTest {
    @Test
    open("https://github.com/");
    $(byText("Solutions")).hover();
}
