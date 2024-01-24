package dao;

import model.Candidatures;
import model.Companies;
import model.JobOffer;

import java.util.List;

public interface CompanyDAO {
    Companies getCompanyByName(String name);
    List<Candidatures> getCandidaturesByJobOffer(Companies co, JobOffer jo);
    void updateCompany(Companies co);
    List<JobOffer>getJobOffers(Companies co);
    void removeCompany(Companies co);
    void createCompany(Companies co);
    Companies getCompany(int id);
}
