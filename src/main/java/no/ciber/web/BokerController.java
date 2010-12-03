package no.ciber.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BokerController {

	private static final Logger logger = LoggerFactory.getLogger(BokerController.class);

	@RequestMapping(value="/GetBoker", method=RequestMethod.GET)
	public String getBoker() {
		logger.warn("Henter b¿ker");
		return "b¿ker";
	}
	
}
