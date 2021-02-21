package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class UserModificationTests extends TestBase {

  @Test
  public void userModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillAddNewContactForm(new ContactData("Пётр", "Петрович", "Петров",
            "Happy", "Test Happy Company",
            "РФ, г. Москва, ул.Счастливая, д. 25", "+78888888888",
            "testmail-1@mail.ru", null), false);
    app.getContactHelper().submitUserModifiction();
    app.getNavigationHelper().returnToHomePage();
  }
}
