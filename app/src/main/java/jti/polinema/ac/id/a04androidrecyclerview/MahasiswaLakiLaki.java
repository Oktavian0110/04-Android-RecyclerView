package jti.polinema.ac.id.a04androidrecyclerview;

public class MahasiswaLakiLaki {

    private String name;
    private String absen;

    public MahasiswaLakiLaki(String name, String absen){
        this.name = name;
        this.absen = absen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }
}
