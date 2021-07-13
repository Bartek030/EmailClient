package pl.emailclient;

import javafx.scene.control.TreeItem;
import pl.emailclient.controller.services.FetchFoldersService;
import pl.emailclient.model.EmailAccount;
import pl.emailclient.model.EmailTreeItem;

public class EmailManager {

    // Folder handling:
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<String>("");

    public EmailTreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount) {
        EmailTreeItem<String> treeItem = new EmailTreeItem<String>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), treeItem);
        fetchFoldersService.start();

        foldersRoot.getChildren().add(treeItem);
    }
}
