package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class AuthManager implements AuthService  {
	
	private EmployerService employerService;
	private JobSeekerService jobSeekerService;
	
	
	@Autowired
	public AuthManager(EmployerService employerService, JobSeekerService jobSeekerService) {
		super();
		this.employerService = employerService;
		this.jobSeekerService = jobSeekerService;
	}

	
	

	@Override
	public Result registerEmployer(Employer employer, String confirmPassword) {
		employerService.add(employer);
		return new SuccessResult("Kayıt Başarılı");
	}

	@Override
	public Result registerJobSeeker(JobSeeker jobSeeker, String confirmPassword) {
		jobSeekerService.add(jobSeeker);
		return new SuccessResult("Kayıt Başarılı");
	}

}
