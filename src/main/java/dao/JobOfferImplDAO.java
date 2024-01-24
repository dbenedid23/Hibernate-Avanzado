package dao;

import model.Candidature;
import model.Company;
import model.JobOffer;
import model.Skill;

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
    public List<Candidature> getJobOfferCandidatures(JobOffer jo) {
        return null;
    }

    @Override
    public List<JobOffer> getJobOfferByLocation(String location) {
        return null;
    }

    @Override
    public List<JobOffer> getJobOffersBySkill(Skill ski) {
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
    public List<JobOffer> getJobOffersByCompany(Company co) {
        return null;
    }
}
