# Kalkulator Pabrik Cetakan Donat

Proyek ini adalah sebuah aplikasi konsol Java sederhana yang berfungsi sebagai kalkulator untuk pabrik cetakan donat rumahan. Kalkulator ini dapat menghitung berbagai parameter produksi untuk cetakan donat yang terbuat dari bahan stainless steel 304 dengan ketebalan 0,5 cm.

## Fitur Utama

Kalkulator ini mampu melakukan perhitungan untuk dua tipe model cetakan donat:
1.  **Donat dengan lubang (Torus)**
2.  **Donat tanpa lubang (Sphere)**

Untuk setiap model, kalkulator dapat menghitung:
* **Volume Material**: Volume bahan stainless steel yang dibutuhkan untuk membuat cetakan (dalam cm³).
* **Luas Permukaan Cetakan**: Luas permukaan luar cetakan (dalam cm²).
* **Massa Cetakan**: Massa cetakan dalam gram (gr).
* **Massa Cetakan dalam Kilogram**: Konversi massa cetakan ke kilogram (kg).
* **Biaya Kirim**: Estimasi biaya pengiriman berdasarkan massa cetakan dalam kilogram.

## Detail Implementasi Konstanta
* **Bahan Cetakan**: Stainless Steel 304
* **Ketebalan Bahan Cetakan**: `0.5 cm`
* **Densitas Bahan (Stainless Steel 304)**: `8 g/cm³`
* **Harga Patokan Biaya Kirim**: `Rp 2000 per kg`
* **Rumus Volume Material Cetakan**: Dihitung sebagai `Luas Permukaan * Ketebalan`
* **Nilai PI (π)**: `22/7`

## Struktur Proyek

Proyek ini diorganisir ke dalam beberapa package sesuai dengan fungsinya:
