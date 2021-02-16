package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTests extends TestBase {

  @Test
  public void userDeletion() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().confirmDeleteOperation();
    app.getNavigationHelper().gotoHomePage();
  }
}
