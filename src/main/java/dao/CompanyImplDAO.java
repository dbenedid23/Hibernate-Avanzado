package dao;

import model.Candidatures;
import model.Companies;
import model.JobOffer;

import java.util.List;

public class CompanyImplDAO implements CompanyDAO{
    @Override
    public Companies getCompanyByName(String name) {
        return null;
    }

    @Override
    public List<Candidatures> getCandidaturesByJobOffer(Companies co, JobOffer jo) {
        return null;
    }

    @Override
    public void updateCompany(Companies co) {

    }

    @Override
    public List<JobOffer> getJobOffers(Companies co) {
        return null;
    }

    @Override
    public void removeCompany(Companies co) {

    }

    @Override
    public void createCompany(Companies co) {

    }

    @Override
    public Companies getCompany(int id) {
        return null;
    }
}
