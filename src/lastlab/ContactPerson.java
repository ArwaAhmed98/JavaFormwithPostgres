/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastlab;

import java.sql.Date;

/**
 *
 * @author Eng. Arwa Ahmed
 */
public class ContactPerson {
    private int id; 
    private String name; 
    private String nickName;
    private String address;
    private String homePhone; 
    private String workPhoned;
    private String cellPhone; 
    private String email;
    private Date birthDate; 
    private String webSite;
    private String profession; 
/*********CONSTRUCTOR***********/
    public ContactPerson(int id, String name, String nickName, String address, String homePhone, String workPhoned, String cellPhone, String email, Date birthDate, String webSite, String profession) { 
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.address = address;
        this.homePhone = homePhone;
        this.workPhoned = workPhoned;
        this.cellPhone = cellPhone;
        this.email = email;
        this.birthDate = birthDate;
        this.webSite = webSite;
        this.profession = profession;
    }

/*********setters and getters************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhoned() {
        return workPhoned;
    }

    public void setWorkPhoned(String workPhoned) {
        this.workPhoned = workPhoned;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
}
