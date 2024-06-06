package com.example.springai.controller;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @Autowired
    private OpenAiImageModel openAiImageModel;

    @GetMapping("/ai/image")
    public String imageGenerator(String prompt) {
        System.out.println("prompt提示词是: " + prompt);

        ImagePrompt imagePrompt = new ImagePrompt(prompt);
        ImageResponse response = openAiImageModel.call(imagePrompt);
        String url = response.getResult().getOutput().getUrl();
        return "<img src='" + url + "' />";
    }
}
