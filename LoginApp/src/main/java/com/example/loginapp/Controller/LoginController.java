package com.example.loginapp.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class LoginController {
    @FXML
    protected void signup() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://login.inverse.neuralinverse.live/"));
    }
}
