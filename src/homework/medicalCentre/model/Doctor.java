package homework.medicalCentre.model;

import java.util.Objects;


public class Doctor extends Person {
    private String email;
    private DoctorProfession profession;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, DoctorProfession profession) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DoctorProfession getProfession() {
        return profession;
    }

    public void setProfession(DoctorProfession profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && profession == doctor.profession;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession='" +profession + '\'' +
                "} " + super.toString();
    }
}
