package OnlineShop.OnlineShop.controller;

import OnlineShop.OnlineShop.model.Mask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class AddLater {

    /**
    This should be added later to MainController after ControllerUtils class implementation
    */


//    @GetMapping("/search")
//    public String search(
//            @PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 12) Pageable pageable,
//            @RequestParam String filter,
//            Model model
//    ) {
//        Page<Mask> page = maskService.findByManufacturerOrMaskTitle(filter, filter, pageable);
//        int[] pagination = ControllerUtils.computePagination(page);
//
//        model.addAttribute("pagination", pagination);
//        model.addAttribute("url", "/menu");
//        model.addAttribute("page", page);
//
//        return "menu";
//    }

    /**
     */
}
