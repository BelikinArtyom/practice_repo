import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTests {
  
  @Test
  void firstTest() {
    
    Configuration.holdBrowserOpen = true;
    
    open("https://duckduckgo.com/");
    $("[id=searchbox_input").setValue("forest").pressEnter();
    $(".react-results--main").shouldHave(text("Forest-Home | Магазин ножей, арбалетов, луков - No1 в России"));
  }
}
