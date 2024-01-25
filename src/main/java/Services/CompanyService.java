package Services;
import dao.CompanyImplDAO;
import dao.UserImplDAO;
import model.Company;
import model.JobOffer;
import model.User;
import org.checkerframework.checker.units.qual.C;

public class CompanyService {
    public void createCompany(Company co){
        Company c = new Company();
        c.setName(String.valueOf(co));
        CompanyImplDAO cid = new CompanyImplDAO();
        try {
            cid.createCompany(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void removeCompany(Company co){
        Company c = new Company();
        c.setName(String.valueOf(co));
        CompanyImplDAO cid = new CompanyImplDAO();
        try {
            cid.removeCompany(c);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public Company createCompany(String name){
        Company c = new Company();
        c.setName(name);
        CompanyImplDAO cid = new CompanyImplDAO();
        try {
            cid.createCompany(c);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return c;
    }
    public void printCompanyInfo(Company co){
        Company c = new Company();
        c.setName(String.valueOf(co));
        CompanyImplDAO cid = new CompanyImplDAO();
        try {
            cid.updateCompany(c);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public Company createCompany(String name, String description){
        Company c = new Company();
        c.setName(name);
        c.setDescription(description);
        CompanyImplDAO cid = new CompanyImplDAO();
        try {
            cid.createCompany(c);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return c;
    }
    public void addJobOffer(Company co, JobOffer job){
        Company c = new Company();
        c.setName(String.valueOf(co));
        CompanyImplDAO cid = new CompanyImplDAO();
        try {
            cid.getCandidaturesByJobOffer(co, job);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
