package dao;

import model.Candidatures;
import model.Companies;
import model.JobOffer;
import model.Skills;

import java.util.List;

public class JobOfferImplDAO implements JobOfferDAO{
    @Override
    public void removeJobOffer(JobOffer jo) {

    }

    @Override
    public void updateJobOffer(JobOffer jo) {

    }

    @Override
    public List<JobOffer> getJobOffersBySalary(int salary) {
        return null;
    }

    @Override
    public List<JobOffer> getJobOffersByTitle(String title) {
        return null;
    }

    @Override
    public List<JobOffer> getJobOffersBySkills(String skill) {
        return null;
    }

    @Override
    public List<Candidatures> getJobOfferCandidatures(JobOffer jo) {
        return null;
    }

    @Override
    public List<JobOffer> getJobOfferByLocation(String location) {
        return null;
    }

    @Override
    public List<JobOffer> getJobOffersBySkill(Skills ski) {
        return null;
    }

    @Override
    public JobOffer getJobOffer(int id) {
        return null;
    }

    @Override
    public List<JobOffer> getJobOffersByWorkDayType(int workDayType) {
        return null;
    }

    @Override
    public void createJobOffer(JobOffer jo) {

    }

    @Override
    public List<JobOffer> getJobOffersByCompany(Companies co) {
        return null;
    }
}
