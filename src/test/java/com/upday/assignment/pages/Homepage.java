package com.upday.assignment.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    private AndroidDriver driver;

    public Homepage(AndroidDriver<?> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "de.axelspringer.yana:id/dialogPositiveButton")
    private AndroidElement okButton;

    @FindBy(id = "de.axelspringer.yana:id/navbar_home")
    private AndroidElement homeNav;

    @FindBy(id = "de.axelspringer.yana:id/navbar_topnews")
    private AndroidElement topNewsNav;

    @FindBy(id = "de.axelspringer.yana:id/navbar_mynews")
    private AndroidElement myNewsNav;

    public void dismissLandingModal() {
        okButton.click();
    }

    public AndroidElement getHomeNav() {
        return homeNav;
    }

    public AndroidElement getTopNewsNav() {
        return topNewsNav;
    }

    public AndroidElement getMyNewsNav() {
        return myNewsNav;
    }
}
