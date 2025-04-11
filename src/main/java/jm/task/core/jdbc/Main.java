package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Jennie", "Kim", (byte) 20);
        userService.saveUser("Sam", "Kim", (byte) 30);
        userService.saveUser("Anna", "Jones", (byte) 35);
        userService.saveUser("Luke", "Smith", (byte) 29);


        UserDao userDao = new UserDaoHibernateImpl();
        userDao.getAllUsers().forEach(System.out::println);




        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
