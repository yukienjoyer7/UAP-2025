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

## Struktur Proyek

Proyek ini diorganisir ke dalam beberapa package sesuai dengan fungsinya:

```text
uap/
├── bases/
│   └── Shape.java                  # Kelas abstrak untuk bentuk dasar
├── interfaces/
│   ├── MassCalculatable.java       # Interface untuk objek yang massanya dapat dihitung
│   ├── MassConverter.java          # Interface untuk konversi satuan massa
│   ├── PiRequired.java             # Interface yang menyediakan konstanta PI
│   ├── ShippingCostCalculator.java # Interface untuk kalkulasi biaya kirim
│   └── ThreeDimensional.java       # Interface untuk objek tiga dimensi (volume & luas permukaan)
├── mains/
│   └── KalkulatorPabrik.java       # Kelas utama (Main class) untuk menjalankan aplikasi
└── models/
    ├── Sphere.java                 # Model untuk cetakan berbentuk bola (donat tanpa lubang)
    └── Torus.java                  # Model untuk cetakan berbentuk torus (donat dengan lubang)

