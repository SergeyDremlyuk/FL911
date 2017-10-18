package POJO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "userList")
public class UserList {

    @XmlElement(name = "user", type = User.class)
    private List<User> userList = new ArrayList<>();


    public UserList(){

    }

    public UserList(List<User> userList) {
        this.userList = userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public List<User> getUserList() {
        return userList;
    }

}
