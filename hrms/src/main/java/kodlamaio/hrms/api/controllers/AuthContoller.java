package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("api/auth")
public class AuthContoller {
	
	private AuthService authService;

	@Autowired
	public AuthContoller(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody Employer employer, String confirmPassword) {
		
		return authService.registerEmployer(employer, confirmPassword);
	}
	
	@PostMapping("/registerJobSeeker")
	public Result registerJobSeeker(@RequestBody JobSeeker jobSeeker, String confirmPassword) {
		
		return authService.registerJobSeeker(jobSeeker, confirmPassword);
	}
	
	
	
	

}
