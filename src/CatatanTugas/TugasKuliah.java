/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CatatanTugas;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class TugasKuliah implements Serializable{
    private static final long serialVersionUID = 1L;
    private String mataKuliah;
    private String deadline;
    private String deskripsi;

    public TugasKuliah(String mataKuliah, String deadline, String deskripsi) {
        this.mataKuliah = mataKuliah;
        this.deadline = deadline;
        this.deskripsi = deskripsi;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    @Override
    public String toString() {
        return "📘 Mata Kuliah: " + mataKuliah + "\n🕒 Deadline: " + deadline + "\n📄 Deskripsi: " + deskripsi + "\n";
    }
}
