package org.wecancodeit.reviewsfullstack;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.reviewsfullstack.controller.ReviewController;
import org.wecancodeit.reviewsfullstack.repository.CategoryRepository;
import org.wecancodeit.reviewsfullstack.repository.ReviewRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)

public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;
	// Injects into mockMvc to do all the CRUD stuff
	// Need to @MockBean BOTH repositories
	@MockBean
	private CategoryRepository categoryRepo;
	@MockBean
	private ReviewRepository reviewRepo;

	@Test
	public void shouldBeOKWhenAccessingHome() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

	@Test
	public void shouldGetHome() throws Exception {
		mockMvc.perform(get("/")).andExpect(view().name("index"));
	}

	// Tests failing but do not know why. Server is working
	@Test
	public void shouldBeOKWhenAccessingCategories() throws Exception {
		mockMvc.perform(get("/categories")).andExpect(status().isOk());
	}

	@Test
	public void shouldBeCategories() throws Exception {
		mockMvc.perform(get("/categories")).andExpect(view().name("categories"));
	}
}
