package Ok;

import java.util.ArrayList;
import java.util.List;

public class Filmat {
    private int vitiIProdhimit;
    String titulli;
    private String kohezgjatja;
    private List<String>zhanerat = new ArrayList<>();
    private List<String>Aktoret = new ArrayList<>();

    public Filmat(int vitiIProdhimit, String titulli, List<String> zhanerat, List<String> aktoret) {
        this.vitiIProdhimit = vitiIProdhimit;
        this.titulli = titulli;
        this.zhanerat = zhanerat;
        Aktoret = aktoret;
    }

    public int getVitiIProdhimit() {
        return vitiIProdhimit;
    }

    public void setVitiIProdhimit(int vitiIProdhimit) {
        this.vitiIProdhimit = vitiIProdhimit;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public List<String> getZhanerat() {
        return zhanerat;
    }

    public void setZhanerat(List<String> zhanerat) {
        this.zhanerat = zhanerat;
    }

    public List<String> getAktoret() {
        return Aktoret;
    }

    public void setAktoret(List<String> aktoret) {
        Aktoret = aktoret;
    }

    @Override
    public String toString() {
        return "Filmat{" +
                "vitiIProdhimit=" + vitiIProdhimit +
                ", titulli='" + titulli + '\'' +
                ", zhanerat=" + zhanerat +
                ", Aktoret=" + Aktoret +
                '}';
    }
}
