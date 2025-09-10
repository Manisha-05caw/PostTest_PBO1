# PostTest_PBO1

# Program Manajemen Penitipan Hewan Peliharaan

=> Package digunakan untuk menyimpan program kode dari class class yang di buat

<img width="637" height="141" alt="Screenshot 2025-09-10 093518" src="https://github.com/user-attachments/assets/387f8996-0969-4f6c-aa1d-c0a5b058c0ae" />

=> ArrayList digunakan untuk menyimpan kumpulan data (objek) dengan fleksibilitas lebih dibanding array biasa.

=> Scanner digunakan untuk membaca input dari berbagai sumber, biasanya dari keyboard (System.in).

<img width="637" height="141" alt="Screenshot 2025-09-10 093518" src="https://github.com/user-attachments/assets/effa0c89-c8df-4b78-921f-ae07d1430359" />

=> Penitipan_Hewan merupakan kelas utama dalam program ini. Semua kode program tentang penitipan hewan akan ditempatkan di dalam class ini.

=> Class Hewan ini digunakan untuk menyimpan data tentang hewan (atribut dan konstruktor).

=> static artinya class ini bisa dipanggil tanpa perlu membuat objek dari Penitipan_Hewan.
=> Atribut/variabel dari class Hewan.

nama → menyimpan nama hewan.

jenis → menyimpan jenis hewan (contoh: kucing, anjing, burung).

umur → menyimpan umur hewan dalam bentuk angka (integer).

=> Konstruktor adalah method khusus yang otomatis dijalankan ketika membuat objek baru.

this.nama = nama; → mengisi atribut nama dengan nilai parameter nama.

this.jenis = jenis; → mengisi atribut jenis dengan nilai parameter jenis.

this.umur = umur; → mengisi atribut umur dengan nilai parameter umur.

<img width="1168" height="610" alt="Screenshot 2025-09-10 093929" src="https://github.com/user-attachments/assets/9253084d-8a2d-40dc-b444-51f12274aa08" />


=> @Override

Memberi tahu compiler bahwa kita menimpa (override) method bawaan dari class Object.
Semua class di Java otomatis turunan dari Object, dan Object punya method toString().
Dengan override, kita bisa menampilkan format sesuai keinginan.

=> public String toString()

Method ini akan dipanggil otomatis kalau objek dicetak dengan System.out.println().
Jadi kita tidak perlu memanggil secara manual.




