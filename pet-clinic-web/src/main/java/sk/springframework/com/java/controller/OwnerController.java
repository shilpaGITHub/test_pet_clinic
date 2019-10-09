package sk.springframework.com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
/*   private final OwnerService ownerService;
    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }*/

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwner(){

        /*model.addAttribute("owners",ownerService.findAll());*/

        return "owners/index";
    }
}
