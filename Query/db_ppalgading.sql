-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2021 at 10:34 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ppalgading`
--

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `Kode_meja` varchar(6) NOT NULL,
  `No_meja` int(11) DEFAULT NULL,
  `Nama_guest` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`Kode_meja`, `No_meja`, `Nama_guest`) VALUES
('rujl9g', 1, 'asda'),
('rujl9s', 3, 'Rapli');

-- --------------------------------------------------------

--
-- Table structure for table `guest_order`
--

CREATE TABLE `guest_order` (
  `Kode_guest_order` int(11) NOT NULL,
  `Kode_Order` varchar(6) DEFAULT NULL,
  `Kode_Meja` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Kode_order` varchar(6) NOT NULL,
  `Kode_Guest_Order` int(11) DEFAULT NULL,
  `Kode_Produk_Order` int(11) DEFAULT NULL,
  `Status_order` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Kode_produk` varchar(6) NOT NULL,
  `Kategori_produk` enum('Makanan','Minuman','Jajanan','Promo') DEFAULT NULL,
  `Tipe_produk` enum('Goreng','Kuah','Pedas','Manis','Urat','Halus','Campur','Es','Hot','Soto','Jajanan') DEFAULT NULL,
  `Nama_produk` varchar(255) DEFAULT NULL,
  `Harga_produk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Kode_produk`, `Kategori_produk`, `Tipe_produk`, `Nama_produk`, `Harga_produk`) VALUES
('BB1M', 'Makanan', 'Manis', 'Bakso Bakar Hore', 14000),
('BB1P', 'Makanan', 'Pedas', 'Bakso Bakar Hore', 14000),
('BB2M', 'Makanan', 'Manis', 'Bakso Bakar Yummie', 17000),
('BB2P', 'Makanan', 'Pedas', 'Bakso Bakar Yummie', 17000),
('BK1C', 'Makanan', 'Campur', 'Bakso Hore', 12000),
('BK1H', 'Makanan', 'Halus', 'Bakso Hore', 12000),
('BK1U', 'Makanan', 'Urat', 'Bakso Hore', 12000),
('BK2C', 'Makanan', 'Campur', 'Bakso Yummie', 15000),
('BK2H', 'Makanan', 'Halus', 'Bakso Yummie', 15000),
('BK2U', 'Makanan', 'Urat', 'Bakso Yummie', 15000),
('BK3C', 'Makanan', 'Campur', 'Bakso Happy', 18000),
('BK3H', 'Makanan', 'Halus', 'Bakso Happy', 18000),
('BK3U', 'Makanan', 'Urat', 'Bakso Happy', 18000),
('BK4C', 'Makanan', 'Campur', 'Bakso Judez', 17000),
('BK4H', 'Makanan', 'Halus', 'Bakso Judez', 17000),
('BK4U', 'Makanan', 'Urat', 'Bakso Judez', 17000),
('BK5U', 'Makanan', 'Urat', 'Bakso Jumbo Tidak Pedas', 17000),
('BK5UH', 'Makanan', 'Halus', 'Bakso Jumbo Tidak Pedas', 17000),
('BK6C', 'Makanan', 'Campur', 'Bakso Jumbo Isian Tetelan', 20000),
('BK6H', 'Makanan', 'Halus', 'Bakso Jumbo Isian Tetelan', 20000),
('BK6U', 'Makanan', 'Urat', 'Bakso Jumbo Isian Tetelan', 20000),
('BK7C', 'Makanan', 'Campur', 'Bakso Bagong', 35000),
('BK7H', 'Makanan', 'Halus', 'Bakso Bagong', 35000),
('BK7U', 'Makanan', 'Urat', 'Bakso Bagong', 35000),
('ED1', 'Minuman', 'Es', 'Es Teller Durian', 14000),
('ED2', 'Minuman', 'Es', 'Es Campur Gula Jawa Durian', 14000),
('ED3', 'Minuman', 'Es', 'Es Pelangi Durian', 14000),
('ED4', 'Minuman', 'Es', 'Es Degan Durian', 14000),
('ED5', 'Minuman', 'Es', 'Es Alpukat Durian', 14000),
('ED6', 'Minuman', 'Es', 'Es Alpukat Degan Durian', 14000),
('ED7', 'Minuman', 'Es', 'Es Cincau Hitam Durian', 14000),
('EJ1', 'Minuman', 'Es', 'Juice Melon', 8000),
('EJ2', 'Minuman', 'Es', 'Juice Mangga', 8000),
('EJ3', 'Minuman', 'Es', 'Juice Alpukat', 10000),
('EJ4', 'Minuman', 'Es', 'Juice Semangka', 18000),
('EJ5', 'Minuman', 'Es', 'Juice Jambu Merah', 8000),
('EJ6', 'Minuman', 'Es', 'Juice Sirsat', 8000),
('EJ7', 'Minuman', 'Es', 'Juice Durian', 10000),
('EJ8', 'Minuman', 'Es', 'Juice Jeruk', 8000),
('EO1', 'Minuman', 'Es', 'Es Teler Palgading', 10000),
('EO10', 'Minuman', 'Es', 'Es Milkshake Oreo', 10000),
('EO11E', 'Minuman', 'Es', 'Es/Hot Milo', 6000),
('EO11H', 'Minuman', 'Hot', 'Es/Hot Milo', 6000),
('EO12E', 'Minuman', 'Es', 'Es/Hot Capucino', 6000),
('EO12H', 'Minuman', 'Hot', 'Es/Hot Capucino', 6000),
('EO13E', 'Minuman', 'Es', 'Es/Hot Chocolate', 6000),
('EO13H', 'Minuman', 'Hot', 'Es/Hot Chocolate', 6000),
('EO14E', 'Minuman', 'Es', 'Es/Hot Teh', 4000),
('EO14H', 'Minuman', 'Hot', 'Es/Hot Teh', 4000),
('EO15E', 'Minuman', 'Es', 'Es/Hot Jeruk', 5000),
('EO15H', 'Minuman', 'Hot', 'Es/Hot Jeruk', 5000),
('EO16', 'Minuman', 'Es', 'Es Sirup', 5000),
('EO17', 'Minuman', 'Es', 'Es Saparela', 12000),
('EO18', 'Minuman', 'Es', 'Es Soda Gembira', 12000),
('EO19', 'Minuman', 'Es', 'Kopi Hitam', 5000),
('EO2', 'Minuman', 'Es', 'Es Campur Gula Jawa', 10000),
('EO3', 'Minuman', 'Es', 'Es Pelangi', 10000),
('EO4', 'Minuman', 'Es', 'Es Manado', 10000),
('EO5', 'Minuman', 'Es', 'Es Cendol Pelangi', 10000),
('EO6', 'Minuman', 'Es', 'Es Cincau Hitam', 8000),
('EO7', 'Minuman', 'Es', 'Es Capcin(Capucino Cincau)', 8000),
('EO8', 'Minuman', 'Es', 'Es Micin(Milo Cincau)', 8000),
('EO9', 'Minuman', 'Es', 'Es Milkshake Oreo', 10000),
('JJ1', 'Jajanan', 'Jajanan', 'French Fries(Kentang Goreng)', 10000),
('JJ2', 'Jajanan', 'Jajanan', 'Tela-Telo', 10000),
('JJ3', 'Jajanan', 'Jajanan', 'Batagor', 10000),
('MA1G', 'Makanan', 'Goreng', 'Mie Ayam Original', 10000),
('MA1K', 'Makanan', 'Kuah', 'Mie Ayam Original', 10000),
('MA2G', 'Makanan', 'Goreng', 'Mie Ayam Jumbo', 16000),
('MA2K', 'Makanan', 'Kuah', 'Mie Ayam Jumbo', 16000),
('MA3G', 'Makanan', 'Goreng', 'Mie Ayam Super Jumbo Komplit', 16000),
('MA3K', 'Makanan', 'Kuah', 'Mie Ayam Super Jumbo Komplit', 16000),
('ST1', 'Makanan', 'Soto', 'Nasi Soto Daging Sapi', 10000),
('ST2', 'Makanan', 'Soto', 'Soto Daging Sapi(Tanpa Nasi)', 10000),
('ST3', 'Makanan', 'Soto', 'Nasi Soto Ayam', 10000),
('ST4', 'Makanan', 'Soto', 'Soto Ayam(Tanpa Nasi)', 8000);

-- --------------------------------------------------------

--
-- Table structure for table `product_order`
--

CREATE TABLE `product_order` (
  `Kode_produk_order` int(11) NOT NULL,
  `Kode_Produk` varchar(6) DEFAULT NULL,
  `Kode_Order` varchar(6) DEFAULT NULL,
  `Jumlah_Produk_PO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `product_stock`
