package beans;

public class NewPatient {
    private int id;
    private String name;
    private String address;
    private String doctor;
    private double fees;

    public NewPatient() {
    }

    public NewPatient(int id, String name, String address, String doctor, double fees) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.doctor = doctor;
        this.fees = fees;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "NewPatient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", doctor='" + doctor + '\'' +
                ", fees=" + fees +
                '}';
    }
}

