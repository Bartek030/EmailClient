package pl.emailclient.controller.services;

import pl.emailclient.EmailManager;
import pl.emailclient.model.EmailAccount;

public class LoginService {

    EmailAccount emailAccount;
    EmailManager emailManager;

    public LoginService(EmailAccount emailAccount, EmailManager emailManager) {
        this.emailAccount = emailAccount;
        this.emailManager = emailManager;
    }

    public void login() {

    }
}
