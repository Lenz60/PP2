-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2022 at 05:12 PM
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
('08zofp', 6, 'rapl'),
('0d2i2a', 10, 'asuuu'),
('0u0pl5', 13, 'tes'),
('3ri0vu', 5, 'Doble meja'),
('4mz028', 9, 'Truejeh'),
('4xeo4r', 5, 'Tes doble meja'),
('59bimd', 7, 'Andri'),
('5sfr8g', 12, 'Android Ordereee'),
('6xatqc', 10, 'Rafly'),
('7nkclb', 1, 'Android 4'),
('7uz5go', 1, 'order tes'),
('87p045', 10, 'stasusus'),
('88lcup', 13, 'statsusus'),
('91fjup', 1, 'Greyy'),
('9h1crp', 10, 'Statu'),
('9iohm7', 9, 'ggg'),
('9isi6j', 9, 'Diuble'),
('9n6udr', 4, 'Testy tsatus'),
('9p3jga', 9, 'Statsu'),
('9vgv6r', 7, 'Rapli'),
('a5gqvg', 2, 'Andrian'),
('a5gsgd', 2, 'Andrian'),
('a7z8l1', 10, 'Set'),
('a8g2ng', 9, 'Andrian'),
('a8gsnz', 2, 'Andrian'),
('ac8295', 1, 'Android Test 5'),
('acxgk6', 4, 'tes'),
('ascqef', 2, 'Rapli1'),
('av4kg5', 7, 'Android Test Order'),
('c7wv7a', 1, 'order tes 2'),
('cbj27i', 1, 'Android'),
('cjctyj', 1, 'aa'),
('cjndpk', 10, 'Order tes'),
('cqrz6v', 7, 'stat'),
('cv4zew', 1, 'Android Order test 898'),
('df1coi', 1, 'order tes 999'),
('dihgk8', 6, 'andri'),
('ezq9mp', 7, 'koskks'),
('fcfcy9', 1, 'order tes'),
('fi0v88', 10, 'Status'),
('fl4v0y', 1, 'Status'),
('fqw7d2', 10, 'Hhhh'),
('g945m1', 10, 'Status'),
('gbosa0', 4, 'test stattys'),
('gmltqd', 13, 'status3'),
('ing23p', 1, 'Android Test3 '),
('j55a67', 1, 'atqg'),
('jad8ai', 7, 'Greyyy'),
('jg1d34', 3, 'tes'),
('jg45b6', 1, 'tes'),
('jsourl', 10, 'Staussusus'),
('jtfo1g', 10, 'R'),
('k2u5lm', 7, 'Twstun'),
('m39mhj', 4, 'testtttt'),
('mefqb7', 1, 'Android 2'),
('mv92b9', 12, 'wtatus'),
('mxcspi', 10, 'tessshsha'),
('n4vm6z', 10, 'Tes Tsatus'),
('n76w9g', 9, 'Test Meja 9'),
('na306p', 13, 'Asd'),
('nozqvq', 10, 'statuses'),
('o4twwy', 7, 'leri'),
('omwydq', 11, 'rapli'),
('ougb22', 11, 'Stasusu'),
('ovml1e', 9, 'rapli'),
('pmcxky', 5, 'Android test 2'),
('qden1l', 13, 'tsyinf'),
('qi5x7j', 7, 'Faslsk'),
('qrng8h', 10, 'status'),
('r20qi0', 11, 'tlj'),
('r404mk', 7, 'tried'),
('rujl9g', 1, 'asda'),
('rujl9s', 3, 'Rapli'),
('ryfvzb', 7, 'Androia'),
('s31c32', 2, 'tes'),
('s31c62', 2, 'tes'),
('s31cf3', 2, 'Andrian'),
('s4qfv9', 9, 'Tes'),
('siief0', 11, 'Stayus'),
('sj81ma', 9, 'Rafly Andrian'),
('t4q6od', 4, 'Try'),
('t5dk8a', 11, 'Statuuuss'),
('tnfnp9', 9, 'Andri'),
('uamrz3', 2, 'statusss'),
('ucivmi', 6, 'Tes Doble meja'),
('un9b05', 7, 'Andriaan'),
('vkxy3e', 4, 'Tes'),
('vq3cuh', 7, 'qq'),
('vxrht9', 4, 'bshhshs'),
('xd2857', 8, 'Android Order Test'),
('xis0i7', 7, 'Tesu'),
('xph16c', 4, 'aadfg'),
('xr6x71', 7, 'ateshsh'),
('xzgdaw', 6, 'Raplki'),
('youair', 10, 'Andridan'),
('yytntd', 13, 'statusb2');

-- --------------------------------------------------------

--
-- Table structure for table `guest_order`
--

