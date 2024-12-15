-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2024 at 10:15 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `food_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `img` varchar(50) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `email`, `name`, `img`, `price`) VALUES
(25, 'assas@gmail.com', 'salad', 'salad.jpg', 200),
(28, 'p@gmail.com', 'salad', 'salad.jpg', 200),
(29, 'p@gmail.com', 'PRODUCT1', '4.png', 1900),
(30, 'p1@gmail.com', 'coffee', '11.jpg', 190),
(32, 'dev@gmail.com', 'coffee', '11.jpg', 190),
(33, 'dev@gmail.com', 'salad', 'salad.jpg', 200);

-- --------------------------------------------------------

--
-- Table structure for table `delevered_orders`
--

CREATE TABLE `delevered_orders` (
  `id` int(100) NOT NULL,
  `quantity` int(100) NOT NULL,
  `total_amount` int(100) NOT NULL,
  `order_id` int(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `delevered_orders`
--

INSERT INTO `delevered_orders` (`id`, `quantity`, `total_amount`, `order_id`, `email`, `date`, `address`) VALUES
(1, 1, 1230, 530, 'ac@gmail.com', '2024-09-29', 'abc'),
(2, 1, 1230, 530, 'ac@gmail.com', '2024-09-29', 'abc');

-- --------------------------------------------------------

--
-- Table structure for table `explore_item`
--

CREATE TABLE `explore_item` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `img` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `explore_item`
--

INSERT INTO `explore_item` (`id`, `name`, `img`) VALUES
(1, 'we', 'p1.jpg.jpg'),
(2, 'salad', '10.jpg'),
(3, 'pizza', '5.jpg'),
(4, 'desert', '10.jpg'),
(5, 'icecream', '4.png'),
(6, 'roti', 'service-1.jpg'),
(7, 'rolls', 'img3.jpg'),
(8, 'bhaat', 'SB23-Website Banner-2.png'),
(9, 'burger', 'p3.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `food_items`
--

CREATE TABLE `food_items` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` int(50) NOT NULL,
  `description` varchar(300) NOT NULL,
  `explore_id` int(50) NOT NULL,
  `img` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `food_items`
--

INSERT INTO `food_items` (`id`, `name`, `price`, `description`, `explore_id`, `img`) VALUES
(2, 'tomato pizza', 1290, 'Full Of Pizza With tomato', 3, 'p1.jpg.jpg'),
(3, 'cheese pizza', 1500, 'Full of cheese', 3, 'p5.jpg'),
(4, 'new_pizze', 1230, 'add', 1, '10.jpg'),
(5, 'ddf', 123, 'sdfsf', 3, 'p5.jpg'),
(6, 'fgdfg', 232, 'dfgdg', 3, 'pasta.jpg'),
(7, 'fgdfg', 232, 'dfgdg', 3, 'eiliv-aceron-M-pEl_nv1Q0-unsplash.jpg'),
(8, 'sdfgg', 34, 'gfhfgh', 4, 'pizza-2068272_1280.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `place_order`
--

CREATE TABLE `place_order` (
  `id` int(50) NOT NULL,
  `name` varchar(122) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(122) NOT NULL,
  `zipcode` int(90) NOT NULL,
  `phone` varchar(200) NOT NULL,
  `total` int(100) NOT NULL,
  `order_id` int(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `place_order`
--

INSERT INTO `place_order` (`id`, `name`, `email`, `address`, `zipcode`, `phone`, `total`, `order_id`) VALUES
(8, 'khush', 'p1@gmail.com', 'surat', 359009, '12344455', 190, 321),
(12, 'khush', 'p1@gmail.com', 'surat', 359009, '12344455', 190, 59),
(13, 'khush', 'p1@gmail.com', 'surat', 359009, '12344455', 190, 96),
(14, 'patel dev', 'dev@gmail.com', 'surat adajan', 359009, '9234456', 390, 38),
(15, 'patel dev', 'dev@gmail.com', 'surat adajan', 359009, '9234456', 390, 758);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `id` int(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `zipcode` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`id`, `name`, `email`, `pass`, `address`, `zipcode`) VALUES
(7, 'khush', 'p1@gmail.com', '123', 'surat', 359009),
(8, 'patel dev', 'dev@gmail.com', '123', 'surat adajan', 359009);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delevered_orders`
--
ALTER TABLE `delevered_orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `explore_item`
--
ALTER TABLE `explore_item`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `food_items`
--
ALTER TABLE `food_items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `explore_id` (`explore_id`);

--
-- Indexes for table `place_order`
--
ALTER TABLE `place_order`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `delevered_orders`
--
ALTER TABLE `delevered_orders`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `explore_item`
--
ALTER TABLE `explore_item`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `food_items`
--
ALTER TABLE `food_items`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `place_order`
--
ALTER TABLE `place_order`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `food_items`
--
ALTER TABLE `food_items`
  ADD CONSTRAINT `food_items_ibfk_1` FOREIGN KEY (`explore_id`) REFERENCES `explore_item` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
