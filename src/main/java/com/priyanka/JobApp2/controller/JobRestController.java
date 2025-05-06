package com.priyanka.JobApp2.controller;

import com.priyanka.JobApp2.model.JobPost;
import com.priyanka.JobApp2.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJobId(postId);
    }

    @PostMapping("jobPosts")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return jobPost;
    }

    @PutMapping("jobPosts")
    public List<JobPost> updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getAllJobs();
    }

    @DeleteMapping("jobPosts/{postId}")
    public List<JobPost> deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return service.getAllJobs();
    }

    //sample to enter data for first time
    @GetMapping("load")
    public String loadData(){
        service.load();
        return "Success";
    }

    //search by keyword
    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyord(@PathVariable("keyword") String keyword){
        return service.search(keyword,keyword);

    }
}
