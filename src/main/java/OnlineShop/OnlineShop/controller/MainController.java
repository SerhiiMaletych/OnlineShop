package OnlineShop.OnlineShop.controller;

import OnlineShop.OnlineShop.model.Mask;
import OnlineShop.OnlineShop.service.MaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class MainController {


    private final MaskService maskService;

    public MainController(MaskService maskService) {
        this.maskService = maskService;
    }


    @GetMapping("/")
    public String mainPage(Model model) {
        List<Mask> masks = maskService.findAll();
        model.addAttribute("masks", masks);

        return "main";
    }

    @GetMapping("/contacts")
    public String getContacts() {
        return "contacts";
    }


    @GetMapping("/cabinet")
    public String userCabinet() {
        return "user/userCabinet";
    }


    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable("id") Mask mask, Model model) {
        model.addAttribute("mask", mask);

        return "product";
    }

        @GetMapping("/search")
    public String search(
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 12) Pageable pageable,
            @RequestParam String filter,
            Model model
    ) {
        Page<Mask> page = maskService.findByManufacturerOrMaskTitle(filter, filter, pageable);
        int[] pagination = ControllerUtils.computePagination(page);

        model.addAttribute("pagination", pagination);
        model.addAttribute("url", "/menu");
        model.addAttribute("page", page);

        return "menu";
    }
}