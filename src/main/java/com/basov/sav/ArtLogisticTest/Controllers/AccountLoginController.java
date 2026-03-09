package com.basov.sav.ArtLogisticTest.Controllers;

import com.myapp.api.AccountApi;
import com.myapp.model.AccountCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountLoginController implements AccountApi {
    @Value("${test.login.username}")
    private String USERNAME;

    @Value("${test.login.password}")
    private String PASSWORD;

    @Override
    public ResponseEntity<String> login(AccountCredentials accountCredentials) {
        if (checkAccountCredentials(accountCredentials)) {
            return ResponseEntity.ok("{\"access\": \"true\"}");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Forbidden");
        }
    }

    private boolean checkAccountCredentials(AccountCredentials accountCredentials) {
        return accountCredentials != null &&
                accountCredentials.getUsername().equals(USERNAME) &&
                accountCredentials.getPassword().equals(PASSWORD);
    }
}
