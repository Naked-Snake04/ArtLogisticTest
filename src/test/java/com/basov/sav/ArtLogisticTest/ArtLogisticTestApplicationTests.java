package com.basov.sav.ArtLogisticTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ArtLogisticTestApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void testLogin() throws Exception {
		mockMvc.perform(post("/account/login")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"username\":\"sa_apitest\",\"password\":\"Zuvo4715\"}"))
				.andExpect(status().isOk());
	}
}
