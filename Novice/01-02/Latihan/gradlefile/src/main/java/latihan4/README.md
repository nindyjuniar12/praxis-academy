Cara instal Gradle 
1. Download file gradle versi 6.2.1.
2. Masuk kedalam terminal kemudian masuk kedalam direktory kita download file gradle dengan perintah cd Downloads.
3. Membuat direktory baru dengan nama gradle dengan perintah sudo mkdir /opt/gradle - Enter - Memasukkan password - Membuka zip file gradle dengan perintah sudo unzip - /opt/gradle/gradle-6.2.1-bin.zip.
4. Melihat apakah sudah ada dan sudah berhasil file gradle-6.2.1 dengan cara ls /opt/gradle/gradle-6.2.1.
5. Kemudian konfigurasi environment dengan cara nano .buashrc - memasukkan export PATH=$PATH:/opt/gradle/gradle-6.2.1/bin kemudian klik ctrl+shift+O kemudian Simpan kemudian klik Ctrl+X.
6. Untuk melihat versi gradle dengan cara gradle --version.


Cara untuk menjalangakn gradle
1. Open terminal, membuat direktory yang akan digunakan untuk meletakkan gradle dengan perintah mkdir latihan.
2. Buka direktory yang kita buat tadi dengan perintah cd latihan.
3. Untuk membuat gradle baru yaitu dengan perintah gradle init.
4. Kemudian kita diminta untuk memilih perintah yang muncul setelah gradle inii.
	$ gradle init
	> Task :wrapper

	Select type of project to generate:
	  1: basic
	  2: application
	  3: library
	  4: Gradle plugin
	Enter selection (default: basic) [1..4] 2

	Select implementation language:
	  1: C++
	  2: Groovy
	  3: Java
	  4: Kotlin
	  5: Swift
	Enter selection (default: Java) [1..5] 3

	Select build script DSL:
	  1: Groovy
	  2: Kotlin
	Enter selection (default: Groovy) [1..2] 1

	Select test framework:
	  1: JUnit 4
	  2: TestNG
	  3: Spock
	  4: JUnit Jupiter
	Enter selection (default: JUnit 4) [1..4]

	Project name (default: latihan): latihan -> berarti kita membuat project dengan nama latihan

	Source package (default: latihan): laithan -> berarti kita membuat sebuah folder dengan nama latihan

	> Task :init
	Get more help with your project: https://docs.gradle.org/5.4.1/userguide/tutorial_java_projects.html

	BUILD SUCCESSFUL
	2 actionable tasks: 2 executed - > berarti kita berhasil membuat sebuah gradle

5. Unutk menjalankan gradle dengan perintah gradle run sebelum itu kita diperintahkan untuk mem-build dulu dengan perintah gradle build.
6. Didalam gradle terdapat AppTest.java yang berisi package yang digunakan untuk menghubungkan atau mensinkronkan setiap file baru yang akan kita buat.
	/*
	 * This Java source file was generated by the Gradle 'init' task.
	 */
	package latihan; -> berarti kita membuat sebuah program didalam folder laithan.

	public class App {
	    public String getGreeting() {
		return "Hello world.";
	    }

	    public static void main(String[] args) {
		System.out.println(new App().getGreeting());
	    }
	}


