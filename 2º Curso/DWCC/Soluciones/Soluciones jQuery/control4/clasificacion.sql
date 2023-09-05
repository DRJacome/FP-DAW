-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-02-2020 a las 21:17:40
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clasificacion`
--
DROP DATABASE IF EXISTS `clasificacion`;
CREATE DATABASE IF NOT EXISTS `clasificacion`
DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

USE `clasificacion`; 
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `codigo` varchar(3) NOT NULL,
  `nome` varchar(40) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`codigo`, `nome`) VALUES
('1EM', '1ª Estatal Masculina'),
('ALE', 'Alevín'),
('ASO', 'ASOBAL'),
('BEN', 'Benxamín'),
('CHF', 'Cadete División de Honra Feminino'),
('CHM', 'Cadete División de Honra Masculina'),
('EHF', 'Champions League'),
('IHM', 'Infantil División de Honra Masculina'),
('IPF', 'Infantil Provincial Feminina'),
('IPM', 'Infantil Provincial Masculina'),
('VET', 'Veteranos'),
('XHF', 'Xuvenil División de Honra Feminina'),
('XHM', 'Xuvenil División de Honra Masculina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `competicion`
--

CREATE TABLE `competicion` (
  `idCompeticion` varchar(3) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL,
  `nome` varchar(40) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `competicion`
--

INSERT INTO `competicion` (`idCompeticion`, `nome`) VALUES
('AMI', 'Amigable'),
('CDP', 'Copa Deputación de Pontevedra'),
('CF', 'Copa Federación'),
('CXG', 'Copa Xunta de Galicia'),
('G4', 'Grupo 4: Pontevedra 23-27'),
('LIG', 'Liga regular'),
('PER', 'Grupo Permanencia'),
('SEC', 'Sector'),
('TIT', 'Grupo Título');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `idEquipo` smallint(2) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `idCategoria` varchar(3) NOT NULL,
  `temporada` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`idEquipo`, `nome`, `idCategoria`, `temporada`) VALUES
(1, 'A.D. CARBALLAL', 'CHF', '2013'),
(2, 'BALONMÁN PABELLÓN OURENSE', 'CHF', '2013'),
(3, 'ACALUBA', 'CHF', '2013'),
(4, 'BALONMANO PORRIÑO', 'CHF', '2013'),
(5, 'SEIS DO NADAL-COIA', 'CHF', '2013'),
(6, 'ASMUBAL MEAÑO', 'CHF', '2013'),
(7, 'Coreti LALÍN', 'CHF', '2013'),
(8, 'BUEU ATLETICO BALONMAN', 'CHF', '2013'),
(9, 'S.D. TEUCRO Pescamar', 'CHF', '2013'),
(10, 'RASOEIRO BM.', 'CHF', '2013'),
(11, 'BM. MOAÑA', 'CHF', '2013');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `orde` tinyint(2) NOT NULL,
  `nome` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `activa` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`orde`, `nome`, `activa`) VALUES
(1, 'Inicio', 1),
(2, 'Novas', 0),
(3, 'Historia', 0),
(4, 'Clasificación', 0),
(5, 'Xunta directiva', 0),
(6, 'Galería de imaxes', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nova`
--

