/**
 *
 * @author aji sudarmawan
 * file name : TestInterface.java
 */


interface DataMahasiswa{
    public void setNamaMahasiswa(String namaMahasiswa);
    public void setJurusan(String jurusan);
    public void setFakultas(String fakultas);
    public void setKampus(String kampus);
    public String getNamaMahasiswa();
    public String getJurusan();
    public String getFakultas();
    public String getKampus();
}

class isiData implements DataMahasiswa{
    
    private String namaMahasiswa;
    private String jurusan;
    private String fakultas;
    private String kampus;

    @Override
    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    @Override
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void setKampus(String kampus) {
        this.kampus = kampus;
    }

    @Override
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    @Override
    public String getJurusan() {
        return jurusan;
    }

    @Override
    public String getFakultas() {
        return fakultas;
    }

    @Override
    public String getKampus() {
        return kampus;
    }
}
public class TesInterface {
    public static void main(String[] args){
        isiData data = new isiData();
        data.setNamaMahasiswa("Aji Sudarmawan");
        data.setJurusan("Ilmu Komputer");
        data.setFakultas("MIPA");
        data.setKampus("Universitas Pakuan");
        System.out.println("Data Mahasiswa nama "+data.getNamaMahasiswa()+" Jurusan "+data.getJurusan()+" fakultas "+data.getFakultas()+" kampus "+data.getKampus() );
    }
}