--

CREATE TABLE `product_stock` (
  `Kode_stok` int(11) NOT NULL,
  `Kode_Produk` varchar(6) DEFAULT NULL,
  `Stok_makanan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `topping`
--

CREATE TABLE `topping` (
  `Kode_topping` varchar(30) NOT NULL,
  `Nama_topping` varchar(255) DEFAULT NULL,
  `Tipe_topping` enum('Mie Ayam','Bakso','Bakso Bakar','Soto') DEFAULT NULL,
  `Harga_topping` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `topping_order`
--

CREATE TABLE `topping_order` (
  `Kode_topping_order` int(11) NOT NULL,
  `Kode_Produk_Order` int(11) DEFAULT NULL,
  `Kode_Topping` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`Kode_meja`);

--
-- Indexes for table `guest_order`
--
ALTER TABLE `guest_order`
  ADD PRIMARY KEY (`Kode_guest_order`),
  ADD KEY `Kode_Order` (`Kode_Order`),
  ADD KEY `Kode_Meja` (`Kode_Meja`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Kode_order`),
  ADD KEY `Kode_Guest_Order` (`Kode_Guest_Order`),
  ADD KEY `Kode_Produk_Order` (`Kode_Produk_Order`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Kode_produk`);

--
-- Indexes for table `product_order`
--
ALTER TABLE `product_order`
  ADD PRIMARY KEY (`Kode_produk_order`),
  ADD KEY `Kode_Produk` (`Kode_Produk`),
  ADD KEY `Kode_Order` (`Kode_Order`);

--
-- Indexes for table `product_stock`
--
ALTER TABLE `product_stock`
  ADD PRIMARY KEY (`Kode_stok`),
  ADD KEY `Kode_Produk` (`Kode_Produk`);

--
-- Indexes for table `topping`
--
ALTER TABLE `topping`
  ADD PRIMARY KEY (`Kode_topping`);

--
-- Indexes for table `topping_order`
--
ALTER TABLE `topping_order`
  ADD PRIMARY KEY (`Kode_topping_order`),
  ADD KEY `Kode_Produk_Order` (`Kode_Produk_Order`),
  ADD KEY `Kode_Topping` (`Kode_Topping`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `guest_order`
--
ALTER TABLE `guest_order`
  MODIFY `Kode_guest_order` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product_order`
--
ALTER TABLE `product_order`
  MODIFY `Kode_produk_order` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product_stock`
--
ALTER TABLE `product_stock`
  MODIFY `Kode_stok` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `topping_order`
--
ALTER TABLE `topping_order`
  MODIFY `Kode_topping_order` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `guest_order`
--
ALTER TABLE `guest_order`
  ADD CONSTRAINT `guest_order_ibfk_1` FOREIGN KEY (`Kode_Order`) REFERENCES `orders` (`Kode_order`),
  ADD CONSTRAINT `guest_order_ibfk_2` FOREIGN KEY (`Kode_Meja`) REFERENCES `guest` (`Kode_meja`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`Kode_Guest_Order`) REFERENCES `guest_order` (`Kode_guest_order`),
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`Kode_Produk_Order`) REFERENCES `product_order` (`Kode_produk_order`);

--
-- Constraints for table `product_order`
--
ALTER TABLE `product_order`
  ADD CONSTRAINT `product_order_ibfk_1` FOREIGN KEY (`Kode_Produk`) REFERENCES `product` (`Kode_produk`),
  ADD CONSTRAINT `product_order_ibfk_2` FOREIGN KEY (`Kode_Order`) REFERENCES `orders` (`Kode_order`);

--
-- Constraints for table `product_stock`
--
ALTER TABLE `product_stock`
  ADD CONSTRAINT `product_stock_ibfk_1` FOREIGN KEY (`Kode_Produk`) REFERENCES `product` (`Kode_produk`);

--
-- Constraints for table `topping_order`
--
ALTER TABLE `topping_order`
  ADD CONSTRAINT `topping_order_ibfk_1` FOREIGN KEY (`Kode_Produk_Order`) REFERENCES `product_order` (`Kode_produk_order`),
  ADD CONSTRAINT `topping_order_ibfk_2` FOREIGN KEY (`Kode_Topping`) REFERENCES `topping` (`Kode_topping`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
