package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobAds;

@RestController
@RequestMapping("api/jobAds")
public class JobAdsController {
	
	private JobAdsService jobAdsService;
	
	@Autowired
	public JobAdsController(JobAdsService jobAdsService) {
		super();
		this.jobAdsService = jobAdsService;
	}
	
	@GetMapping("/getall")
	public DataResult <List<JobAds>> getall(){
		return this.jobAdsService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAds jobAds) {
		return this.jobAdsService.add(jobAds);
	}
	
	@GetMapping("/getAllOpenJobAdsList")
	public DataResult<List<JobAds>> getAllOpenJobAdsList(){
		return this.jobAdsService.getAllOpenJobAdsList();
	}
	
	@GetMapping("/getAllOpenJobAdsByEmployer")
	public DataResult<List<JobAds>> getAllOpenJobAdsByEmployer(int id){
		return this.jobAdsService.getAllOpenJobAdsByEmployer(id);
	}
	

}
