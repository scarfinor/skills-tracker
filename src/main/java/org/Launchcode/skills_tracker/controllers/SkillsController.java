package org.Launchcode.skills_tracker.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("nameAndFav")
public class SkillsController {
    public String nameAndFav(@RequestParam String name, @RequestParam String firstFav, @RequestParam String secondFav, @RequestParam String thirdFav) {
return "<html>" +
        "<body>" +
        "<header>" + "SkillsTracker" + "</header>" +
        "<h1>" + "We have a few skills we would like to learn here is the list: " + "</h1>" +
        "<p>" + "Name: " + name + "<p>" +
        "<ol>" +
        "<li>" + firstFav + "</li>" +
        "<li>" + secondFav + "</li>" +
        "<li>" + thirdFav + "</li>" +
        "</ol>" +
        "</body>" +
        "</html>";
}

@GetMapping("form")
    public String userForm() {
    return "<html>" +
            "<body>" +
            "<form action = 'nameAndFav'>" + //Submit a request to "nameAndFave"
            "<p>" + "Enter your name" + "</p>" + System.lineSeparator() +
            "<input type = 'text' name = 'name'>" + System.lineSeparator() +
            "<p>" + "What is your first favorite language" + "</p>" + System.lineSeparator() +
            "<input type = 'text' name = 'firstFav'>" + System.lineSeparator() +
            "<p>" + "What is your second favorite language" + "</p>" + System.lineSeparator() +
            "<input type = 'text' name = 'secondFav'>" + System.lineSeparator() +
            "<p>" + "What is your third favorite language" + "</p>" + System.lineSeparator() +
            "<input type = 'text' name = 'thirdFav'>" + System.lineSeparator() +
            "<p>" + System.lineSeparator() + "</p>" +
            "<input type = 'submit' value = 'Submit'>" + System.lineSeparator() +

            "</form>" +
            "</body>" +
            "</html>";
}
}
