// de controller wordt vanuit de html pagina aangeroepen
// deze pagina zorgt voor de functionaliteit

package nl.programit.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import nl.programit.domain.Sport;
import nl.programit.service.SportService;

@Controller
public class WebController {
	
	@Autowired
	SportService sportservice;
	
	@RequestMapping("/")
	public String getIndex(Model model){
		model.addAttribute("sport", new Sport());
		return "index";
	}

	@RequestMapping("saveSport")
		public String saveSport(@ModelAttribute("sport") Sport sport, Model model){
		sportservice.saveSport(sport);
		Collection <Sport> sports = sportservice.findAllSports();
		model.addAttribute("sports", sports);
		return "SportOverview";	
	}
	
	@RequestMapping("findAllSports")
	public String showSports(Model  model){
		
		model.addAttribute("sports",sportservice.findAllSports());
		return "SportOverview";
	}
}

