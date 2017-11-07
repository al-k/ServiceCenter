package ua.alk.servicecenter.dao.interfaces;

import ua.alk.servicecenter.entities.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
}
