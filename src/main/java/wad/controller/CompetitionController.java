
package wad.controller;

import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wad.domain.Competition;
import wad.repository.CompetitionRepository;

@Controller
@RequestMapping("/competitions")
public class CompetitionController {
    
    @Autowired
    private CompetitionRepository competitionRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    public String viewCompetitions(Model model){
        model.addAttribute("competitions", competitionRepository.findAll());
        return "competitions";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String addCompetition(@Valid @RequestParam String name, @Valid @RequestParam String location, @Valid @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        Competition competition = new Competition();
        competition.setName(name);
        competition.setLocation(location);
        competition.setDate(date);
        competitionRepository.save(competition);
        return "redirect:/competitions";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String viewCompetition(@PathVariable Long id, Model model){
        model.addAttribute("competition", competitionRepository.findOne(id));
        return "competition";
    }
    
}
