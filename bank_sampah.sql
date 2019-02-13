-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 12, 2019 at 04:46 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_sampah`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_log` int(11) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nasabah`
--

CREATE TABLE `nasabah` (
  `id_nas` int(11) NOT NULL,
  `kode_nas` varchar(5) NOT NULL,
  `nama_nas` varchar(30) NOT NULL,
  `alamat_nas` varchar(30) NOT NULL,
  `hp_nas` varchar(13) NOT NULL,
  `saldo_nas` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nasabah`
--

INSERT INTO `nasabah` (`id_nas`, `kode_nas`, `nama_nas`, `alamat_nas`, `hp_nas`, `saldo_nas`) VALUES
(1, '001', 'Arta', 'selat', '0863434343', 0),
(2, 'dfsdf', 'dfsdf', 'sdfsdf', '445454', 0),
(3, 'BBB', 'BBB', 'CCC', '88888', 0),
(4, 'gede ', 'gede ', 'selat', '08976777', 0),
(5, 'gede ', 'gede ', 'selat', '08598746', 0),
(6, 'gede', 'gede', 'selat', '8484545', 0),
(7, 'gede', 'gede', 'arta', '0934345', 0),
(8, 'P007', 'Wayan', 'selat', '0863434', 0),
(9, 'P008', 'dfsdf', 'dfsdf', '45454', 0),
(10, 'P004', 'Komang', 'duda', '453453', 0),
(11, 'P009', 'KOmang', 'dyda', '433454', 0),
(12, 'P010', 'I Gede Arta Wiguna Nugraha', 'selat', '089765543415', 0),
(13, '003', 'komangayu', 'seakt', '343847734', 0),
(14, 'P004', 'dfdf', 'sdede', '454545', 0),
(15, 'P006', 'Wayan Suci', 'selat Duda', '089786543', 0);

-- --------------------------------------------------------

--
-- Table structure for table `penarikan`
--

CREATE TABLE `penarikan` (
  `id_pen` int(11) NOT NULL,
  `id_nas` int(11) NOT NULL,
  `tgl_pen` date NOT NULL,
  `jumlah_pen` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_pet` int(11) NOT NULL,
  `kode_pet` varchar(5) NOT NULL,
  `nama_pet` varchar(25) NOT NULL,
  `alamat_pet` varchar(25) NOT NULL,
  `hp_pet` int(13) NOT NULL,
  `username` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rekening`
--

CREATE TABLE `rekening` (
  `id_nas` int(11) NOT NULL,
  `id_rek` int(11) NOT NULL,
  `saldo_nas` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rekening`
--

INSERT INTO `rekening` (`id_nas`, `id_rek`, `saldo_nas`) VALUES
(1, 12345, -40);

-- --------------------------------------------------------

--
-- Table structure for table `sampah`
--

CREATE TABLE `sampah` (
  `id_sam` int(11) NOT NULL,
  `Kategori` varchar(10) NOT NULL,
  `nama_sam` varchar(20) NOT NULL,
  `harga_1` int(11) NOT NULL,
  `harga_2` int(11) NOT NULL,
  `harga_peng` int(11) NOT NULL,
  `Catatan_sam` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `simpanan`
--

CREATE TABLE `simpanan` (
  `id_sim` int(11) NOT NULL,
  `tgl_sim` date NOT NULL,
  `id_nas` int(11) NOT NULL,
  `id_samp` int(11) NOT NULL,
  `qty_samp` int(11) NOT NULL,
  `total_samp` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `simpanan`
--

INSERT INTO `simpanan` (`id_sim`, `tgl_sim`, `id_nas`, `id_samp`, `qty_samp`, `total_samp`) VALUES
(1, '2019-02-14', 1, 5, 2, 40);

--
-- Triggers `simpanan`
--
DELIMITER $$
CREATE TRIGGER `menabung` AFTER INSERT ON `simpanan` FOR EACH ROW BEGIN
UPDATE rekening set saldo_nas = saldo_nas + NEW.total_samp WHERE  id_nas= NEW.id_nas;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_log`);

--
-- Indexes for table `nasabah`
--
ALTER TABLE `nasabah`
  ADD PRIMARY KEY (`id_nas`);

--
-- Indexes for table `penarikan`
--
ALTER TABLE `penarikan`
  ADD PRIMARY KEY (`id_pen`),
  ADD KEY `penarikan_ibfk_1` (`id_nas`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_pet`);

--
-- Indexes for table `rekening`
--
ALTER TABLE `rekening`
  ADD PRIMARY KEY (`id_rek`),
  ADD KEY `id_nas` (`id_nas`);

--
-- Indexes for table `sampah`
--
ALTER TABLE `sampah`
  ADD PRIMARY KEY (`id_sam`);

--
-- Indexes for table `simpanan`
--
ALTER TABLE `simpanan`
  ADD PRIMARY KEY (`id_sim`),
  ADD KEY `id_nas` (`id_nas`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `nasabah`
--
ALTER TABLE `nasabah`
  MODIFY `id_nas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `penarikan`
--
ALTER TABLE `penarikan`
  MODIFY `id_pen` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id_pet` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `rekening`
--
ALTER TABLE `rekening`
  MODIFY `id_rek` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12346;

--
-- AUTO_INCREMENT for table `sampah`
--
ALTER TABLE `sampah`
  MODIFY `id_sam` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `simpanan`
--
ALTER TABLE `simpanan`
  MODIFY `id_sim` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rekening`
--
ALTER TABLE `rekening`
  ADD CONSTRAINT `rekening_ibfk_1` FOREIGN KEY (`id_nas`) REFERENCES `nasabah` (`id_nas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
