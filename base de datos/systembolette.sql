-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-05-2017 a las 19:49:04
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `systembolette`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `telf` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idpersona`, `nombre`, `apellido`, `telf`, `email`) VALUES
(1, 'fraiber', 'bracho', '04161542236', 'fraiber1992@gmail.com'),
(2, '', '', '--', ' --'),
(3, '', '', '--', ' --'),
(4, '', '', '--', ' --'),
(5, '', '', '--', ' --'),
(6, 'Anthony', 'Bracho', '04161542236', 'fraiberth1992 Hotmail.com'),
(7, 'dfd', 'df', '04123234', 'dfd Hotmail.com'),
(8, 'dfd', 'dfdf', '04162322', 'df Gmail.com'),
(9, 'fraiber', 'bracho', '04161542236', 'fraiberth1992 Hotmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio_rutas`
--

CREATE TABLE `precio_rutas` (
  `idprecio_rutas` int(11) NOT NULL,
  `rutas` varchar(45) NOT NULL,
  `destino` varchar(45) NOT NULL,
  `tipo_pasaje` varchar(45) NOT NULL,
  `precio` varchar(45) NOT NULL,
  `desde` varchar(10) NOT NULL,
  `hasta` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `precio_rutas`
--

INSERT INTO `precio_rutas` (`idprecio_rutas`, `rutas`, `destino`, `tipo_pasaje`, `precio`, `desde`, `hasta`) VALUES
(19, 'BARQUISIMETO', 'AP.SJ', '3ra Edad + 60', '500.0', '2017-04-19', '2017-04-21'),
(21, 'BARQUISIMETO', 'AP.SJ', 'Adultos + 26', '1000.0', '2017-04-06', '2017-04-15'),
(22, 'BARQUISIMETO', 'AP.SJ', 'Joven 12-25', '2000.0', '2017-04-06', '2017-04-15'),
(23, 'BARQUISIMETO', 'AP.SJ', 'Menores 4- 11', '3000.0', '2017-04-06', '2017-04-15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rutas`
--

CREATE TABLE `rutas` (
  `idrutas` int(11) NOT NULL,
  `origen` varchar(45) NOT NULL,
  `destino` varchar(45) NOT NULL,
  `limite` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `rutas`
--

INSERT INTO `rutas` (`idrutas`, `origen`, `destino`, `limite`) VALUES
(43, 'BARQUISIMETO', 'AP.SJ', '50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trenes`
--

CREATE TABLE `trenes` (
  `idtrenes` int(11) NOT NULL,
  `cod_tren` varchar(45) NOT NULL,
  `tiempo_salida` varchar(45) NOT NULL,
  `asientos_normal` varchar(45) NOT NULL,
  `asientos_prefe` varchar(45) NOT NULL,
  `conductores` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trenes`
--

INSERT INTO `trenes` (`idtrenes`, `cod_tren`, `tiempo_salida`, `asientos_normal`, `asientos_prefe`, `conductores`) VALUES
(19, '0001', '5:30 ', '250', '30', 'Antony');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idpersona` int(11) NOT NULL,
  `user` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `nivel` varchar(45) NOT NULL,
  `privilegio` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idpersona`, `user`, `pass`, `nivel`, `privilegio`) VALUES
(1, 'fraiber92', '051992', 'Administrador', 'Activado'),
(6, 'systemfrai', '123456', 'Usuario', 'Activado'),
(7, 'dfd', 'dfdf', 'Moderador', 'Desactivado'),
(8, 'dfd', 'dfdf', 'Moderador', 'Activado'),
(9, 'fraiber92', '051992', 'Administrador', 'Activado');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idpersona`);

--
-- Indices de la tabla `precio_rutas`
--
ALTER TABLE `precio_rutas`
  ADD PRIMARY KEY (`idprecio_rutas`);

--
-- Indices de la tabla `rutas`
--
ALTER TABLE `rutas`
  ADD PRIMARY KEY (`idrutas`);

--
-- Indices de la tabla `trenes`
--
ALTER TABLE `trenes`
  ADD PRIMARY KEY (`idtrenes`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idpersona`),
  ADD KEY `fk_usuario_persona_idx` (`idpersona`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `precio_rutas`
--
ALTER TABLE `precio_rutas`
  MODIFY `idprecio_rutas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT de la tabla `rutas`
--
ALTER TABLE `rutas`
  MODIFY `idrutas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
--
-- AUTO_INCREMENT de la tabla `trenes`
--
ALTER TABLE `trenes`
  MODIFY `idtrenes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario_persona` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
