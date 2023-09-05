-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-03-2022 a las 22:10:05
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tenda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `artigos`
--

CREATE TABLE `artigos` (
  `idArtigo` int(2) NOT NULL,
  `idCategoria` int(2) NOT NULL,
  `tipo` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `nome` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `cor` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `prezo` float NOT NULL,
  `stock` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `artigos`
--

INSERT INTO `artigos` (`idArtigo`, `idCategoria`, `tipo`, `nome`, `cor`, `prezo`, `stock`) VALUES
(1, 1, 'camiseta', 'Adidas ', 'azul', 70.65, 3),
(2, 1, 'camiseta', 'Adidas ', 'verde', 120, 5),
(3, 1, 'pantalon', 'Selección ', 'vermello', 80, 6),
(4, 2, 'calcetin', '', 'vermello', 25, 36),
(5, 2, 'calcetin', '', 'azul', 20, 5),
(6, 2, 'gafas', '', 'marrón', 80, 6),
(7, 2, 'gafas', '', 'vermello', 120, 6),
(8, 2, 'botas', 'Correas', '', 230, 8),
(9, 2, 'botas', 'Cremalleira', '', 320, 6),
(10, 1, 'camiseta', '', 'pistacho', 60, 8),
(11, 1, 'camiseta', '', 'celeste', 65, 8),
(12, 1, 'pantalon', '', 'azul', 70, 5),
(13, 3, 'mochila', '', 'azul', 54, 7),
(14, 3, 'mochila', '', 'branca', 38, 3),
(15, 3, 'mochila', '', 'vermella', 45, 5),
(16, 4, 'zapatillas', 'Adidas', '', 120, 9),
(17, 2, 'cazadora', '', 'negro', 200, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carro`
--

CREATE TABLE `carro` (
  `idArtigo` int(2) NOT NULL,
  `cantidade` int(2) NOT NULL,
  `prezo` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `idCategoria` int(2) NOT NULL,
  `nome` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`idCategoria`, `nome`) VALUES
(1, 'futbol'),
(2, 'neve'),
(3, 'sendeirismo'),
(4, 'running');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `artigos`
--
ALTER TABLE `artigos`
  ADD PRIMARY KEY (`idArtigo`);

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`idCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `artigos`
--
ALTER TABLE `artigos`
  MODIFY `idArtigo` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `idCategoria` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
