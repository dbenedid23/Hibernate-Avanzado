import Services.UserService;
import dao.CompanyImplDAO;
import dao.JobOfferImplDAO;
import dao.UserImplDAO;
import model.*;

public class Main {

    public static void main(String[] args) {
        UserService us = new UserService();
        LaboralExperience laboralExperience = new LaboralExperience("enuno", "madrid", false, "trabajoso", 20, 29);
        AcademicInfo academicInfo = new AcademicInfo("agua", 27, 31, "currentia", "meanscore");
        User u = new User("Usopp", "tirachinero", 0101012, "algo@algo");
//        u.setNombre("luffy");
//        u.setMail("captain@captain");
//        u.setTelephone(01010101);
        //us.createUser(u);
        us.addAcademicInfo(u, academicInfo);
        us.addJobExperience(u, laboralExperience);


//        JobOffer j = new JobOffer();
//        j.setTitle("La oferta del ayahusca");
//        j.setLocation("China");
//        j.setOpen(true);
//        jid.createJobOffer(j);
//
//        Company c = new Company();
//        c.setName("Mugiwaras");
//        cid.createCompany(c);
    }
}
