package com.basov.sav.ArtLogisticTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ArtLogisticTestApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void testLogin() throws Exception {
		String jsonRequest = "{\"username\":\"sa_apitest\",\"password\":\"Zuvo4715\"}";

		mockMvc.perform(post("/account/login")
						.contentType(MediaType.APPLICATION_JSON)
						.content(jsonRequest))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.access").value("true"));
	}

	@Test
	void testPushRequest() throws Exception {
		mockMvc.perform(get("/request")
				.param("service", "STOCKSTATE")
				.param("date-to", "2025-12-31T23:59:59Z"))
				.andExpect(status().isOk());
	}

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
