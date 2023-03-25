package com.example.ParserViewerAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MachineDataController {
    @Autowired
    private ParsedDataRepository parsedDataRepository;

    @GetMapping("/")
    public ModelAndView getMachineData() {
        ModelAndView mav = new ModelAndView("machine-data");
        mav.addObject("machineData",parsedDataRepository.findAll());
        return mav;
    }
}
