public class mainApp {
    public static void main(String[] args) {
data_pegawai data_pegawai=new data_pegawai("Yusroaini", "02 Desember 1999", "Salbi", "12000000");
data_pegawai.cetakdata_pegawai(data_pegawai.Nama);

gaji_pegawai gaji_pegawai = new gaji_pegawai(9000000, 1500000, 1500000);
gaji_pegawai.cetakgaji_pegawai(gaji_pegawai.gajiLembur);

status_pendiikan status_pendiikan = new status_pendiikan("Sarjana Komputer", "Magister Komputer");
status_pendiikan.cetakstatus_pendiikan(status_pendiikan.S2);

jabatan jabatan = new jabatan("Programmer", "Staff");
jabatan.cetakjabatan(jabatan.staff);

    }
}
