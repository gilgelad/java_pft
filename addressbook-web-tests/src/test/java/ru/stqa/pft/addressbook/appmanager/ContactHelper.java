package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillAddNewContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getUserName());
    type(By.name("middlename"),contactData.getUserMiddleName());
    type(By.name("lastname"), contactData.getUserLastName());
    type(By.name("nickname"), contactData.getUserNickName());
    type(By.name("company"), contactData.getUserCompanyName());
    type(By.name("address"), contactData.getUserCompanyAddress());
    type(By.name("mobile"), contactData.getUserMobilePhone());
    type(By.name("email"), contactData.getUserTestEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroupOfUser());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void submitNewUserCreation() {
    click(By.name("submit"));
  }


  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitUserModifiction() {
    click(By.name("update"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void confirmDeleteOperation() {
    wd.switchTo().alert().accept();
  }
}