CREATE TABLE `guest_order` (
  `Kode_guest_order` int(11) NOT NULL,
  `Kode_Order` varchar(6) DEFAULT NULL,
  `Kode_Meja` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guest_order`
--

INSERT INTO `guest_order` (`Kode_guest_order`, `Kode_Order`, `Kode_Meja`) VALUES
(56, '1s34f4', 'ascqef'),
(57, 'ssdb5a', 'a8g2ng'),
(59, 'ss3b5r', 'a5gsgd'),
(64, '34fg34', 's31c32'),
(65, '3t3c45', 's31c62'),
(66, 'k6yk6g', 'jg45b6'),
(67, 'k24zd4', 'jg1d34'),
(68, '4fcbdf', '0u0pl5'),
(69, '1n4ab2', 'av4kg5'),
(70, '1n4ab2', 'av4kg5'),
(71, 'u6tvri', 'fcfcy9'),
(72, 'b3nfmo', 'fcfcy9'),
(73, 'b3nfmo', 'fcfcy9'),
(74, 'b3nfmo', 'fcfcy9'),
(75, 'b3nfmo', 'fcfcy9'),
(76, 'b3nfmo', 'fcfcy9'),
(77, 'b3nfmo', 'fcfcy9'),
(78, 'b3nfmo', 'fcfcy9'),
(79, 'agpdvr', 'fcfcy9'),
(80, '23glra', 'c7wv7a'),
(81, '23glra', 'c7wv7a'),
(82, '86b9oi', 'c7wv7a'),
(83, '9rvjle', 'c7wv7a'),
(84, '9rvjle', 'c7wv7a'),
(85, '9rvjle', 'c7wv7a'),
(86, '1z6t5b', 'cjndpk'),
(87, '1z6t5b', 'cjndpk'),
(88, 'tcslfu', '5sfr8g'),
(89, 'ifg12n', '5sfr8g'),
(90, '3tkse4', '5sfr8g'),
(91, '52xxw7', 'xd2857'),
(92, 'pymbp1', 'xd2857'),
(93, 'pymbp1', 'xd2857'),
(94, 'ktayrj', '4xeo4r'),
(95, '0q3bxy', '4xeo4r'),
(96, '2nduqw', 'ucivmi'),
(97, '4eqq22', 'n76w9g'),
(98, 'yelxwp', 'n76w9g'),
(99, '2kkkg3', 'n76w9g'),
(100, 'ow5f14', 'ovml1e'),
(101, 'gmoxw1', '08zofp'),
(102, '89yuhf', '08zofp'),
(103, 'krbdu5', '08zofp'),
(104, 'lnwlgn', 'dihgk8'),
(105, 'r10cw6', 'vq3cuh'),
(106, '2rmgcm', 'cjctyj'),
(107, 'p8rr6p', 'xph16c'),
(108, 't72th3', 'j55a67'),
(109, 'c5plbc', 'r20qi0'),
(110, 't30kyf', '0d2i2a'),
(111, 'jcf12s', 'acxgk6'),
(112, 'n8acxt', 'ezq9mp'),
(113, 'h1e5oz', 's4qfv9'),
(114, '8lhrkg', 'o4twwy'),
(115, 'z85tid', 'mxcspi'),
(116, 'i3mjcy', 'fqw7d2'),
(117, 'vryeso', 'k2u5lm'),
(118, 'rq5q22', 'k2u5lm'),
(119, 'mkwmj7', 'vxrht9'),
(120, 'asvdop', 'm39mhj'),
(121, '62bqxn', '9n6udr'),
(122, 'bplsmf', 'jtfo1g'),
(123, 'xntsl5', 'xis0i7'),
(124, 'v94fad', 'qrng8h'),
(125, 'l76exd', 'yytntd'),
(126, '04b0h2', 'cqrz6v'),
(127, 'rea0uh', 'gmltqd'),
(128, '5s9dfp', 'mv92b9'),
(129, 'mee924', 'nozqvq'),
(130, 'nithnh', '88lcup'),
(131, '0i78j8', 'ougb22'),
(132, 'txvknp', 'ougb22'),
(133, 'a9dib0', 'ougb22'),
(134, '6yg4pt', 'ougb22'),
(135, 'p0q76m', 'ougb22'),
(136, 'fnpsuo', 'n4vm6z'),
(137, 'fyyxth', 'n4vm6z'),
(138, '9l3ayi', '9p3jga'),
(139, 'pma8wy', 'gbosa0'),
(140, 'h0k6eq', 'fl4v0y'),
(141, '9awt93', 'siief0'),
(142, '1rjzn8', 'g945m1'),
(143, 'nnd086', 'fi0v88'),
(144, 'avyisk', 't4q6od'),
(145, 'hv07bp', 't4q6od'),
(146, '2q5h4w', 't4q6od'),
(147, 'mqxksa', 't4q6od'),
(148, 'ro1eyx', 't4q6od'),
(149, '3ofie7', 't4q6od'),
(150, '5x2azu', 't4q6od'),
(151, 'etent3', 't4q6od'),
(152, 'rl2sgs', 'jsourl'),
(153, '56njv4', 'qden1l'),
(154, 'ibjapy', '9vgv6r'),
(155, '2jilkq', '87p045'),
(156, 'zcfc61', '87p045'),
(157, '8yps05', '87p045'),
(158, 'gcca3v', '87p045'),
(159, 'o4net3', '87p045'),
(160, '1hc187', 'a7z8l1'),
(161, 'b2iavr', 'a7z8l1'),
(162, '5asxq6', 'a7z8l1'),
(163, '3xyipf', 'a7z8l1'),
(164, '5rp326', 'a7z8l1'),
(165, 'bhnfuz', 'a7z8l1'),
(166, 'tfmy1w', 'r404mk'),
(167, 'kwbmag', 'r404mk'),
(168, '8jj68q', 'vkxy3e'),
(169, '8scc3s', 'vkxy3e'),
(170, '2yqv4v', '9h1crp'),
(171, 'c6jpvx', '9h1crp'),
(172, 'uinir2', 't5dk8a'),
(173, '7qt5l0', 't5dk8a'),
(174, 'x1ul36', 't5dk8a'),
(175, '04vrms', 't5dk8a'),
(176, '6ozzxe', 'xzgdaw'),
(177, 'irlf90', 'xzgdaw'),
(178, 'mj4we7', 'xzgdaw'),
(179, 'qcbwmo', 'xzgdaw'),
(180, 'iy0tek', 'sj81ma'),
(181, '660vxw', 'sj81ma'),
(182, '7fn32d', 'youair'),
(183, '2eyka4', 'youair'),
(184, '6ctzng', 'youair'),
(185, 'z7zyrt', 'youair'),
(186, '9lxpa2', 'youair'),
(187, '46ya0c', 'youair'),
(188, 'kfj24x', 'youair'),
(189, 'yt6l0t', 'youair'),
(190, 'ce75n3', '6xatqc'),
(191, '28swbe', '6xatqc'),
(192, 'r96xjy', '6xatqc'),
(193, 'hs8apt', '91fjup'),
(194, '46jw6x', '91fjup'),
(195, '1cz23a', '9iohm7'),
(196, '7h12m3', '9iohm7'),
(197, 'th3e9d', 'un9b05'),
(198, 'c1zrfo', 'un9b05'),
(199, 'dzb1bi', 'un9b05'),
(200, 'czhl1u', 'ryfvzb'),
(201, 'd3vxxu', 'ryfvzb'),
(202, '3eziqm', '59bimd'),
(203, 'f9ajvz', '59bimd'),
(204, '3a8025', 'tnfnp9'),
(205, 'v4rup0', 'tnfnp9'),
(206, 'auhc0w', 'tnfnp9'),
(207, 'amha0q', 'jad8ai'),
(208, 'bb4322', 'jad8ai'),
(209, 'buzstu', 'jad8ai'),
(210, 'cx9cpc', 'jad8ai'),
(211, 'o33m6p', 'jad8ai'),
(212, 'x8qxya', '4mz028'),
(213, 'kpv30u', '4mz028'),
(214, '4ax4n5', '4mz028'),
(215, 'eb3dga', '4mz028'),
(216, 'v7od40', '4mz028'),
(217, 'a345sf', '4mz028'),
(218, '2w8ogp', 'xr6x71'),
(219, 'a345sf', 'xr6x71'),
(220, 'a345sf', 'xr6x71'),
(221, 'a345sf', 'xr6x71'),
(222, 'a345sf', 'xr6x71'),
(223, '1safds', 'xr6x71'),
(224, '51wdu1', 'qi5x7j'),
(225, 'p15sbd', 'qi5x7j'),
(226, 'p15sbd', 'qi5x7j'),
(227, '3bkh3q', 'qi5x7j'),
(228, '8447ry', 'qi5x7j'),
(229, '62siqq', 'qi5x7j');

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

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`Kode_order`, `Kode_Guest_Order`, `Kode_Produk_Order`, `Status_order`) VALUES
('04b0h2', 126, 109, 'Selesai'),
('04vrms', 175, 158, 'Selesai'),
('0i78j8', 131, 114, 'Selesai'),
('0q3bxy', 95, 78, 'Selesai'),
('1cz23a', 195, 178, 'Selesai'),
('1hc187', 160, 143, 'Selesai'),
('1n4ab2', 69, NULL, 'Selesai'),
('1rjzn8', 142, 125, 'Selesai'),
('1s34f4', 56, 39, 'Selesai'),
('1safds', 223, 206, 'Selesai'),
('1z6t5b', 86, 70, 'Selesai'),
('23glra', 80, 63, 'Selesai'),
('28swbe', 191, 174, 'Selesai'),
('2eyka4', 183, 166, 'Selesai'),
('2jilkq', 155, 138, 'Selesai'),
('2kkkg3', 99, 82, 'Selesai'),
('2nduqw', 96, 79, 'Selesai'),
('2q5h4w', 146, 129, 'Selesai'),
('2rmgcm', 106, 89, 'Selesai'),
('2w8ogp', 218, 201, 'Selesai'),
('2yqv4v', 170, 153, 'Selesai'),
('34fg34', 64, 47, 'Selesai'),
('3a8025', 204, 187, 'Selesai'),
('3bkh3q', 227, 210, 'Selesai'),
('3eziqm', 202, 185, 'Selesai'),
('3ofie7', 149, 132, 'Selesai'),
('3t3c45', 65, 48, 'Selesai'),
('3tkse4', 90, 73, 'Selesai'),
('3xyipf', 163, 146, 'Selesai'),
('46jw6x', 194, 177, 'Selesai'),
('46ya0c', 187, 170, 'Selesai'),
('4ax4n5', 214, 197, 'Selesai'),
('4eqq22', 97, 80, 'Selesai'),
('4fcbdf', 68, 51, 'Selesai'),
('51wdu1', 224, 207, 'Selesai'),
('52xxw7', 91, 74, 'Selesai'),
('56njv4', 153, 136, 'Selesai'),
('5asxq6', 162, 145, 'Selesai'),
('5rp326', 164, 147, 'Selesai'),
('5s9dfp', 128, 111, 'Selesai'),
('5x2azu', 150, 133, 'Selesai'),
('62bqxn', 121, 104, 'Selesai'),
('62siqq', 229, 212, 'Disiapkan'),
('660vxw', 181, 164, 'Selesai'),
('6ctzng', 184, 167, 'Selesai'),
('6ozzxe', 176, 159, 'Selesai'),
('6yg4pt', 134, 117, 'Selesai'),
('7fn32d', 182, 165, 'Selesai'),
('7h12m3', 196, 179, 'Selesai'),
('7qt5l0', 173, 156, 'Selesai'),
('8447ry', 228, 211, 'Disiapkan'),
('86b9oi', 82, 65, 'Selesai'),
('89yuhf', 102, 85, 'Selesai'),
('8jj68q', 168, 151, 'Selesai'),
('8lhrkg', 114, 97, 'Selesai'),
('8scc3s', 169, 152, 'Selesai'),
('8yps05', 157, 140, 'Selesai'),
('9awt93', 141, 124, 'Selesai'),
('9l3ayi', 138, 121, 'Selesai'),
('9lxpa2', 186, 169, 'Selesai'),
('9rvjle', 83, 68, 'Selesai'),
('a345sf', 217, 200, 'Selesai'),
('a9dib0', 133, 116, 'Selesai'),
('agpdvr', 79, NULL, 'Selesai'),
('amha0q', 207, 190, 'Selesai'),
('asvdop', 120, 103, 'Selesai'),
('auhc0w', 206, 189, 'Selesai'),
('avyisk', 144, 127, 'Selesai'),
('b2iavr', 161, 144, 'Selesai'),
('b3nfmo', 72, NULL, 'Selesai'),
('bb4322', 208, 191, 'Selesai'),
('bhnfuz', 165, 148, 'Selesai'),
('bplsmf', 122, 105, 'Selesai'),
('buzstu', 209, 192, 'Selesai'),
('c1zrfo', 198, 181, 'Selesai'),
('c5plbc', 109, 92, 'Selesai'),
('c6jpvx', 171, 154, 'Selesai'),
('ce75n3', 190, 173, 'Selesai'),
('cx9cpc', 210, 193, 'Selesai'),
('czhl1u', 200, 183, 'Selesai'),
('d3vxxu', 201, 184, 'Selesai'),
('dzb1bi', 199, 182, 'Selesai'),
('eb3dga', 215, 198, 'Selesai'),
('etent3', 151, 134, 'Selesai'),
('f9ajvz', 203, 186, 'Selesai'),
('fnpsuo', 136, 119, 'Selesai'),
('fyyxth', 137, 120, 'Selesai'),
('gcca3v', 158, 141, 'Selesai'),
('gmoxw1', 101, 84, 'Selesai'),
('h0k6eq', 140, 123, 'Selesai'),
('h1e5oz', 113, 96, 'Selesai'),
('hs8apt', 193, 176, 'Selesai'),
('hv07bp', 145, 128, 'Selesai'),
('i3mjcy', 116, 99, 'Selesai'),
('ibjapy', 154, 137, 'Selesai'),
('ifg12n', 89, 72, 'Selesai'),
('irlf90', 177, 160, 'Selesai'),
('iy0tek', 180, 163, 'Selesai'),
('jcf12s', 111, NULL, 'Selesai'),
('k24zd4', 67, 50, 'Selesai'),
('k6yk6g', 66, 49, 'Selesai'),
('kfj24x', 188, 171, 'Selesai'),
('kpv30u', 213, 196, 'Selesai'),
('krbdu5', 103, 86, 'Selesai'),
('ktayrj', 94, 77, 'Selesai'),
('kwbmag', 167, 150, 'Selesai'),
('l76exd', 125, 108, 'Selesai'),
('lnwlgn', 104, 87, 'Selesai'),
('mee924', 129, 112, 'Selesai'),
('mj4we7', 178, 161, 'Selesai'),
('mkwmj7', 119, 102, 'Selesai'),
('mqxksa', 147, 130, 'Selesai'),
('n8acxt', 112, 95, 'Selesai'),
('nithnh', 130, 113, 'Selesai'),
('nnd086', 143, 126, 'Selesai'),
('o33m6p', 211, 194, 'Selesai'),
('o4net3', 159, 142, 'Selesai'),
('ow5f14', 100, 83, 'Selesai'),
('p0q76m', 135, 118, 'Selesai'),
('p15sbd', 225, 208, 'Selesai'),
('p8rr6p', 107, 90, 'Selesai'),
('pma8wy', 139, 122, 'Selesai'),
('pymbp1', 92, 76, 'Selesai'),
('qcbwmo', 179, 162, 'Selesai'),
('r10cw6', 105, 88, 'Selesai'),
('r96xjy', 192, 175, 'Selesai'),
('rea0uh', 127, 110, 'Selesai'),
('rl2sgs', 152, 135, 'Selesai'),
('ro1eyx', 148, 131, 'Selesai'),
('rq5q22', 118, 101, 'Selesai'),
('ss3b5r', 59, 41, 'Selesai'),
('ssdb5a', 57, 40, 'Selesai'),
('t30kyf', 110, 93, 'Selesai'),
('t72th3', 108, 91, 'Selesai'),
('tcslfu', 88, 71, 'Selesai'),
('tfmy1w', 166, 149, 'Selesai'),
('th3e9d', 197, 180, 'Selesai'),
('txvknp', 132, 115, 'Selesai'),
('u6tvri', 71, NULL, 'Selesai'),
('uinir2', 172, 155, 'Selesai'),
('v4rup0', 205, 188, 'Selesai'),
('v7od40', 216, 199, 'Selesai'),
('v94fad', 124, 107, 'Selesai'),
('vryeso', 117, 100, 'Selesai'),
('x1ul36', 174, 157, 'Selesai'),
('x8qxya', 212, 195, 'Selesai'),
('xntsl5', 123, 106, 'Selesai'),
('yelxwp', 98, 81, 'Selesai'),
('yt6l0t', 189, 172, 'Selesai'),
('z7zyrt', 185, 168, 'Selesai'),
('z85tid', 115, 98, 'Selesai'),
('zcfc61', 156, 139, 'Selesai');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Kode_produk` varchar(6) NOT NULL,
  `Kategori_produk` enum('Makanan','Minuman','Jajanan','Promo') DEFAULT NULL,
  `Tipe_produk` enum('Goreng','Kuah','Pedas','Manis','Bakso','Urat','Halus','Campur','Es','Hot','Soto','Jajanan') DEFAULT NULL,
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
('BK4', 'Makanan', 'Bakso', 'Bakso Judez', 17000),
('BK4C', 'Makanan', 'Campur', 'Bakso Judez', 17000),
('BK4H', 'Makanan', 'Halus', 'Bakso Judez', 17000),
('BK4U', 'Makanan', 'Urat', 'Bakso Judez', 17000),
('BK5H', 'Makanan', 'Halus', 'Bakso Jumbo Tidak Pedas', 17000),
('BK5U', 'Makanan', 'Urat', 'Bakso Jumbo Tidak Pedas', 17000),
('BK6', 'Makanan', 'Bakso', 'Bakso Jumbo Isian Tetelan', 20000),
('BK6C', 'Makanan', 'Campur', 'Bakso Jumbo Isian Tetelan', 20000),
('BK6H', 'Makanan', 'Halus', 'Bakso Jumbo Isian Tetelan', 20000),
('BK6U', 'Makanan', 'Urat', 'Bakso Jumbo Isian Tetelan', 20000),
('BK7', 'Makanan', 'Bakso', 'Bakso Bagong', 35000),
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
('EO10E', 'Minuman', 'Es', 'Es/Hot Milo', 6000),
('EO10H', 'Minuman', 'Hot', 'Es/Hot Milo', 6000),
('EO11E', 'Minuman', 'Es', 'Es/Hot Capucino', 6000),
('EO11H', 'Minuman', 'Hot', 'Es/Hot Capucino', 6000),
('EO12E', 'Minuman', 'Es', 'Es/Hot Chocolate', 6000),
('EO12H', 'Minuman', 'Hot', 'Es/Hot Chocolate', 6000),
('EO13E', 'Minuman', 'Es', 'Es/Hot Teh', 4000),
('EO13H', 'Minuman', 'Hot', 'Es/Hot Teh', 4000),
('EO14E', 'Minuman', 'Es', 'Es/Hot Jeruk', 5000),
('EO14H', 'Minuman', 'Hot', 'Es/Hot Jeruk', 5000),
('EO15', 'Minuman', 'Es', 'Es Sirup', 5000),
('EO16', 'Minuman', 'Es', 'Es Saparela', 12000),
('EO17', 'Minuman', 'Es', 'Es Soda Gembira', 12000),
('EO18', 'Minuman', 'Es', 'Kopi Hitam', 5000),
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

--
-- Dumping data for table `product_order`
--

INSERT INTO `product_order` (`Kode_produk_order`, `Kode_Produk`, `Kode_Order`, `Jumlah_Produk_PO`) VALUES
(39, 'MA1G', '1s34f4', 1),
(40, 'BK1H', 'ssdb5a', 3),
(41, 'BK2H', 'ss3b5r', 3),
(47, 'BK1U', '34fg34', 3),
(48, 'BK1U', '3t3c45', 3),
(49, 'BK1U', 'k6yk6g', 3),
(50, 'BK1U', 'k24zd4', 3),
(51, 'BK1U', '4fcbdf', 3),
(63, 'MA1K', '23glra', 1),
(64, 'MA1G', '23glra', 1),
(65, 'MA2K', '86b9oi', 2),
(68, 'MA3G', '9rvjle', 1),
(70, 'MA1K', '1z6t5b', 1),
(71, 'EO14H', 'tcslfu', 1),
(72, 'MA1G', 'ifg12n', 1),
(73, 'EO11H', '3tkse4', 1),
(74, 'EO12H', '52xxw7', 2),
(76, 'MA2K', 'pymbp1', 1),
(77, 'EJ1', 'ktayrj', 1),
(78, 'MA3K', '0q3bxy', 1),
(79, 'MA1K', '2nduqw', 1),
(80, 'ED1', '4eqq22', 1),
(81, 'ED2', 'yelxwp', 1),
(82, 'MA1G', '2kkkg3', 2),
(83, 'MA1K', 'ow5f14', 2),
(84, 'MA2G', 'gmoxw1', 2),
(85, 'MA3K', '89yuhf', 2),
(86, 'MA1G', 'krbdu5', 2),
(87, 'MA1K', 'lnwlgn', 1),
(88, 'EO2', 'r10cw6', 1),
(89, 'BB2P', '2rmgcm', 2),
(90, 'MA1K', 'p8rr6p', 2),
(91, 'MA1G', 't72th3', 4),
(92, 'MA1G', 'c5plbc', 2),
(93, 'MA1K', 't30kyf', 1),
(95, 'MA1K', 'n8acxt', 1),
(96, 'MA2K', 'h1e5oz', 2),
(97, 'MA2K', '8lhrkg', 1),
(98, 'MA2G', 'z85tid', 2),
(99, 'MA1K', 'i3mjcy', 1),
(100, 'MA2K', 'vryeso', 1),
(101, 'JJ1', 'rq5q22', 2),
(102, 'MA1K', 'mkwmj7', 1),
(103, 'MA1K', 'asvdop', 1),
(104, 'MA1K', '62bqxn', 2),
(105, 'MA2K', 'bplsmf', 1),
(106, 'MA2K', 'xntsl5', 1),
(107, 'MA1K', 'v94fad', 1),
(108, 'MA1K', 'l76exd', 1),
(109, 'MA1K', '04b0h2', 2),
(110, 'MA1K', 'rea0uh', 1),
(111, 'MA2K', '5s9dfp', 2),
(112, 'MA1K', 'mee924', 2),
(113, 'MA1K', 'nithnh', 2),
(114, 'MA1K', '0i78j8', 1),
(115, 'EO1', 'txvknp', 2),
(116, 'MA1K', 'a9dib0', 2),
(117, 'EO1', '6yg4pt', 2),
(118, 'JJ1', 'p0q76m', 1),
(119, 'MA1G', 'fnpsuo', 2),
(120, 'MA1G', 'fyyxth', 2),
(121, 'MA1K', '9l3ayi', 2),
(122, 'MA1K', 'pma8wy', 2),
(123, 'MA1K', 'h0k6eq', 2),
(124, 'MA1K', '9awt93', 2),
(125, 'MA1K', '1rjzn8', 2),
(126, 'MA3K', 'nnd086', 2),
(127, 'MA1K', 'avyisk', 2),
(128, 'MA2K', 'hv07bp', 1),
(129, 'MA1K', '2q5h4w', 3),
(130, 'MA1K', 'mqxksa', 2),
(131, 'MA1K', 'ro1eyx', 2),
(132, 'BK1C', '3ofie7', 1),
(133, 'MA3K', '5x2azu', 3),
(134, 'ST1', 'etent3', 2),
(135, 'MA3K', 'rl2sgs', 2),
(136, 'MA1K', '56njv4', 6),
(137, 'MA1K', 'ibjapy', 2),
(138, 'MA1K', '2jilkq', 2),
(139, 'MA1K', 'zcfc61', 2),
(140, 'EO1', '8yps05', 2),
(141, 'MA1G', 'gcca3v', 2),
(142, 'MA1K', 'o4net3', 1),
(143, 'MA2K', '1hc187', 2),
(144, 'JJ2', 'b2iavr', 2),
(145, 'EO1', '5asxq6', 2),
(146, 'MA2K', '3xyipf', 2),
(147, 'MA1K', '5rp326', 1),
(148, 'BK1U', 'bhnfuz', 1),
(149, 'MA1K', 'tfmy1w', 2),
(150, 'BK1U', 'kwbmag', 2),
(151, 'MA1K', '8jj68q', 1),
(152, 'EO1', '8scc3s', 2),
(153, 'MA1K', '2yqv4v', 2),
(154, 'EO2', 'c6jpvx', 3),
(155, 'MA1K', 'uinir2', 2),
(156, 'MA1G', '7qt5l0', 2),
(157, 'EO1', 'x1ul36', 2),
(158, 'JJ1', '04vrms', 2),
(159, 'MA1G', '6ozzxe', 2),
(160, 'MA1K', 'irlf90', 2),
(161, 'EO1', 'mj4we7', 2),
(162, 'MA1K', 'qcbwmo', 2),
(163, 'MA3K', 'iy0tek', 3),
(164, 'EO1', '660vxw', 2),
(165, 'MA3K', '7fn32d', 2),
(166, 'EO1', '2eyka4', 2),
(167, 'MA3K', '6ctzng', 2),
(168, 'JJ2', 'z7zyrt', 1),
(169, 'EJ2', '9lxpa2', 2),
(170, 'MA1G', '46ya0c', 1),
(171, 'MA1K', 'kfj24x', 2),
(172, 'MA1G', 'yt6l0t', 2),
(173, 'MA1G', 'ce75n3', 1),
(174, 'MA2K', '28swbe', 2),
(175, 'EO1', 'r96xjy', 1),
(176, 'EO1', 'hs8apt', 2),
(177, 'MA1G', '46jw6x', 2),
(178, 'MA1K', '1cz23a', 1),
(179, 'BB1P', '7h12m3', 3),
(180, 'MA1K', 'th3e9d', 2),
(181, 'JJ1', 'c1zrfo', 3),
(182, 'EO1', 'dzb1bi', 2),
(183, 'MA1K', 'czhl1u', 1),
(184, 'EO1', 'd3vxxu', 4),
(185, 'MA1K', '3eziqm', 2),
(186, 'EO1', 'f9ajvz', 1),
(187, 'MA1K', '3a8025', 1),
(188, 'EO1', 'v4rup0', 1),
(189, 'EO2', 'auhc0w', 1),
(190, 'MA1K', 'amha0q', 2),
(191, 'EO1', 'bb4322', 1),
(192, 'MA1K', 'buzstu', 2),
(193, 'EO1', 'cx9cpc', 2),
(194, 'JJ1', 'o33m6p', 1),
(195, 'MA1G', 'x8qxya', 1),
(196, 'EO1', 'kpv30u', 1),
(197, 'MA1K', '4ax4n5', 1),
(198, 'MA1K', 'eb3dga', 1),
(199, 'MA1G', 'v7od40', 1),
(200, 'MA1G', 'a345sf', 3),
(201, 'MA1K', '2w8ogp', 1),
(202, 'MA1G', 'a345sf', 3),
(203, 'MA1G', 'a345sf', 3),
(204, 'MA1G', 'a345sf', 3),
(205, 'MA1G', 'a345sf', 3),
(206, 'MA1K', '1safds', 3),
(207, 'MA1K', '51wdu1', 1),
(208, 'ED1', 'p15sbd', 1),
(209, 'ED1', 'p15sbd', 1),
(210, 'MA1K', '3bkh3q', 1),
(211, 'BB2M', '8447ry', 1),
(212, 'JJ1', '62siqq', 1);

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
  `Tipe_topping` enum('Mie Ayam','Bakso','Bakso Bakar','Soto','Minuman','Jajanan','Promo') DEFAULT NULL,
  `Harga_topping` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `topping`
--

INSERT INTO `topping` (`Kode_topping`, `Nama_topping`, `Tipe_topping`, `Harga_topping`) VALUES
('BATOP1', '1 Pentol Bakso Urat/Halus', 'Bakso', 3000),
('BATOP2', '1 Pangsit Goreng/Kukus (/pcs)', 'Bakso', 1500),
('BATOP3', '1 Tahu Bakso (/pcs)', 'Bakso', 1500),
('BATOP4', 'Tetelan Sapi', 'Bakso', 7000),
('BATOP5', 'Kuah Bakso, Mie Kuning & Mie Soon', 'Bakso', 2000),
('BBTOP1', 'Extra Kuah, Mie * Soon', 'Bakso Bakar', 2000),
('BBTOP2', 'Extra Pangsit Goreng', 'Bakso Bakar', 1500),
('BBTOP3', 'Extra Tahu Bakso', 'Bakso Bakar', 1500),
('ES', 'Es', 'Minuman', 0),
('HOT', 'Hot', 'Minuman', 0),
('JJTOP', 'Jajanan', 'Jajanan', 0),
('MATOP1', 'Extra Ayam', 'Mie Ayam', 3000),
('MATOP2', 'Extra Tetelan Sapi', 'Mie Ayam', 7000),
('MATOP3', 'Cakar (2 pcs)', 'Mie Ayam', 4000),
('MATOP4', 'Kepala', 'Mie Ayam', 4000),
('MATOP5', 'Bakso Sapi', 'Mie Ayam', 3000),
('MATOP6', 'Telur Mata Sapi', 'Mie Ayam', 4000),
('MATOP7', 'Balungan Rica Ayam', 'Mie Ayam', 4000),
('MATOP8', 'Extra Sawi', 'Mie Ayam', 1000),
('MATOP9', 'Extra Acar', 'Mie Ayam', 1000),
('none', NULL, '', 0),
('PROMO', 'Promo', 'Promo', 0),
('STTOP1', 'Tetelan Sapi', 'Soto', 7000);

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
-- Dumping data for table `topping_order`
--

INSERT INTO `topping_order` (`Kode_topping_order`, `Kode_Produk_Order`, `Kode_Topping`) VALUES
(149, 39, 'MATOP1'),
(150, 39, 'MATOP3'),
(151, 39, 'MATOP4'),
(152, 39, 'MATOP8'),
(153, 40, 'BATOP1'),
(154, 40, 'BATOP3'),
(155, 40, 'BATOP5'),
(174, 47, 'BATOP1'),
(175, 47, 'BATOP3'),
(176, 47, 'BATOP5'),
(177, 48, 'BATOP1'),
(178, 48, 'BATOP3'),
(179, 48, 'BATOP5'),
(180, 49, 'BATOP1'),
(181, 49, 'BATOP3'),
(182, 49, 'BATOP5'),
(183, 50, 'BATOP1'),
(184, 50, 'BATOP3'),
(185, 50, 'BATOP5'),
(186, 51, 'BATOP1'),
(187, 51, 'BATOP3'),
(188, 51, 'BATOP5'),
(192, NULL, 'BBTOP1'),
(193, NULL, 'MATOP1'),
(194, NULL, 'MATOP2'),
(195, NULL, 'MATOP3'),
(196, NULL, 'MATOP4'),
(197, NULL, 'MATOP5'),
(198, NULL, 'MATOP6'),
(199, NULL, 'MATOP7'),
(200, NULL, 'MATOP8'),
(201, 63, 'MATOP1'),
(202, 63, 'MATOP3'),
(203, 63, 'MATOP6'),
(204, 65, 'MATOP1'),
(205, 65, 'MATOP2'),
(206, 65, 'MATOP3'),
(207, 65, 'MATOP4'),
(208, 65, 'MATOP5'),
(209, 65, 'MATOP6'),
(210, 65, 'MATOP7'),
(211, 65, 'MATOP8'),
(212, 65, 'MATOP9'),
(213, NULL, 'MATOP1'),
(214, NULL, 'MATOP4'),
(215, NULL, 'MATOP6'),
(216, NULL, 'MATOP9'),
(217, NULL, 'MATOP1'),
(218, NULL, 'MATOP4'),
(219, NULL, 'MATOP6'),
(220, 68, 'MATOP1'),
(221, 68, 'MATOP4'),
(222, 68, 'MATOP6'),
(223, 72, 'MATOP3'),
(224, 72, 'MATOP6'),
(225, 74, 'HOT'),
(226, NULL, 'MATOP2'),
(227, NULL, 'MATOP3'),
(228, NULL, 'MATOP8'),
(229, 76, 'MATOP2'),
(230, 76, 'MATOP3'),
(231, 76, 'MATOP8'),
(232, 77, 'ES'),
(233, 78, 'MATOP2'),
(234, 78, 'MATOP5'),
(235, 78, 'MATOP8'),
(236, 79, 'MATOP2'),
(237, 79, 'MATOP5'),
(238, 80, 'ES'),
(239, 81, 'ES'),
(240, 82, 'MATOP4'),
(241, 82, 'MATOP6'),
(242, 83, 'MATOP9'),
(243, 85, 'MATOP1'),
(244, 85, 'MATOP4'),
(245, 88, 'ES'),
(246, 89, 'BBTOP3'),
(247, 91, 'MATOP5'),
(248, NULL, 'ES'),
(249, 101, 'JJTOP'),
(250, 107, 'MATOP7'),
(251, 115, 'ES'),
(252, 116, 'MATOP8'),
(253, 117, 'ES'),
(254, 118, 'JJTOP'),
(255, 119, 'MATOP9'),
(256, 120, 'MATOP1'),
(257, 121, 'MATOP1'),
(258, 121, 'MATOP4'),
(259, 131, 'MATOP1'),
(260, 133, 'MATOP2'),
(261, 133, 'MATOP5'),
(262, 134, 'STTOP1'),
(263, 135, 'MATOP7'),
(264, 135, 'MATOP8'),
(265, 136, 'MATOP1'),
(266, 140, 'ES'),
(267, 142, 'MATOP1'),
(268, 144, 'JJTOP'),
(269, 145, 'ES'),
(270, 147, 'MATOP3'),
(271, 148, 'BATOP2'),
(272, 148, 'BATOP4'),
(273, 149, 'MATOP7'),
(274, 150, 'BATOP4'),
(275, 150, 'BATOP5'),
(276, 151, 'MATOP9'),
(277, 152, 'ES'),
(278, 153, 'MATOP1'),
(279, 154, 'ES'),
(280, 156, 'MATOP1'),
(281, 157, 'ES'),
(282, 158, 'JJTOP'),
(283, 161, 'ES'),
(284, 162, 'MATOP1'),
(285, 163, 'MATOP1'),
(286, 164, 'ES'),
(287, 166, 'ES'),
(288, 167, 'MATOP8'),
(289, 168, 'JJTOP'),
(290, 169, 'ES'),
(291, 171, 'MATOP9'),
(292, 172, 'MATOP5'),
(293, 174, 'MATOP1'),
(294, 175, 'ES'),
(295, 176, 'ES'),
(296, 177, 'MATOP1'),
(297, 177, 'MATOP4'),
(298, 178, 'MATOP5'),
(299, 178, 'MATOP7'),
(300, 178, 'MATOP9'),
(301, 179, 'BBTOP1'),
(302, 180, 'MATOP9'),
(303, 181, 'JJTOP'),
(304, 182, 'ES'),
(305, 183, 'MATOP3'),
(306, 184, 'ES'),
(307, 186, 'ES'),
(308, 187, 'MATOP1'),
(309, 188, 'ES'),
(310, 189, 'ES'),
(311, 191, 'ES'),
(312, 193, 'ES'),
(313, 194, 'JJTOP'),
(314, 196, 'ES'),
(315, 200, 'BATOP1'),
(316, 200, 'BATOP3'),
(317, 200, 'BATOP5'),
(318, 200, 'none'),
(319, 206, 'none'),
(320, 207, 'none'),
(321, 208, 'ES'),
(322, 208, 'none'),
(323, 208, 'ES'),
(324, 208, 'none'),
(325, 210, 'MATOP1'),
(326, 210, 'none'),
(327, 211, 'none'),
(328, 212, 'JJTOP'),
(329, 212, 'none');

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
  MODIFY `Kode_guest_order` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=230;

--
-- AUTO_INCREMENT for table `product_order`
--
ALTER TABLE `product_order`
  MODIFY `Kode_produk_order` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=213;

--
-- AUTO_INCREMENT for table `product_stock`
--
ALTER TABLE `product_stock`
  MODIFY `Kode_stok` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `topping_order`
--
ALTER TABLE `topping_order`
  MODIFY `Kode_topping_order` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=330;

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
