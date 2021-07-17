module EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens pl.emailclient;
    opens pl.emailclient.view;
    opens pl.emailclient.controller;
    opens pl.emailclient.model;
}