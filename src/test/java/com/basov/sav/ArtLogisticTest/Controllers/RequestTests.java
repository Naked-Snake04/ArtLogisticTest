package com.basov.sav.ArtLogisticTest.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RequestTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    void testPushRequest() throws Exception {
        mockMvc.perform(get("/request")
                        .param("service", "STOCKSTATE")
                        .param("date-to", "2025-12-31T00:00:00Z"))
                .andExpect(status().isOk())
                .andExpect(content().string("stock-item"));
    }
}
