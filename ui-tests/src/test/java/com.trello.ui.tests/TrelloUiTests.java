package com.trello.ui.tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TrelloUiTests {

    @Test
    public void createNewBoard(){

        Configuration.baseUrl = "https://trello.com";
        open("/login");
    }
}
