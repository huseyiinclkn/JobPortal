package org.example.jopapp.repo;


import org.example.jopapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>();


    public void addJob(JobPost job){
        jobs.add(job);
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }
}
