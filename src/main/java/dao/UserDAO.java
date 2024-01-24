/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import model.*;

import java.util.List;

/**
 *
 * @author dev
 */
public interface UserDAO {
    void createUser(User u);
    void addSkill(String skillName);
    List<AcademicInfo> getUserAcademicInfo(User u);
    void removeUser(User u);
    User getUser(int id);
    List<Skills> getUserSkills(User u);
    List<Candidatures> getUserCandidatures(User u);
    List<User> getUsersByName(String name);
    void updateUser(User u);
    List<LaboralExperiences> getUserLaboralExperience(User u);
    User getUserByName(String name);
}
