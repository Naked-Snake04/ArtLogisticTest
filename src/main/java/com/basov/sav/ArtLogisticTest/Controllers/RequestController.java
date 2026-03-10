package com.basov.sav.ArtLogisticTest.Controllers;

import com.myapp.api.RequestApi;
import com.myapp.model.SalesChannel;
import com.myapp.model.Services;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
public class RequestController implements RequestApi {

    @Override
    public ResponseEntity<String> pushRequest(Services service,
                                              String feedbackUrl,
                                              OffsetDateTime dateFrom,
                                              OffsetDateTime dateTo,
                                              String invoiceNr,
                                              String orderNr,
                                              SalesChannel salesChannel) {
        boolean checkService = service == Services.STOCKSTATE;
        boolean checkDate = dateTo != null;

        if (checkService && checkDate) return ResponseEntity.ok("stock-item");
        else return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Forbidden");
    }
}
