package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewUserCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoContactsPageAndAddNewUser();
    app.fillAddNewContactForm(new NewContactData("Иван", "Иванович", "Иванов",
            "Happy", "Test Happy Company",
            "РФ, г. Москва, ул.Счастливая, д. 18", "+79999999999",
            "testmail@mail.ru"));
    app.submitNewUserCreation();
    app.returnToHomePage();
  }
}

