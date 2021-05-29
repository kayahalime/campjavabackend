package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAds;

public interface JobAdsService {

	DataResult<List<JobAds>> getAll();
    Result add(JobAds jobAds);
    DataResult<List<JobAds>> getAllOpenJobAdsList();
    DataResult<List<JobAds>> getAllOpenJobAdsByEmployer(int id);
}
