package com.basov.sav.ArtLogisticTest.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ResponseTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testGetStockItem() throws Exception {
        String ticket = "stock-item";

        mockMvc.perform(get("/response/stockstate/{ticket}", ticket)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.stock-item").exists())
                .andExpect(jsonPath("$.stock-item", hasSize(1)));
    }
}
