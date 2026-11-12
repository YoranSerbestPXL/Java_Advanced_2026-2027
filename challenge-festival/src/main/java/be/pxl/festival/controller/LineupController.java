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
    public List<Act> findAll() {
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
    public Act createAct(@RequestBody Act act){
        return lineupService.createAct(act);
    }

    @PutMapping ("{id}")
    public void changeAct(@PathVariable long id, @RequestBody Act act){lineupService.changeAct(id,act);}

    @DeleteMapping ("{id}")
}
