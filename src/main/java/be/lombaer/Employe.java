package be.lombaer;

/**
 * Created by sergelombaerts on 4/09/17.
 */
public class Employe extends Person {

    private String EmpId ;

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        if (!super.equals(o)) return false;

        Employe employe = (Employe) o;

        return getEmpId() != null ? getEmpId().equals(employe.getEmpId()) : employe.getEmpId() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getEmpId() != null ? getEmpId().hashCode() : 0);
        return result;
    }
}
