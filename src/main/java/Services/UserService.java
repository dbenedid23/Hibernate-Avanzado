/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import dao.CompanyImplDAO;
import dao.UserImplDAO;
import model.*;

/**
 *
 * @author dev
 */
public class UserService {
    private UserImplDAO uid;
    public UserService() {
        this.uid = new UserImplDAO();
    }
    public void createUser(String userName){
        User u = new User();
        u.setNombre(userName);
        uid.createUser(u);
    }
    public void addJobExperience(User user, LaboralExperience lab, Company co){
        lab.setCompany(co);
        lab.setUser(user);
        user.getLaboralExperiences().add(lab);
        uid.updateUser(user);
    }
    public void addSkill(User user, String name) {
        user.getSkills();

    }
    public void printUserInfo(User user){

    }
    public void addAcademicInfo(User user, AcademicInfo aca){
        user.getAcademicInfos().add(aca);
        uid.updateUser(user);
    }
    public void addCandidature(User user, Candidature ca, JobOffer job){

    }
    public void addCandidature(User user, Candidature ca) {

    }
    public void addSkill(User user, Skill skill){
        user.getSkills().add(skill);
        skill.getUsers().add(user);
        uid.updateUser(user);
    }
    public void addJobExperience(User user, LaboralExperience lab) {

    }
    public void addAcademicInfo(User user, AcademicInfo aca, Institution ins) {

    }
    public void addCandidature(User user, JobOffer job, String name, String nameCandidature) {

    }
    public void addCandidature(User user, JobOffer job) {

    }
    public void removeUser(User user){
        uid.removeUser(user);
    }
    public User createUser(String name, String description, int telephone, String mail){
        User u = new User();
        u.setNombre(name);
        u.setDescription(description);
        u.setTelephone(telephone);
        u.setMail(mail);
        uid.createUser(u);
        return u;
    }
}
