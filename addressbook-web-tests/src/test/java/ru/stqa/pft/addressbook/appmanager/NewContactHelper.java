package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactHelper extends HelperBase {

  public NewContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillAddNewContactForm(NewContactData newContactData) {
    type(By.name("firstname"), newContactData.getUserName());
    type(By.name("middlename"),newContactData.getUserMiddleName());
    type(By.name("lastname"), newContactData.getUserLastName());
    type(By.name("nickname"), newContactData.getUserNickName());
    type(By.name("company"), newContactData.getUserCompanyName());
    type(By.name("address"), newContactData.getUserCompanyAddress());
    type(By.name("mobile"), newContactData.getUserMobilePhone());
    type(By.name("email"), newContactData.getUserTestEmail());
  }

  public void submitNewUserCreation() {
    click(By.name("submit"));
  }
}
