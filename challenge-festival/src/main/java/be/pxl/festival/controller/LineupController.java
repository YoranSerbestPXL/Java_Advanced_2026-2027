package be.pxl.festival.controller;

import be.pxl.festival.model.Act;
import be.pxl.festival.model.FestivalDay;
import be.pxl.festival.service.LineupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/acts")
public class LineupController {

    private final LineupService lineupService;

    public LineupController(LineupService lineupService) {
        this.lineupService = lineupService;
    }

    @GetMapping
    public List<Act> findAll(@RequestParam(required = false) FestivalDay day) {
        if (day != null) {
            return lineupService.findByDay(day);
        }
        return lineupService.findAll();
    }

    @GetMapping("{day}")
    public List<Act> findByDay(@PathVariable FestivalDay day){
        return lineupService.findByDay(day);
    }

    @GetMapping("{id}")
    public Act getByID(@PathVariable Long id){
        return lineupService.getById(id);
    }

    @PostMapping
    public void createAct(@RequestBody Act act){
        lineupService.createAct(act);
    }

    @PutMapping ("{id}")
    public void changeAct(@PathVariable long id, @RequestBody Act act){lineupService.changeAct(id,act);}

    @DeleteMapping ("{id}")
    public void deleteAct(@PathVariable long id){lineupService.deleteAct(id);}
}
