package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("index") //jayde used RequestMapping(value = "") Why?
    public String skillsTracker(){
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "   <h2> Here are the skills to be learned</h2>" +
                        "       <ol>" +
                        "           <li>Ruby</li>" +
                        "           <li>Python</li>" +
                        "           <li>JavaScript</li>" +
                                "</ol>" +
                    "</body>" +
                "</html>";

    }

    @GetMapping("form") //again, RequestMapping(value = "form", method = RequestMethod.GET) why?
    public String skillsPref(){
        return "<html>" +
                "   <body>" +
                "       <form method = 'get' >" +  //"method = post"  TODO fix the routing here, too much cut/paste can add action = 'extension' to house the request at a diff ext.
                "           <input type = 'text' name = 'name'>Enter your name</input>" +
                "               <br>My favorite language: " + //br instead of p
                "                   <select name = 'fav1'>" +
                        "               <option value = 'ruby'> Ruby </option>" +
                        "               <option value = 'python'> Python </option>" +
                        "               <option value = 'javascript'> JavaScrip t</option>" +
                        "           </select>" +
                "               <br>My second favorite language: " +
                                    "<select fav2 = 'fav2'>My second favorite language:" +
                        "               <option value = 'ruby'> Ruby </option>" +
                        "               <option value = 'python'> Python </option>" +
                        "               <option value = 'javascript'> JavaScript </option>" +
                        "           </select>" +
                "               <br>My third favorite language: " +
                "                   <select fav3 = 'fav3'>My third favorite language:" +
                        "               <option value = 'ruby'> Ruby </option>" +
                        "               <option value = 'python'> Python </option>" +
                        "               <option value = 'javascript'> JavaScript </option>" +
                        "           </select>" +
                "           <br><input type = 'submit' value = 'Send it, bro'>" +
                "       </form>" +
                "   </body>" +
                "</html>";

    }

    //10.3.2 is going to help with this part (I think)
    @PostMapping("form") //@RequestMapping would work, too
    public String skillsResponse(@RequestParam String name, @RequestParam String fav1, @RequestParam String fav2, @RequestParam String fav3){
        return "<h1>name</h1>" +
                "<br><p>fav1</p>";
    }

    //write a handler to take QueryParams


}
