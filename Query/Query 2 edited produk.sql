
CREATE TABLE Guest (
	Kode_meja VARCHAR(6) PRIMARY KEY,
	No_meja INT,
	Nama_guest VARCHAR(255)
);

--> Change Kategori produk to Enum ( Makanan, Minuman) 
--> Change Tipe produk to Enum (Goreng, Kuah, Pedas, Manis, Urat, Halus, Campur)



CREATE TABLE Product (
	Kode_produk VARCHAR(6) PRIMARY KEY,
	Kategori_produk VARCHAR(30),
	Tipe_produk VARCHAR(30),
	Nama_produk VARCHAR(255),
	Harga_produk INT

);



--> Change IDENTITY (1,1) to AUTO_INCREMENT
CREATE TABLE Product_Stock (
	Kode_stok INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Kode_Produk VARCHAR(6) FOREIGN KEY (Kode_Produk) REFERENCES Product(Kode_produk),
	Stok_makanan INT
);

--> Change Tipe Topping to Enum ( Mie Ayam, Bakso, Bakso Bakar, Soto) 

CREATE TABLE Topping (
	Kode_topping INT IDENTITY(1,1) PRIMARY KEY,
		CharKode_topping AS 'TOP' + RIGHT('000' + CAST(Kode_topping AS VARCHAR(3)),3)PERSISTED,
	Nama_topping VARCHAR(255),
	Tipe_topping VARCHAR(15),
	Harga_topping INT
);
INSERT INTO Topping (Nama_topping, Tipe_topping, Harga_topping) VALUES ('Tetelan Sapi', 'Soto', 3000);
SELECT * FROM Topping;

CREATE TABLE Orders (
	Kode_order VARCHAR(6) PRIMARY KEY,
);



ALTER TABLE Orders
	ADD Kode_Guest_Order INT FOREIGN KEY (Kode_Guest_Order) REFERENCES Guest_Order(Kode_guest_order);
ALTER TABLE Orders
	ADD Kode_Produk_Order INT FOREIGN KEY (Kode_Produk_Order) REFERENCES Product_Order(Kode_produk_order);
ALTER TABLE Orders
	ADD Status_order VARCHAR(50);


--> Change IDENTITY (1,1) to AUTO_INCREMENT
CREATE TABLE Guest_Order (
	Kode_guest_order INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Kode_Order VARCHAR(6) FOREIGN KEY (Kode_Order) REFERENCES Orders(Kode_order),
	Kode_Meja VARCHAR(6) FOREIGN KEY (Kode_Meja) REFERENCES Guest(Kode_meja),
);



--> Change IDENTITY (1,1) to AUTO_INCREMENT
CREATE TABLE Product_Order (
	Kode_produk_order INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Kode_Produk VARCHAR(6) FOREIGN KEY (Kode_Produk) REFERENCES Product(Kode_produk),
	Kode_Order VARCHAR(6) FOREIGN KEY (Kode_Order) REFERENCES Orders(Kode_order),
	Jumlah_Produk_PO INT
);

CREATE TABLE Topping_Order (
	Kode_topping_order INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Kode_Produk_Order INT FOREIGN KEY (Kode_Produk_Order) REFERENCES Product_Order(Kode_produk_order),
	Kode_Topping INT FOREIGN KEY (Kode_Topping) REFERENCES Topping(Kode_topping)
)