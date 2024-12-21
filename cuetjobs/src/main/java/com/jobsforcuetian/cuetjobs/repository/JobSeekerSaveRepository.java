package com.jobsforcuetian.cuetjobs.repository;


import com.jobsforcuetian.cuetjobs.entity.JobPostActivity;
import com.jobsforcuetian.cuetjobs.entity.JobSeekerProfile;
import com.jobsforcuetian.cuetjobs.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}