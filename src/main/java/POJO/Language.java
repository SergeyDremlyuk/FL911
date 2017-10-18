package POJO;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Language {
    private int id;
    private String name;


    public Language(){

    }

    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

@XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
@XmlElement
    public void setName(String name) {
        this.name = name;
    }
}
