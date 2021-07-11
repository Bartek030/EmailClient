module EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens pl.emailclient;
    opens pl.emailclient.view;
    opens pl.emailclient.controller;
}