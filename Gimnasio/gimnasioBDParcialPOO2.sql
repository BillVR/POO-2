-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2019 a las 09:13:58
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gimnasio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion`
--

CREATE TABLE `asignacion` (
  `codigo` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `clase` int(11) NOT NULL,
  `fecha_ini` date NOT NULL,
  `fecha_fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='asignación de clases a un cliente';

--
-- Volcado de datos para la tabla `asignacion`
--

INSERT INTO `asignacion` (`codigo`, `cliente`, `clase`, `fecha_ini`, `fecha_fin`) VALUES
(999, 75, 55, '2011-02-02', '2022-05-05'),
(12233, 75, 55, '2011-02-02', '2011-05-05'),
(55555, 75, 8888, '2019-06-06', '2019-05-05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase`
--

CREATE TABLE `clase` (
  `codigo` int(11) NOT NULL,
  `clase` varchar(50) NOT NULL,
  `horario` varchar(50) NOT NULL,
  `cod_instructor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='clase';

--
-- Volcado de datos para la tabla `clase`
--

INSERT INTO `clase` (`codigo`, `clase`, `horario`, `cod_instructor`) VALUES
(55, 'Bailoterapia', '7:00 pm - 8:00 pm', 7888),
(5555, 'Yoga', '6:00 am - 7:00 am', 22),
(8888, 'Entrenamiento funcional', '8:00 am - 9:00 am', 444);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cedula` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='cliente';

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `direccion`, `telefono`, `fecha`) VALUES
(75, 'L LOC ', 'NLO', 'OLN', 'NOLN', '1080-05-05'),
(157, 'llalala', 'llefle', 'llwll', 'llell', '1975-11-02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `instructor`
--

CREATE TABLE `instructor` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `especialidad` varchar(50) NOT NULL,
  `jornada` varchar(20) NOT NULL,
  `hora` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `instructor`
--

INSERT INTO `instructor` (`codigo`, `nombre`, `apellido`, `telefono`, `especialidad`, `jornada`, `hora`) VALUES
(22, 'lllllllñ', 'ññññ', '777', 'Yoga', 'Mañana', '6:00 am - 7:00 am'),
(145, 'lml', 'llo', '122185', 'Bodycombat', 'Tarde', '3:00 pm - 4:00 pm'),
(444, 'lll', 'lll', '122', 'Entrenamiento funcional', 'Mañana', '8:00 am - 9:00 am'),
(7888, 'fe', 'fg', '2222', 'Bailoterapia', 'Mañana', '7:00 pm - 8:00 pm');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `cliente` (`cliente`,`clase`),
  ADD KEY `clase` (`clase`);

--
-- Indices de la tabla `clase`
--
ALTER TABLE `clase`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `cod_instructor` (`cod_instructor`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55556;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD CONSTRAINT `asignacion_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `asignacion_ibfk_2` FOREIGN KEY (`clase`) REFERENCES `clase` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `clase`
--
ALTER TABLE `clase`
  ADD CONSTRAINT `clase_ibfk_1` FOREIGN KEY (`cod_instructor`) REFERENCES `instructor` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
