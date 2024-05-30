-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2024 at 01:13 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbhotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `id_akun` int(5) NOT NULL,
  `username` varchar(8) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `id_reservation` int(11) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(25) NOT NULL,
  `rsv_date` date NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `room_type` varchar(15) NOT NULL,
  `adult` int(1) NOT NULL,
  `children` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id_reservation`, `first_name`, `last_name`, `email`, `phone`, `address`, `city`, `rsv_date`, `check_in`, `check_out`, `room_type`, `adult`, `children`) VALUES
(1, 'Adriati', 'Manuk Allo', 'adriatimanukallo@gmail.com', '081351831683', 'Jl. Perjuangan 1', 'Sumbawa ', '2024-05-30', '2024-05-17', '2024-05-18', 'Double', 3, 2),
(2, 'Aghnia', 'Nurhidayah', 'aghniaNurhidayah@gmail.com', '085751060050', 'Gg. Alam Segar', 'Kediri', '2024-05-30', '2024-05-23', '2024-05-18', 'Double', 1, 2),
(3, 'Navira', 'Arditha Aulia', 'naviraarditha@gmail.com', '089677565572', 'Gg. Alam Segar', 'Balikpapan', '2024-05-30', '2024-05-16', '2024-05-18', 'Double', 4, 2),
(4, 'Narupa ', 'Rangga Goroguta', 'naruparangga@gmail.com', '081354556778', 'Jl. Perjuangan 1', 'Samarinda ', '2024-05-30', '2024-05-15', '2024-05-18', 'Double', 3, 1),
(5, 'Aprisa', 'Idma Mutiara', 'aprisaidma@gmail.com', '085766778925', 'Jl. Pramuka', 'Samarinda ', '2024-05-30', '2024-05-15', '2024-05-17', 'Double', 3, 2),
(6, 'Juniver', 'Veronika Lili', 'juniverlili@gmail.com', '089965431890', 'Jl. Gelatik', 'Samarinda ', '2024-05-30', '2024-05-24', '2024-05-25', 'Double', 4, 3),
(7, 'Anna', 'Aulia Sandy', 'annaaulia@gmail.com', '081351831783', 'Jl. Perjuangan 6', 'Samarinda ', '2024-05-30', '2024-05-24', '2024-05-31', 'Suite', 3, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id_reservation`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id_reservation` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
