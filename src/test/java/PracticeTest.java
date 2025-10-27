import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import pages.TestFormPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PracticeTest extends TestBase {
  
  TestFormPage testFormPage = new TestFormPage();
  
  @Test
  void practiceFormTest() {
    
    testFormPage.pageOpen()
      .setFirstName()
      .setLastName()
      .setGenderMale()
      .setDropdownOption()
      .selectOptionSingle()
      .multipleOptionsSelected()
      .suggestFieldSelect()
      .datePickerDateSet()
      .scrollTo()
      .fileUpload()
      .rangeSelection()
      .messageField();
    
  }
}
