-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 21, 2025 at 08:21 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `youthify`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(200) NOT NULL,
  `u_role` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_role`, `u_status`) VALUES
(1, 'test', 'test', 'test', 'test', 'test', 'test', 'test'),
(2, 'ahak', 'sayop', 'napud', 'ako', 'nani', 'User', 'Active'),
(3, 'try', 'test', '@dihara', 'clawdue', '12345678', 'Admin', 'Active'),
(4, 'ahakassssssss', 'wahaha', 'secert', 'diharanglaaay', 'diharanglaaay', 'User', 'In-Active'),
(5, 'kani', 'hash', 'testhashing@', 'hash', 'TNXUvGSDdSKbGFzNhD/Tqg==:FnMc/c6EQb1zv+XFz3PLIo5ksIvqRHSqk7sEGkiBp3A=', 'User', 'Active'),
(6, 'tester', 'testinging', 'ohaha@gmail.com', 'balikbalik', 'ViqPRqbqzDD/QkW3IcgxJg==:YIecFpolnurZVCwYmSeH5uCkM4Dvnl6QIrqTBasWBtg=', 'User', 'Active'),
(7, 'test', 'test', 'testtest', 'testtest', 'cJMyK6lbEt5MapJ0w7swlg==:kWc3iPFus8PcLAubk6GEoTjkYQvNdqq2rbHFE7BosX4=', 'User', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
