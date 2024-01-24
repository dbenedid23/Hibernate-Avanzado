package dao;

import model.Candidatures;
import model.Companies;
import model.JobOffer;
import model.Skills;

import java.util.List;

public interface JobOfferDAO {
    void removeJobOffer(JobOffer jo);
    void updateJobOffer(JobOffer jo);
    List<JobOffer> getJobOffersBySalary(int salary);
    List<JobOffer> getJobOffersByTitle(String title);
    List<JobOffer>getJobOffersBySkills(String skill);
    List<Candidatures>getJobOfferCandidatures(JobOffer jo);
    List<JobOffer>getJobOfferByLocation(String location);
    List<JobOffer>getJobOffersBySkill(Skills ski);
    JobOffer getJobOffer(int id);
    List<JobOffer>getJobOffersByWorkDayType(int workDayType);
    void createJobOffer(JobOffer jo);
    List<JobOffer>getJobOffersByCompany(Companies co);
}
