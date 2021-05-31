-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 31 Bulan Mei 2021 pada 06.11
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_crud`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblmahasiswa`
--

CREATE TABLE `tblmahasiswa` (
  `id` int(11) DEFAULT NULL,
  `nim` varchar(15) DEFAULT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `jk` varchar(10) DEFAULT NULL,
  `alamat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblmahasiswa`
--

INSERT INTO `tblmahasiswa` (`id`, `nim`, `nama`, `jk`, `alamat`) VALUES
(1, 'A11201911752', 'Nova bayu', 'L', 'Semarang'),
(2, 'A11', 'Bayu', 'L', 'Kendal'),
(12, 'A11', 'bayuanang', 'P', 'semarang'),
(22, 'A11', 'Dika', 'L', 'kendal'),
(123, '1234', 'coba', 'P', 'bumi ');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
