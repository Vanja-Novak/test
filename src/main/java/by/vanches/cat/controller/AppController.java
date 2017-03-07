package by.vanches.cat.controller;

import by.vanches.cat.model.Cat;
import by.vanches.cat.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * User: Vanja Novak
 * Date: 31.03.2016
 * Time: 22:30
 */

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private CatService catService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("catList", catService.findAllCat());
        return "index";
    }

    @RequestMapping(value = {"/edit/{catId}"}, method = RequestMethod.GET)
    public String editCat(@PathVariable Integer catId, ModelMap model) {
        model.addAttribute("cat", catService.findById(catId));
        return "edit";
    }

    @RequestMapping(value = {"/update"}, method = RequestMethod.POST)
    public String updateCat(@ModelAttribute("cat") Cat cat, BindingResult result) {
        catService.update(cat);
        return "redirect:/index";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.GET)
    public String deleteUser(ModelMap model) {
        catService.add();
        return "redirect:/index";
    }

    @RequestMapping(value = {"/delete/{catId}"}, method = RequestMethod.GET)
    public String deleteUser(@PathVariable Integer catId) {
        catService.deleteById(catId);
        return "redirect:/index";
    }
}
