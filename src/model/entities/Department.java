package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer id;
  private String name;

  public Department() {
  }

  public Department(Integer id, String name) {
    this.id = id;
    this.name = name;
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

  public Department id(Integer id) {
    setId(id);
    return this;
  }

  public Department name(String name) {
    setName(name);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Department)) {
      return false;
    }
    Department department = (Department) o;
    return Objects.equals(id, department.id) && Objects.equals(name, department.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Department [id=" + id + ", name=" + name + "]";
  }

}
