package com.example.ditt_template;

import java.util.List;
import java.util.Map;
import org.pf4j.Extension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.ditt_sdk.Service.DevToolExtensionPoint;

@Extension
@Controller
@RequestMapping("/your-category")  // Replace with your category name
public class YourController implements DevToolExtensionPoint {

    @Autowired
    private YourService yourService;
    // Add more endpoints as needed
    @GetMapping("/your-tool") // Replace with your tool name
    public String loadPage(Model model) {
        // TODO: Set custom CSS/JS files if needed
        List<String> customCSS = List.of("color.css", "style.css"); /* Add your CSS file names here and do not delete the existing ones */
        List<String> customJS = List.of(); /* Add your JS file names here */
        model.addAttribute("customCSS", customCSS);
        model.addAttribute("customJS", customJS);
        return "your-tool-template"; // TODO: Return the view template name
    }

    @PostMapping("/your-tool") // Replace with your tool name
    @ResponseBody
    public Map<String, String> handleRequest(@RequestBody YourRequest request) {
        // Call the service and return the result Map
        return yourService.execute(request);
    }
}
