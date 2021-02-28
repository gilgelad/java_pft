package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {

  @Test
  public void userModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", "test1", "test1"));
    }
    app.getContactHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createNewContact(new ContactData("Иван", "Иванович", "Иванов",
              "Happy", "Test Happy Company",
              "РФ, г. Москва, ул.Счастливая, д. 18", "+79999999999",
              "testmail@mail.ru", "test1"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillAddNewContactForm(new ContactData("Пётр", "Петрович", "Петров",
            "Happy", "Test Happy Company",
            "РФ, г. Москва, ул.Счастливая, д. 25", "+78888888888",
            "testmail-1@mail.ru", null), false);
    app.getContactHelper().submitUserModifiction();
    app.getContactHelper().returnToHomePage();
  }
}
