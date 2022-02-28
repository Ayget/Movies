package Ok;

public class Aktoret {
    String fullName;
    String roli;
    int mosha;

    public Aktoret(String fullName, String roli, int mosha) {
        this.fullName = fullName;
        this.roli = roli;
        this.mosha = mosha;
    }

    Aktoret() {}


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRoli() {
        return roli;
    }

    public void setRoli(String roli) {
        this.roli = roli;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Aktoret{" +
                "fullName='" + fullName + '\'' +
                ", roli='" + roli + '\'' +
                ", mosha=" + mosha +
                '}';
    }

}
