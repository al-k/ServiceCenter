package ua.alk.servicecenter.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.misc.Contended;
import ua.alk.servicecenter.dao.interfaces.UserDAO;
import ua.alk.servicecenter.entities.User;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private List<User> users;


    @Transactional
//    @Override
    public List<User> getUsers() {

        users = (List<User>) sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY).list();

        return users;
    }
}
