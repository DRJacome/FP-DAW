-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-02-2022 a las 18:38:04
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
-- Base de datos: `problemas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aulas`
--

CREATE TABLE `aulas` (
  `codigo` tinyint(4) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `situacion` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `aulas`
--

INSERT INTO `aulas` (`codigo`, `nome`, `situacion`) VALUES
(1, 'Baratheon', 'Segundo Andar'),
(2, 'Lannister', 'Primeiro Andar'),
(3, 'Targaryen', 'Primeiro Andar'),
(4, 'Tyrrel', 'Segundo Andar'),
(5, 'Stark', 'Primeiro Andar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidencias`
--

CREATE TABLE `incidencias` (
  `codigo` smallint(5) UNSIGNED NOT NULL,
  `data` date NOT NULL,
  `aula` varchar(30) NOT NULL,
  `profeComunica` varchar(30) NOT NULL,
  `profeResolve` varchar(30) NOT NULL,
  `descricion` varchar(255) NOT NULL,
  `resolta` char(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `codigo` tinyint(2) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `apelidos` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `alcume` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`codigo`, `nome`, `apelidos`, `email`, `alcume`) VALUES
(1, 'Eddard', 'Stark', 'eddard@stark.gt', 'ned'),
(2, 'Daenerys', ' Targaryen', 'daenerys@targaryen.gt', 'dany'),
(3, 'Tyrion', 'Lannister', 'tyrion@lannister.gt', 'gnomo'),
(4, 'Jon', 'Nieve', 'jon@stark.gt', 'snow'),
(0, '', '', '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aulas`
--
ALTER TABLE `aulas`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `incidencias`
--
ALTER TABLE `incidencias`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aulas`
--
ALTER TABLE `aulas`
  MODIFY `codigo` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `incidencias`
--
ALTER TABLE `incidencias`
  MODIFY `codigo` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `profesores`
--
ALTER TABLE `profesores`
  MODIFY `codigo` tinyint(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
