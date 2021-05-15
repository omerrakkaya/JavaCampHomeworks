package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobTitleService;
import hrms.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/job-titles/")
public class JobTitlesControllers {

	@Autowired
	private JobTitleService jobTitleService;
	
	
	public JobTitlesControllers(JobTitleService jobTitleService) {
		super();
		
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
		
	}
	
}