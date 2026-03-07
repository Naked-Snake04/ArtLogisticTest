package com.basov.sav.ArtLogisticTest.Controllers;

import com.myapp.api.ResponseApi;
import com.myapp.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController implements ResponseApi {
    @Override
    public ResponseEntity<Stockstate> getStockstate(String ticket) {
        Stockstate stockstateResponce = new Stockstate();

        StockItem item = new StockItem();

        stockstateResponce.addStockItemItem(item);
        return ResponseEntity.ok(stockstateResponce);
    }

    @Override
    public ResponseEntity<Claims> getClaims(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<Movements> getMovements(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<OrderSent> getOrderSent(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<OrderState> getOrderState(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<ProductOutgoConfirmation> getOutgoConfirmation(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<Payments> getPayments(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<ProductReceiveConfirmation> getReceiveConfirmation(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<Refunds> getRefunds(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<Returns> getReturns(String ticket) {
        return null;
    }

    @Override
    public ResponseEntity<Void> responseTypeTicketHead(String type, String ticket) {
        return null;
    }
}
