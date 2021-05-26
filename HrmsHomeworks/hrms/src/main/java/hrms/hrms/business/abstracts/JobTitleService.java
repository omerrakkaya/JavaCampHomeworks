package hrms.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import hrms.hrms.entities.concretes.JobTitle;

public interface JobTitleService {

	List<JobTitle> getAll();

	void save(JobTitle jobTitle);

	Optional<JobTitle> findOneByTitle(String title);

}
