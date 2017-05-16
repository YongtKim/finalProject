package com.finalProject.mappin.common.controller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("menu")
public class HomeController {
	
	Logger log = Logger.getLogger(this.getClass());
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/home.ao")
	public String home(Locale locale, Model model) {
		log.debug("인터셉터");
		return "common/home";
	}
	@RequestMapping("/about.ao")
	public String about(Locale locale, Model model) {
		return "about/about";
	}
	@RequestMapping("/notice.ao")
	public String notice(Locale locale, Model model) {
		return "news//notice";
	}
	@RequestMapping("/event.ao")
	public String event(Locale locale, Model model) {
		return "news/event";
	}
	@RequestMapping("/traveler.ao")
	public String traveler(Locale locale, Model model) {
		return "traveler/traveler";
	}
	@RequestMapping("/guide.ao")
	public String guide(Locale locale, Model model) {
		return "guide/guide";
	}
	@RequestMapping("/community.ao")
	public String community(Locale locale, Model model) {
		return "community/community";
	}
	@RequestMapping("/contact.ao")
	public String contact(Locale locale, Model model) {
		return "contact/contact";
	}
}
