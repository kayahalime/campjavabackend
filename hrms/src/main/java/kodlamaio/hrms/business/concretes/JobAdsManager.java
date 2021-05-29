package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdsDao;
import kodlamaio.hrms.entities.concretes.JobAds;

@Service
public class JobAdsManager implements JobAdsService {

	
	private JobAdsDao jobAdsDao;
	
	@Autowired
	public JobAdsManager(JobAdsDao jobAdsDao) {
		super();
		this.jobAdsDao = jobAdsDao;
	}

	@Override
	public DataResult<List<JobAds>> getAll() {
		return new SuccessDataResult<List<JobAds>>
		(this.jobAdsDao.findAll(),"Data listelendi");	
	}

	@Override
	public Result add(JobAds jobAds) {
		this.jobAdsDao.save(jobAds);
		return new SuccessResult("Data Eklendi");
	}

	@Override
	public DataResult<List<JobAds>> getAllOpenJobAdsList() {
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.getAllOpenJobAdsList());
	}

	@Override
	public DataResult<List<JobAds>> getAllOpenJobAdsByEmployer(int id) {
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.getAllOpenJobAdsByEmployer(id));
	}

}
