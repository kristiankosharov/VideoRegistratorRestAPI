package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.Video;

@RestController
public class VideoRegistratorController {

	@RequestMapping(method = RequestMethod.GET, value = "/video")
	public Video video() {
		Video video = new Video();
		video.setName("Kiki");
		return video;
	}
}
