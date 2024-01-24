package dao;

import model.Candidature;
import model.Company;
import model.JobOffer;

import java.util.List;

public class CompanyImplDAO implements CompanyDAO{
    @Override
    public Company getCompanyByName(String name) {
        return null;
    }

    @Override
    public List<Candidature> getCandidaturesByJobOffer(Company co, JobOffer jo) {
        return null;
    }

    @Override
    public void updateCompany(Company co) {

    }

    @Override
    public List<JobOffer> getJobOffers(Company co) {
        return null;
    }

    @Override
    public void removeCompany(Company co) {

    }

    @Override
    public void createCompany(Company co) {

    }

    @Override
    public Company getCompany(int id) {
        return null;
    }
}
