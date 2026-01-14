package mvc;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class MyController {

    /*
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }
*/

    @ModelAttribute
    public void addDepartments(Model model) {
        Map<String, String> departments = new LinkedHashMap<>();

        departments.put("value1", "label1");
        departments.put("value2", "label2");
        departments.put("value3", "label3");

        model.addAttribute("departments", departments);

    }

    @ModelAttribute
    public void addGenders(Model model) {
        Map<String, String> genders = new LinkedHashMap<>();

        genders.put("male", "male");
        genders.put("female", "female");

        model.addAttribute("genders", genders);

    }

    @ModelAttribute
    public void addLanguages(Model model) {
        Map<String, String> languages = new LinkedHashMap<>();

        languages.put("EN", "EN");
        languages.put("RU", "RU");

        model.addAttribute("languages", languages);

    }

    @ModelAttribute(name = "employee")
    public Employee employee() {
        return new Employee();
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

/*
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("employeeName");

        empName = "atata" + empName;

        model.addAttribute("employeeName", empName);

        return "show-emp-details-view";

    }


    @RequestMapping("/showDetails")
    public String showEmployeeDetails(
            @RequestParam("employeeName") String empName,
            Model model) {


        empName = "atata" + empName;

        model.addAttribute("employeeName", empName);

        return "show-emp-details-view";

    }
*/

    /*
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "ask-emp-details-view";

        return "show-emp-details-view";

    }

    */

    @GetMapping(path = "/showDetails", produces="application/json")
    public Employee showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {

        return employee;

    }


}