CREATE TABLE `nova` (
  `idNova` smallint(5) NOT NULL,
  `titulo` text NOT NULL,
  `data` date NOT NULL,
  `texto` varchar(3000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `nova`
--

INSERT INTO `nova` (`idNova`, `titulo`, `data`, `texto`) VALUES
(1, 'MARC FERRÉ SUBSTITÚE A ENEKO FURUNDARENA NA LISTA DO SCANDIBÉRICO', '2019-10-22', 'A Área Técnica da Real Federación Española de Balonmán comunicou un cambio na convocatoria realizada por Javier Fernández, novo seleccionador dos Hispanos Xuvenís, de cara á primeira actividade da temporada, na que será gran protagonista o Torneo Scandibérico, a celebrar na cidade sueca de Landskrona do 25 ao 27 de octubre. Marc Ferré, lateral esquerdo do KH-7 Granollers, entra na dinámica do grupo ante a baixa de Eneko Furundarena.'),
(2, 'A XERACIÓN 2002-2003 ESTRÉASE NO SCANDIBÉRICO 2019', '2019-10-25', 'O Torneo Scandibérico 2019 será a primeira actividade para os Hispanos Xuvenís como Xeración 2002-2003, que dá o salto dende a categoría promesas para disputar esta fin de semana a súa primeira cita internacional, un torneo que servirá como test para medir o nivel deste equipo, que debuta esta mesma tarde ante Noruega ás 17:00h.'),
(3, 'OS HISPANOS XUVENÍS DEIXAN UNHA GRANDE IMAXE NO SCANDIBÉRICO 2019', '2019-10-27', 'O Torneo Scandibérico 2019 chegaba ao seu remate na xornada do domingo e facíao coa vitoria (35:26) dos Hispanos Xuvenís de Javier Fernández sobre a selección de Portugal...'),
(4, 'LISTA DOS HISPANOS XUVENÍS PARA O CAMPIONATO DO MEDITERRÁNEO 2020', '2020-02-03', 'Javier Fernández, seleccionador dos Hispanos Xuvenís, ofreceu a lista de xogadores elixidos para a disputa do Campionato do Mediterráneo de Grecia 2020 entre o 17 e o 22 de febreiro...'),
(5, 'INMELLORABLE COMEZO PARA OS HISPANOS XUVENÍS EN GRECIA', '2020-02-19', 'Os Hispanos Xuvenís comezaron da mellor forma posible a súa andadura no Campionato do Mediterráneo 2020 que se está a desputar do 17 ao 22 de febreiro en Atenas. O...'),
(7, 'OS HISPANOS XUVENÍS PASAN A SEMIFINAIS DO CAMPIONATO MEDITERRÁNEO 2020', '2020-02-20', 'Os Hispanos Xuvenís xa están en semifinais do Campionato do Mediterráneo 2020, que se está a  desputar do 17 ao 22 de febreiro en Atenas. O conxunto dirixido de maneira...'),
(8, 'OS HISPANOS XUVENÍS BORRAN DA PISTA A SERBIA E ALCANZAN A FINAL EN GRECIA', '2020-02-21', 'Vitoria de España sobre Serbia (31:21; 12:7 na primeira parte, 21:13 ao termo do segundo acto) no Pavillón OAKA que forma parte do Complexo Olímpico de Deportes de Atenas, nas...'),
(9, 'OS HISPANOS XUVENÍS SEGUEN A FACER HISTORIA PARA O BALONMÁN ESPAÑOL', '2020-02-22', 'Vitoria de España sobre Montenegro (29:32; 10:11 na primeira parte,17:19 ao termo do segundo acto) no Pavillón OAKA que forma parte do Complexo Olímpico de...');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `idPartido` smallint(6) NOT NULL,
  `idLocal` smallint(2) NOT NULL,
  `idVisitante` smallint(2) NOT NULL,
  `idCompeticion` varchar(3) NOT NULL,
  `xornada` tinyint(2) NOT NULL,
  `golesLocal` tinyint(2) NOT NULL,
  `golesVisitante` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`idPartido`, `idLocal`, `idVisitante`, `idCompeticion`, `xornada`, `golesLocal`, `golesVisitante`) VALUES
(1, 1, 2, 'LIG', 1, 18, 18),
(2, 4, 5, 'LIG', 1, 22, 27),
(3, 6, 7, 'LIG', 1, 16, 27),
(4, 8, 9, 'LIG', 1, 39, 15),
(5, 10, 11, 'LIG', 1, 15, 29),
(6, 3, 1, 'LIG', 2, 28, 25),
(7, 2, 4, 'LIG', 2, 19, 25),
(8, 5, 8, 'LIG', 2, 28, 28),
(9, 11, 6, 'LIG', 2, 19, 39),
(10, 9, 10, 'LIG', 2, 22, 23),
(11, 1, 4, 'LIG', 3, 20, 19),
(12, 3, 7, 'LIG', 3, 13, 34),
(13, 8, 2, 'LIG', 3, 36, 23),
(14, 10, 5, 'LIG', 3, 17, 41),
(15, 6, 9, 'LIG', 3, 35, 12),
(16, 7, 1, 'LIG', 4, 34, 16),
(17, 4, 8, 'LIG', 4, 24, 34),
(18, 11, 3, 'LIG', 4, 38, 16),
(19, 2, 10, 'LIG', 4, 32, 18),
(20, 5, 6, 'LIG', 4, 29, 21),
(21, 1, 8, 'LIG', 5, 13, 25),
(22, 7, 11, 'LIG', 5, 32, 15),
(23, 10, 4, 'LIG', 5, 14, 31),
(24, 3, 9, 'LIG', 5, 24, 17),
(25, 6, 2, 'LIG', 5, 26, 22),
(26, 11, 1, 'LIG', 6, 20, 16),
(27, 8, 10, 'LIG', 6, 45, 10),
(28, 9, 7, 'LIG', 6, 15, 40),
(29, 4, 6, 'LIG', 6, 20, 18),
(30, 5, 3, 'LIG', 6, 30, 5),
(31, 1, 10, 'LIG', 7, 30, 12),
(32, 11, 9, 'LIG', 7, 22, 14),
(33, 6, 8, 'LIG', 7, 33, 34),
(34, 7, 5, 'LIG', 7, 34, 33),
(35, 3, 2, 'LIG', 7, 15, 21),
(36, 9, 1, 'LIG', 8, 21, 21),
(37, 6, 10, 'LIG', 8, 31, 15),
(38, 5, 11, 'LIG', 8, 39, 15),
(39, 2, 7, 'LIG', 8, 23, 37),
(40, 4, 3, 'LIG', 8, 29, 12),
(41, 1, 6, 'LIG', 9, 17, 22),
(42, 9, 5, 'LIG', 9, 19, 30),
(43, 11, 2, 'LIG', 9, 32, 19),
(44, 3, 8, 'LIG', 9, 12, 34),
(45, 7, 4, 'LIG', 9, 25, 26),
(46, 1, 5, 'LIG', 10, 11, 38),
(47, 2, 9, 'LIG', 10, 23, 29),
(48, 10, 3, 'LIG', 10, 13, 21),
(49, 4, 11, 'LIG', 10, 39, 24),
(50, 8, 7, 'LIG', 10, 25, 24),
(51, 5, 2, 'LIG', 11, 41, 28),
(52, 3, 6, 'LIG', 11, 13, 29),
(53, 9, 4, 'LIG', 11, 22, 21),
(54, 7, 10, 'LIG', 11, 38, 9),
(55, 11, 8, 'LIG', 11, 21, 30),
(56, 2, 1, 'LIG', 12, 33, 29),
(57, 5, 4, 'LIG', 12, 28, 24),
(58, 7, 6, 'LIG', 12, 30, 27),
(59, 9, 8, 'LIG', 12, 9, 43),
(60, 11, 10, 'LIG', 12, 32, 21),
(61, 1, 3, 'LIG', 13, 17, 22),
(62, 4, 2, 'LIG', 13, 28, 27),
(63, 8, 5, 'LIG', 13, 33, 41),
(64, 6, 11, 'LIG', 13, 23, 15),
(65, 10, 9, 'LIG', 13, 24, 22),
(66, 4, 1, 'LIG', 14, 26, 18),
(67, 7, 3, 'LIG', 14, 37, 12),
(68, 2, 8, 'LIG', 14, 28, 45),
(69, 5, 10, 'LIG', 14, 10, 0),
(70, 9, 6, 'LIG', 14, 21, 31),
(71, 1, 7, 'LIG', 15, 16, 41),
(72, 8, 4, 'LIG', 15, 28, 18),
(73, 3, 11, 'LIG', 15, 23, 19),
(74, 10, 2, 'LIG', 15, 21, 26),
(75, 6, 5, 'LIG', 15, 35, 37),
(76, 8, 1, 'LIG', 16, 39, 17),
(77, 11, 7, 'LIG', 16, 14, 25),
(78, 4, 10, 'LIG', 16, 30, 19),
(79, 9, 3, 'LIG', 16, 32, 29),
(80, 2, 6, 'LIG', 16, 22, 37),
(81, 1, 11, 'LIG', 17, 19, 20),
(82, 10, 8, 'LIG', 17, 25, 36),
(83, 7, 9, 'LIG', 17, 30, 16),
(84, 6, 4, 'LIG', 17, 22, 23),
(85, 3, 5, 'LIG', 17, 19, 38),
(86, 10, 1, 'LIG', 18, 28, 31),
(87, 9, 11, 'LIG', 18, 23, 18),
(88, 8, 6, 'LIG', 18, 25, 24),
(89, 5, 7, 'LIG', 18, 20, 24),
(90, 2, 3, 'LIG', 18, 21, 21),
(91, 1, 9, 'LIG', 19, 31, 22),
(92, 10, 6, 'LIG', 19, 25, 31),
(93, 11, 5, 'LIG', 19, 19, 27),
(94, 7, 2, 'LIG', 19, 32, 21),
(95, 3, 4, 'LIG', 19, 21, 26),
(96, 6, 1, 'LIG', 20, 29, 22),
(97, 5, 9, 'LIG', 20, 43, 19),
(98, 2, 11, 'LIG', 20, 35, 29),
(99, 8, 3, 'LIG', 20, 41, 17),
(100, 4, 7, 'LIG', 20, 22, 27),
(101, 5, 1, 'LIG', 21, 36, 9),
(102, 9, 2, 'LIG', 21, 35, 32),
(103, 3, 10, 'LIG', 21, 27, 19),
(104, 11, 4, 'LIG', 21, 14, 23),
(105, 7, 8, 'LIG', 21, 33, 18),
(106, 2, 5, 'LIG', 22, 27, 48),
(107, 6, 3, 'LIG', 22, 41, 12),
(108, 4, 9, 'LIG', 22, 30, 21),
(109, 10, 7, 'LIG', 22, 17, 29),
(110, 8, 11, 'LIG', 22, 33, 18);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `competicion`
--
ALTER TABLE `competicion`
  ADD PRIMARY KEY (`idCompeticion`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`idEquipo`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`orde`);

--
-- Indices de la tabla `nova`
--
ALTER TABLE `nova`
  ADD PRIMARY KEY (`idNova`);

--
-- Indices de la tabla `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`idPartido`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `idEquipo` smallint(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=178;

--
-- AUTO_INCREMENT de la tabla `menu`
--
ALTER TABLE `menu`
  MODIFY `orde` tinyint(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `nova`
--
ALTER TABLE `nova`
  MODIFY `idNova` smallint(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `partido`
--
ALTER TABLE `partido`
  MODIFY `idPartido` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
