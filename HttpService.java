package com.example.hnb;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HttpService {

	private final RestTemplate restTemplate;

    public HttpService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getPostsPlainJSON() {
        String url = "https://api.hnb.hr/tecajn/v1";
        return this.restTemplate.getForObject(url, String.class);
    }
	
}
