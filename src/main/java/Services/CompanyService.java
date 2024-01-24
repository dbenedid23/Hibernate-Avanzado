package Services;
import dao.CompanyImplDAO;
import dao.UserImplDAO;
import model.Company;
import model.JobOffer;
import model.User;

public class CompanyService {
    public void createCompany(Company co){
        Company c = new Company();
        c.setName(String.valueOf(co));
        CompanyImplDAO uid = new CompanyImplDAO();
        try {
            uid.createCompany(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void removeCompany(Company co){

    }
    public Company createCompany(String name){

        return null;
    }
    public void printCompanyInfo(Company co){

    }
    public Company createCompany(String name, String description){
        return null;
    }
    public void addJobOffer(Company co, JobOffer job){

    }
}
