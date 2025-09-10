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

<img width="1817" height="179" alt="image" src="https://github.com/user-attachments/assets/900ab542-dd83-4d83-8841-a171c27b04e8" />

=> Program dimulai dari method main, yaitu sistem menyiapkan sebuah scanner untuk membaca input dari pengguna dan sebuah ArrayList untuk menyimpan daftar hewan yang dititipkan.

=> Selanjutnya program masuk ke dalam sebuah perulangan while yang berfungsi menampilkan menu utama berulang kali. Menu tersebut berisi beberapa pilihan, yaitu menambahkan hewan baru, melihat daftar hewan, mengubah data hewan, menghapus hewan, serta keluar dari program. Setelah menu ditampilkan, pengguna diminta memilih salah satu opsi dengan memasukkan angka. ka pengguna memilih opsi pertama, program akan meminta data hewan berupa nama, jenis, dan umur, kemudian membuat objek baru dari class Hewan dan menambahkannya ke dalam daftar. Jika pengguna memilih opsi kedua, program akan menampilkan seluruh data hewan yang ada di dalam ArrayList.

=>Jika pengguna memilih opsi ketiga, program akan menampilkan daftar hewan, meminta pengguna memilih hewan mana yang ingin diubah, lalu memperbarui data tersebut dengan input baru yang dimasukkan. Jika memilih opsi keempat, program akan menampilkan daftar hewan, lalu pengguna bisa memilih salah satu hewan untuk dihapus dari daftar. Sedangkan jika pengguna memilih opsi kelima, maka nilai variabel jalan akan diubah menjadi false sehingga perulangan berhenti dan program berakhir.


<img width="1705" height="755" alt="Screenshot 2025-09-10 191633" src="https://github.com/user-attachments/assets/b2b82132-9f21-4a66-8872-6dd6a6c0818b" />

=> Pada program ini akan meminta input nama, jenis, dan umur dari hewan. Data tersebut digunakan untuk membuat objek baru dari kelas hewan. Kemudian objeknya akan dimasuukan kedalam arraylist daftarhewan.

<img width="1417" height="619" alt="36e298e3-f016-4da0-9e8c-a079f3b82467" src="https://github.com/user-attachments/assets/09413cf3-77b3-45aa-b01d-f24a80b826ca" />

Output:

<img width="553" height="1202" alt="image" src="https://github.com/user-attachments/assets/5233a0df-6416-486b-b2a6-dc1e1d25a431" />

=? Jika memilih angka dua, program akan menampilkan seluruh daftar hewan yang ada. Apabila daftar kosong, program akan menampilkan pesan bahwa belum ada data. ika ada data, program akan melakukan perulangan (for loop) dan mencetak setiap hewan dengan nomor urut.

<img width="1535" height="407" alt="b9fc6a7e-2405-4940-ac6a-804b15e2a808" src="https://github.com/user-attachments/assets/ec0da9d1-a478-40c5-9cf6-94faeb39fda3" />

Output:

<img width="773" height="422" alt="image" src="https://github.com/user-attachments/assets/53d2c5cb-f2b6-44ee-ab1b-e39a2e7f8838" />


=> Jika pengguna memilih angka tiga, maka program akan meminta nomor urut hewan yang ingin diubah. Setelah itu pengguna dapat memasukkan data baru untuk mengganti nama, jenis, dan umur hewan yang dipilih. Data lama diganti dengan data baru langsung pada objek Hewan di ArrayList. Jika nomor tidak valid, ditampilkan pesan error.

<img width="1518" height="798" alt="19d6c2bc-3fa2-4415-ad06-b0cd873f8632" src="https://github.com/user-attachments/assets/8566301d-ea25-482c-972a-b048e1618c3b" />

Output:

<img width="598" height="415" alt="image" src="https://github.com/user-attachments/assets/5e19e96b-712b-4d92-b0cf-0ad90ddcd9c9" />


=> Jika memilih angka empat, pengguna dapat menghapus data hewan dari daftar dengan memasukkan nomor urut yang sesuai. Jika nomor valid, objek hewan dihapus dari ArrayList. Jika nomor tidak valid, program menampilkan pesan error.

Output:

<img width="606" height="318" alt="image" src="https://github.com/user-attachments/assets/78adacc0-77fd-419c-91ba-7e3791ca7037" />


=> Apabila pengguna memilih angka lima, program akan menghentikan perulangan, menampilkan pesan perpisahan, dan kemudian keluar. Namun jika pengguna memasukkan angka selain lima pilihan yang tersedia, maka program akan menampilkan pesan bahwa pilihan tidak valid.

<img width="1885" height="924" alt="428645b4-0f70-4dbd-a93b-3b5fa40598be" src="https://github.com/user-attachments/assets/5ac15ee2-3812-482e-a1c2-44930b2c5ee4" />

Output:

<img width="1058" height="479" alt="image" src="https://github.com/user-attachments/assets/db01b004-9e58-415c-830e-c4e7de8b2276" />





