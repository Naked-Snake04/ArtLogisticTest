package com.basov.sav.ArtLogisticTest.Controllers;

import com.myapp.api.AccountApi;
import com.myapp.model.AccountCredentials;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountLoginController implements AccountApi {
    static String USERNAME = "sa_apitest";
    static String PASSWORD = "Zuvo4715";

    @Override
    public ResponseEntity<String> login(AccountCredentials accountCredentials) {
        if (checkAccountCredentials(accountCredentials)) {
            return ResponseEntity.ok("{\"access\": \"true\"}");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Forbidden");
        }
    }

    private static boolean checkAccountCredentials(AccountCredentials accountCredentials) {
        return accountCredentials != null &&
                accountCredentials.getUsername().equals(USERNAME) &&
                accountCredentials.getPassword().equals(PASSWORD);
    }
}
