package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewUserCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoContactsPageAndAddNewUser();
    app.getContactHelper().fillAddNewContactForm(new NewContactData("Иван", "Иванович", "Иванов",
            "Happy", "Test Happy Company",
            "РФ, г. Москва, ул.Счастливая, д. 18", "+79999999999",
            "testmail@mail.ru"));
    app.getContactHelper().submitNewUserCreation();
    app.getNavigationHelper().returnToHomePage();
  }
}

