-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2019 at 06:24 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `seminyakhotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `checkin`
--

CREATE TABLE `checkin` (
  `id` int(11) NOT NULL,
  `cus_name` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `cus_nic` bigint(20) NOT NULL,
  `cus_date` date NOT NULL,
  `phone` bigint(20) NOT NULL,
  `cus_country` varchar(50) NOT NULL,
  `cus_city` varchar(50) NOT NULL,
  `room_type` varchar(100) NOT NULL,
  `room_no` int(11) NOT NULL,
  `room_cost` float NOT NULL,
  `taxes` float NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `checkin`
--

INSERT INTO `checkin` (`id`, `cus_name`, `address`, `cus_nic`, `cus_date`, `phone`, `cus_country`, `cus_city`, `room_type`, `room_no`, `room_cost`, `taxes`, `total`) VALUES
(8, 'Kesha', 'Tanggerang', 356798089, '2019-04-05', 123469768, 'Indonesia', '', 'Luxury', 35, 3000000, 500000, 3500000),
(10, 'Dion', 'Cemapaka Putih', 234, '2019-04-11', 81293748957, 'Indonesia', 'DKI Jakarta', 'Luxury', 23, 7000000, 500000, 7500000),
(11, 'Maudy', 'Tanggerang', 235797, '2019-04-11', 812937489578, 'Indonesia', 'DKI Jakarta', 'Luxury', 24, 7000000, 500000, 7500000),
(12, 'bowo', 'cempaka ', 3565654, '2019-04-05', 14042, 'Indonesia  ', 'None', 'Double', 23, 134566, 555, 134566);

-- --------------------------------------------------------

--
-- Table structure for table `checkout`
--

CREATE TABLE `checkout` (
  `id` int(11) NOT NULL,
  `cus_name` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `cus_nic` bigint(20) NOT NULL,
  `cus_date` date NOT NULL,
  `out_date` date NOT NULL,
  `phone` bigint(20) NOT NULL,
  `cus_country` varchar(255) NOT NULL,
  `cus_city` varchar(255) NOT NULL,
  `room_type` varchar(100) NOT NULL,
  `room_no` int(11) NOT NULL,
  `room_cost` float NOT NULL,
  `taxes` float NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `checkout`
--

INSERT INTO `checkout` (`id`, `cus_name`, `address`, `cus_nic`, `cus_date`, `out_date`, `phone`, `cus_country`, `cus_city`, `room_type`, `room_no`, `room_cost`, `taxes`, `total`) VALUES
(2, 'khaliq', 'bekasi timur', 45, '2019-04-05', '2019-04-06', 4654654, 'Indonesia', '', 'Luxury', 654, 500000, 21000, 521000),
(3, 'zeeshan', 'depok', 677, '2019-04-01', '2019-04-02', 32468798465, '', '', 'Single', 201, 0, 30, 730),
(4, 'Zain', 'bsd', 56, '2019-03-07', '2019-03-09', 3266555, '', '', 'Single', 202, 0, 300, 1200),
(5, 'Joko', 'BSD', 6777, '2019-04-05', '2019-04-06', 81223899077, 'Indonesia', '', 'Luxury', 22, 4000000, 300000, 4300000),
(6, 'meidi', 'bekasi', 1234, '2019-04-05', '2019-04-06', 123456, 'Indonesia  ', 'None', 'Double', 2, 1250000, 500000, 1750000),
(9, 'Tono', 'Jogjakarta', 12839, '2019-04-03', '2019-04-04', 81263784946, 'Indonesia', 'DKI Jakarta', 'Luxury', 234, 7000000, 500000, 7500000),
(10, 'Tono', 'Jogjakarta', 12839, '2019-04-03', '2019-04-04', 81263784946, 'Indonesia', 'DKI Jakarta', 'Luxury', 234, 7000000, 500000, 7500000),
(11, 'Cole', 'cempaka putih', 1234567, '2019-04-10', '2019-04-11', 1404222, 'None', 'None', 'Luxury', 23, 0, 300000, 5300000),
(12, 'joko', 'tanggerang', 12344586956, '2019-04-04', '2019-04-11', 14045, 'Indonesia  ', 'None', 'Double', 2, 250000, 50000, 300000);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `idcard` bigint(20) NOT NULL,
  `phone` bigint(20) NOT NULL,
  `designation` varchar(100) NOT NULL,
  `salary` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `idcard`, `phone`, `designation`, `salary`) VALUES
(1, 'joko', 23494, 90687, 'IT', 5000000),
(2, 'meidina', 234556, 14045, 'manager', 1000000),
(3, 'budi', 234557, 1404544, 'OB', 500000),
(4, '1234', 12345, 1404777, 'security', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `expenses`
--

CREATE TABLE `expenses` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `nature` varchar(255) NOT NULL,
  `expens` double NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expenses`
--

INSERT INTO `expenses` (`id`, `name`, `nature`, `expens`, `date`) VALUES
(1, 'Khaliq ', 'AC', 10000, '2019-04-05'),
(2, 'meidina', 'listrik', 9000000, '2019-04-06'),
(3, 'Khaliq ', 'pdam', 10000, '2019-04-05'),
(4, 'kui', 'aqua galon', 160000, '2019-04-06'),
(5, '', 'aqua galon', 124555, '2019-05-03');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `status`) VALUES
(1, 'Meidina', '270598', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone` bigint(20) NOT NULL,
  `roomtype` varchar(100) NOT NULL,
  `roomno` int(11) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id`, `name`, `phone`, `roomtype`, `roomno`, `date`) VALUES
(9, 'rania', 812567777, 'Double', 23, '2019-04-02'),
(10, 'brian', 14045, 'Double', 2, '2019-04-03'),
(11, 'Selena', 1408592, 'Delux', 23, '2019-04-13'),
(12, 'pedro', 14046, 'Luxury', 45, '2019-04-06'),
(13, 'tuti', 567888, 'Family', 5, '2019-04-06'),
(14, 'justin', 14045, 'Double', 5, '2019-04-13'),
(15, 'budi', 140422, 'Luxury', 2, '2019-04-06'),
(16, 'Siska', 123456, 'Luxury', 34, '2019-04-11'),
(19, 'Budi', 21847066, 'None', 23, '2019-05-11'),
(21, 'Meidina', 2186755433, 'Double', 24, '2019-05-25'),
(22, 'Ellen', 21875749946, 'Luxury', 23, '2019-05-16');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `checkin`
--
ALTER TABLE `checkin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `checkout`
--
ALTER TABLE `checkout`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expenses`
--
ALTER TABLE `expenses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `checkin`
--
ALTER TABLE `checkin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `checkout`
--
ALTER TABLE `checkout`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `expenses`
--
ALTER TABLE `expenses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
