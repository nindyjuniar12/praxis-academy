Cara instal Gradle 
1. Download file gradle versi 6.2.1
2. Masuk kedalam terminal kemudian masuk kedalam direktory kita download file gradle dengan perintah cd Downloads
3. Membuat direktory baru dengan nama gradle dengan perintah sudo mkdir /opt/gradle - Enter - Memasukkan password - Membuka zip file gradle dengan perintah sudo unzip - /opt/gradle/gradle-6.2.1-bin.zip
4. Melihat apakah sudah ada dan sudah berhasil file gradle-6.2.1 dengan cara ls /opt/gradle/gradle-6.2.1
5. Kemudian konfigurasi environment dengan cara nano .buashrc - memasukkan export PATH=$PATH:/opt/gradle/gradle-6.2.1/bin kemudian klik ctrl+shift+O kemudian Simpan kemudian klik Ctrl+X
6. Untuk melihat versi gradle dengan cara gradle --version


