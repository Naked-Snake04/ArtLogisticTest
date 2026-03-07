package com.basov.sav.ArtLogisticTest.Controllers;

import com.myapp.api.AccountApi;
import com.myapp.model.AccountCredentials;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountLoginController implements AccountApi {

    @Override
    public ResponseEntity<String> login(AccountCredentials accountCredentials) {
        return ResponseEntity.ok("{\"token\": \"fake-token\"");
    }
}
