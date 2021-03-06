package test.entities;
// Generated 24.6.2015 13:49:31 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private Role role;
     private String name;
     private String lastname;
     private String degree;
     private String birthNumber;
     private Date dateIn;
     private Date dateOut;
     private Set branches = new HashSet(0);

    public User() {
    }

	
    public User(Role role, String birthNumber, Date dateIn) {
        this.role = role;
        this.birthNumber = birthNumber;
        this.dateIn = dateIn;
    }
    public User(Role role, String name, String lastname, String degree, String birthNumber, Date dateIn, Date dateOut, Set branches) {
       this.role = role;
       this.name = name;
       this.lastname = lastname;
       this.degree = degree;
       this.birthNumber = birthNumber;
       this.dateIn = dateIn;
       this.dateOut = dateOut;
       this.branches = branches;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getDegree() {
        return this.degree;
    }
    
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getBirthNumber() {
        return this.birthNumber;
    }
    
    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }
    public Date getDateIn() {
        return this.dateIn;
    }
    
    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }
    public Date getDateOut() {
        return this.dateOut;
    }
    
    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }
    public Set getBranches() {
        return this.branches;
    }
    
    public void setBranches(Set branches) {
        this.branches = branches;
    }




}


