
package POJO;


import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


@XmlRootElement(name = "user")
public class User {
    private int id;
    private String firstName;
    private String lastName;

    public enum Sex {male, female};
    private LocalDate bDay;
    private Sex sex;
    private String login;
    private String password;
    private Language nativeLanguage;

    public User() {

    }

    public User(int id, String firstName, String lastName, LocalDate bDay, Sex sex, String login, String password, Language nativeLanguage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bDay = bDay;
        this.sex = sex;
        this.login = login;
        this.password = password;
        this.nativeLanguage = nativeLanguage;
    }

    public String getLogin() {
        return login;
    }

    @XmlElement
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

   @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }

    public Language getNativeLanguage() {
        return nativeLanguage;
    }

    @XmlElement
    public void setNativeLanguage(Language nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

   @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getbDay() {
        return bDay;
    }

    @XmlElement
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    public void setbDay(LocalDate bDay) {
        this.bDay = bDay;
    }

    public Sex getSex() {
        return sex;
    }

    @XmlElement
    public void setSex(Sex sex) {
        this.sex = sex;
    }



}
