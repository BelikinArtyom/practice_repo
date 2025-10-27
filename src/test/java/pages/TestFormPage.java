package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;

public class TestFormPage {
  
  private final SelenideElement body = $("body");
  private final SelenideElement firstName = $("#fname");
  private final SelenideElement lastName = $("#lname");
  private final SelenideElement genderMale = $("#male");
  private final SelenideElement optionList = $("#owc");
  private final SelenideElement optionsDropdown = $("#option");
  private final SelenideElement checkboxOption1 = $("[name=option1");
  private final SelenideElement checkboxOption2 = $("[name=option2");
  private final SelenideElement checkboxOption3 = $("[name=option3");
  private final SelenideElement textFieldSuggestions = $("[name=Options]");
  private final SelenideElement datePicker = $("#day");
  private final SelenideElement fileUpload = $("input[type='file']");
  private final SelenideElement rangeSelection = $("#quantity");
  private final SelenideElement messageField = $("[name=message]");
  
  
  public TestFormPage pageOpen() {
    open("https://play2.automationcamp.ir/");
    return this;
  }
  
  public TestFormPage setFirstName() {
    firstName.setValue("Alex");
    return this;
  }
  
  public TestFormPage setLastName() {
    lastName.setValue("The Terrible");
    return this;
  }
  
  public TestFormPage setGenderMale() {
    genderMale.click();
    return this;
  }
  
  public TestFormPage setDropdownOption(){
    optionList.click();
    optionsDropdown.selectOption("Option 3");
    return this;
  }
  
  public TestFormPage selectOptionSingle() {
    optionList.selectOption("Option 3");
    return this;
  }
  
  public TestFormPage multipleOptionsSelected() {
    checkboxOption1.click();
    checkboxOption2.click();
    checkboxOption3.click();
    return this;
  }
  
  public TestFormPage suggestFieldSelect() {
    textFieldSuggestions.click();
    textFieldSuggestions.setValue("Mint");
    body.click();
    return this;
  }
  
  public TestFormPage datePickerDateSet() {
    datePicker.setValue("12.12.2024");
    return this;
  }
  
  public TestFormPage scrollTo() {
    executeJavaScript(
      "arguments[0].value = 39;" +
        "arguments[0].dispatchEvent(new Event('input'))",
      $("input[type='range']")
    );
    return this;
  }
  
  public TestFormPage fileUpload() {
    fileUpload.uploadFromClasspath("lenrusstroj.jpg");
    return this;
  }
  
  public TestFormPage rangeSelection() {
    rangeSelection.click();
    rangeSelection.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP);
    rangeSelection.shouldHave(value("3"));
    return this;
  }
  
  public TestFormPage messageField() {
    messageField.setValue("Can piss without shitting. Cannot shit without pissing.\n" +
      "\n" +
      "/s");
    return this;
  }
  
}
