package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String userName;
  private final String userMiddleName;
  private final String userLastName;
  private final String userNickName;
  private final String userCompanyName;
  private final String userCompanyAddress;
  private final String userMobilePhone;
  private final String userTestEmail;
  private final String groupOfUser;


  public ContactData(String userName, String userMiddleName, String userLastName, String userNickName, String userCompanyName, String userCompanyAddress, String userMobilePhone, String userTestEmail, String groupOfUser) {
    this.userName = userName;
    this.userMiddleName = userMiddleName;
    this.userLastName = userLastName;
    this.userNickName = userNickName;
    this.userCompanyName = userCompanyName;
    this.userCompanyAddress = userCompanyAddress;
    this.userMobilePhone = userMobilePhone;
    this.userTestEmail = userTestEmail;
    this.groupOfUser = groupOfUser;
  }

  public String getUserName() {
    return userName;
  }

  public String getUserMiddleName() {
    return userMiddleName;
  }

  public String getUserLastName() {
    return userLastName;
  }

  public String getUserNickName() {
    return userNickName;
  }

  public String getUserCompanyName() {
    return userCompanyName;
  }

  public String getUserCompanyAddress() {
    return userCompanyAddress;
  }

  public String getUserMobilePhone() {
    return userMobilePhone;
  }

  public String getUserTestEmail() {
    return userTestEmail;
  }

  public String getGroupOfUser() {
    return groupOfUser;
  }

}
