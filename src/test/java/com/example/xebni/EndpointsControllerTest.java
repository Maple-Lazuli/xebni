package com.example.xebni;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EndpointsController.class)
public class EndpointsControllerTest {
    @Autowired
    private MockMvc mvc;
//    @Test
//    public void testingPages() throws Exception {
//        RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");
//
//        this.mvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(content().string(String.valueOf(Math.PI) + "\n"));
//    }
    @Test
    public void testPI() throws Exception {
        this.mvc.perform(get("/math/pi"))
                .andExpect(status().isOk());
    }
}