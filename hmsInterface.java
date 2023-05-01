import java.util.*;
public interface hmsInterface {
    // User management methods
    public boolean createUser(String username, String password);
    public boolean deleteUser(String username);
    public boolean login(String username, String password);
    public boolean logout(String username);

    // Doctor management methods
    public boolean addDoctor(String name, String specialization, String address, String phoneNumber);
    public boolean removeDoctor(String name);

    // Patient management methods
    public boolean addPatient(String name, String address, String phoneNumber, int age, String sex, String illness);
    public boolean removePatient(String name);

    // Contact information methods
    public boolean addContact(String email, String comments);
    public boolean removeContact(int id);
}
