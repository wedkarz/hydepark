package service;

import java.util.List;

import domain.Credential;
import domain.User;

public interface UserInterface {
	public boolean createUser(String login, String password, String name, String surname);
	public User getUser(long id);
	public List<User> getAllUsers();
	public boolean deleteUserForUser(String login, String password);
	public boolean deleteUserForAdmin(String login);
	public boolean updateUserForUser(String login, String password, String newPassword, String name, String surname);
	public boolean updateUserForAdmin(String login, String newPassword, String name, String surname);
	public boolean banUser(String login);
	public boolean unBanUser(String login);
	public boolean duplicate(String name);
	public List<Credential> readCredential();
	public List<Credential> readTeacherCredential();
	public boolean setRole(String login, String role);
}
