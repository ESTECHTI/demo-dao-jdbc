package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer id;
  private String name;
  private String email;
  private Date birthDate;
  private Double baseSalary;

  private Department department;

  public Seller() {
  }

  public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getBirthDate() {
    return this.birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public Double getBaseSalary() {
    return this.baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Department getDepartment() {
    return this.department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Seller id(Integer id) {
    setId(id);
    return this;
  }

  public Seller name(String name) {
    setName(name);
    return this;
  }

  public Seller email(String email) {
    setEmail(email);
    return this;
  }

  public Seller birthDate(Date birthDate) {
    setBirthDate(birthDate);
    return this;
  }

  public Seller baseSalary(Double baseSalary) {
    setBaseSalary(baseSalary);
    return this;
  }

  public Seller department(Department department) {
    setDepartment(department);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Seller)) {
      return false;
    }
    Seller seller = (Seller) o;
    return Objects.equals(id, seller.id) && Objects.equals(name, seller.name) && Objects.equals(email, seller.email)
        && Objects.equals(birthDate, seller.birthDate) && Objects.equals(baseSalary, seller.baseSalary)
        && Objects.equals(department, seller.department);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", email='" + getEmail() + "'" +
        ", birthDate='" + getBirthDate() + "'" +
        ", baseSalary='" + getBaseSalary() + "'" +
        ", department='" + getDepartment() + "'" +
        "}";
  }

}
