import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

  @BeforeAll
  public static void setUp() {
    
    Configuration.holdBrowserOpen = true;
    Configuration.browser = "chrome";
    Configuration.browserSize = "2560x1440";
    Configuration.baseUrl = "https://play2.automationcamp.ir/";
  }
}
