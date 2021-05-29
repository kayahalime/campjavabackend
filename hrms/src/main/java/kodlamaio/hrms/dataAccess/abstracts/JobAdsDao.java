package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAds;

public interface JobAdsDao extends JpaRepository<JobAds,Integer>{
	
	@Query("From JobAds where active = true")
	List<JobAds> getAllOpenJobAdsList();
	
	
	@Query("From JobAds where active = true and employer_id =:id")
	List<JobAds>getAllOpenJobAdsByEmployer(int id);

	
}
