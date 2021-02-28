package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class NewContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", "test1", "test1"));
    }
    app.getNavigationHelper().gotoContactsPageAndAddNewUser();
    app.getContactHelper().fillAddNewContactForm(new ContactData("Иван", "Иванович", "Иванов",
            "Happy", "Test Happy Company",
            "РФ, г. Москва, ул.Счастливая, д. 18", "+79999999999",
            "testmail@mail.ru", "test1"), true);
    app.getContactHelper().submitNewUserCreation();
    app.getContactHelper().returnToHomePage();
  }
}

