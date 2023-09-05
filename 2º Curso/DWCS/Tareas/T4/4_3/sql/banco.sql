-- phpMyAdmin SQL Dump
-- version 3.4.11.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 05-12-2012 a las 11:18:25
-- Versión del servidor: 5.5.28
-- Versión de PHP: 5.4.6-1ubuntu1.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `banco`
--
drop database if exists banco;
create database if not exists banco;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--
USE `banco`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `dni` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `direccion` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre`, `direccion`, `telefono`) VALUES
('3534534', 'Carlos Ordóñez', 'Calle Milladoiro 5', '981 99 68 45'),
('45678', 'Pedro Mota', 'Calle Lodeiro, 123', '986 45 12 32'),
('555', 'Luis José', 'Montserrat, 10', '986 77 55 23'),
('65767', 'Pepito Luín', 'Alhaurín', '999 888 777'),
('76859', 'Ignacio', 'Calle Sagasta, 333', '986 87 65 32'),
('789654', 'Yren', 'Calle Verdana, 98', '986 77 44 225'),
('873475933', 'María Sol', 'Calle Flor, 12', '986 885544');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `dni` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `cargo` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `sueldo` double NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`dni`, `nombre`, `cargo`, `sueldo`) VALUES
('123456', 'Romualdo Fernández', 'director', 2400),
('13579', 'Saturnino Peláez', 'administrativo', 900);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;