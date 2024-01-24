package dao;

import Utils.HibernateUtil;
import model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class UserImplDAO implements UserDAO {

    @Override
    public void createUser(User u) {
         Transaction ts = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            ts = session.beginTransaction(); //siempre hay que ponerle esto para iniciar las transacciones
            session.persist(u);//esto es para el insert
            ts.commit();//y esto cuando queremos acabarlo
        } catch (HibernateException he) {
            if (ts != null) {
                ts.rollback(); //para volver atrás, se pone en el catch no en el finally
            }
            System.err.println(he);
        }
    }

    @Override
    public void addSkill(String skillName) {

    }

    @Override
    public List<AcademicInfo> getUserAcademicInfo(User u) {
        return null;
    }

    @Override
    public void removeUser(User u) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<Skills> getUserSkills(User u) {
        return null;
    }

    @Override
    public List<Candidatures> getUserCandidatures(User u) {
        return null;
    }

    @Override
    public List<User> getUsersByName(String name) {
        return null;
    }

    @Override
    public void updateUser(User u) {

    }

    @Override
    public List<LaboralExperiences> getUserLaboralExperience(User u) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }

}
