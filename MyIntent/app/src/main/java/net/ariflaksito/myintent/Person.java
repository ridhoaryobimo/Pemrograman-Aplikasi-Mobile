package net.ariflaksito.myintent;

/**
 * Created by presentasi on 02/10/2018.
 */

public class Person {

    private int idPerson;
    private String nama;
    private String alamat;
    private String email;
    private int jenisKelamin; // 1 = Pria, 0 = Wanita
    private long nomorHp;
    private long nomorWa;
    private boolean isDosen;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(int jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public long getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(long nomorHp) {
        this.nomorHp = nomorHp;
    }

    public long getNomorWa() {
        return nomorWa;
    }

    public void setNomorWa(long nomorWa) {
        this.nomorWa = nomorWa;
    }

    public boolean isDosen() {
        return isDosen;
    }

    public void setDosen(boolean dosen) {
        isDosen = dosen;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
}
