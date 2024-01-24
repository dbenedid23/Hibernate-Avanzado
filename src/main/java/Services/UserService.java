/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import dao.UserImplDAO;
import model.*;

/**
 *
 * @author dev
 */
public class UserService {
    public void createUser(String userName){
        User u = new User();
        u.setNombre(userName);
        UserImplDAO uid = new UserImplDAO();
        try {          
                uid.createUser(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addJobExperience(User user, LaboralExperiences lab, Companies co){

    }
    public void addSkill(User user, String name) {

    }
    public void printUserInfo(User user){

    }
    public void addAcademicInfo(User user, AcademicInfo aca){

    }
    public void addCandidature(User user, Candidatures ca, JobOffer job){

    }
    public void addCandidature(User user, Candidatures ca) {

    }
    public void addSkill(User user, Skills skill){

    }
    public void addJobExperience(User user, LaboralExperiences lab) {

    }
    public void addAcademicInfo(User user, AcademicInfo aca, Institutions ins) {

    }
    public void addCandidature(User user, JobOffer job, String name, String nameCandidature) {

    }
    public void addCandidature(User user, JobOffer job) {

    }
    public void removeUser(User user){

    }
    public void createUser(String name, String description, int telephone, String mail){

    }
}
