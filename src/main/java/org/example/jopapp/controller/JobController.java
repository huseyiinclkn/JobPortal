package org.example.jopapp.controller;



import org.example.jopapp.model.JobPost;
import org.example.jopapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;



    @GetMapping({"/", "home"})
    public String home() {

        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {

        return "addjob";
    }


    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobS(Model model) {
        List<JobPost> list = jobService.getAllJobs();
        model.addAttribute("jobPosts",list);

        return "viewalljobs";
    }

}
