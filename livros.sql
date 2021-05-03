-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 03, 2021 at 05:24 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `livros`
--

-- --------------------------------------------------------

--
-- Table structure for table `coleclivros`
--

CREATE TABLE `coleclivros` (
  `idLivro` int(7) NOT NULL,
  `nomeLivro` varchar(40) NOT NULL,
  `GEN` varchar(40) NOT NULL,
  `data_compra` date DEFAULT NULL,
  `numPAG` int(5) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `buy` enum('S','N') NOT NULL,
  `autor` varchar(40) DEFAULT NULL,
  `editora` varchar(40) DEFAULT NULL,
  `dataPubli` date DEFAULT NULL,
  `rating` enum('Fraco','Nao gostei','gostei','muito bom','maravilhoso') DEFAULT NULL,
  `end_autor` varchar(40) DEFAULT NULL,
  `dataNasci` date DEFAULT NULL,
  `nacionalidade` varchar(40) DEFAULT NULL,
  `telEdit` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `coleclivros`
--

INSERT INTO `coleclivros` (`idLivro`, `nomeLivro`, `GEN`, `data_compra`, `numPAG`, `valor`, `buy`, `autor`, `editora`, `dataPubli`, `rating`, `end_autor`, `dataNasci`, `nacionalidade`, `telEdit`) VALUES
(1, 'Harry Potter e a Pedra Filosofal', 'Fantasia', '2005-02-03', 368, 20, 'S', 'J. K. Rowling', 'Rocco', '2007-02-03', 'muito bom', '3227 Fairmont Avenue', '1971-08-14', 'Inglaterra', '202-555-0171'),
(2, 'Harry Potter e o Prisioneiro de Azkaban', 'Fantasia', '2005-04-02', 598, 18.79, 'S', 'J. K. Rowling', 'Rocco', '2012-04-02', 'gostei', '3227 Fairmont Avenue', '1971-08-15', 'Inglaterra', '202-555-0171'),
(3, 'Harry Potter e a Ordem da Fênix', 'Fantasia', NULL, 798, 50, 'N', 'J. K. Rowling', 'Rocco', '2005-08-20', 'maravilhoso', '3227 Fairmont Avenue', '1971-08-16', 'Inglaterra', '202-555-0171'),
(4, 'Harry Potter e a Câmara Secreta', 'Fantasia', NULL, 328, 15, 'N', 'J. K. Rowling', 'Rocco', '2019-01-25', 'Nao gostei', '3227  Fairmont Avenue', '1971-08-17', 'Inglaterra', '202-555-0171'),
(5, 'Garota Exemplar', 'Suspense', NULL, 128, 60, 'N', 'Gillian Flynn', 'Intriseca', '2019-12-10', 'Fraco', '2103  Randall Drive', '2000-07-17', 'Estados Unidos', '202-555-0187'),
(6, 'Diálogos Impossíveis', 'Comédia', NULL, 208, 10, 'N', 'Veríssimo', 'Lero-lero', '2005-11-10', 'gostei', 'Rocky Mount, 27801', '2016-03-01', 'Brasil', '202-555-0154'),
(7, 'Arafat ', 'Suspense', '0000-00-00', 158, 17, 'S', 'Clive Baker', 'Editora Dark Sense', '2020-02-03', 'gostei', '2496 Rose Avenue', '0000-00-00', 'Estados Unidos', '202-555-0185'),
(8, 'Atenção Plena: Mindfulness', 'Ficção Científica', NULL, 122, 20, 'N', 'Ruy Ohtake', 'Instituto Tomie Ohtake', '2005-08-20', 'Nao gostei', '2710 Bobcat Drive', '2001-02-17', 'Brasil', '202-555-0185'),
(11, 'Este não é mais um livro de dieta', 'Auto-Ajuda', '0000-00-00', 988, 9, 'S', 'Rodrigo Polesso', 'Editora Gente', '2012-02-04', 'maravilhoso', '3788 Wetzel Lane', '2001-02-17', 'Brasil', '202-555-0110');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coleclivros`
--
ALTER TABLE `coleclivros`
  ADD PRIMARY KEY (`idLivro`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `coleclivros`
--
ALTER TABLE `coleclivros`
  MODIFY `idLivro` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
