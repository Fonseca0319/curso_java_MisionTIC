-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-08-2022 a las 19:08:39
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reto_pedidos_cinco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `documento` double NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `telefono` double DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`documento`, `nombre`, `direccion`, `telefono`, `email`) VALUES
(1.09493321, 'nicol baloco', 'barrio limonar', 2.312232, 'nicol@gmail.com'),
(121231, 'shakira', 'calle 16 # 4  españa', 44323, 'sharkira@gamil.com'),
(1226773, 'arturo calle', 'calle 16 # 4 armenia', 223433, 'arturo@gamil.com'),
(1234211, 'carlos luna', 'manizales', 334243, 'c@gmail.com'),
(7514515, 'pedro barragan', '2312311corbones', 12133, 'pedrob@gmail.com'),
(10992232, 'cristian izquierdo', '2312311', 1313422, 'ctistia@gmail.com'),
(12091292, 'ivanna fonseca gomez', 'granada', 23213, 'i@gmailcom'),
(109291121, 'evelia rosa fonseca', 'corbones', 121223, 'eve@gmail.co'),
(1094933112, 'luciana gomez', 'cr11a alamos', 23112321, 'luci@gmail.com'),
(1094933974, 'pedro fonseca', 'barrio Granada', 31233234, 'f@gmail.com'),
(1094933975, 'joha gomez', 'cr34#12-12', 312344213, 'j@gmail.com'),
(1094933976, 'kelly andrea fonseca', 'cabaña armenia calle 12', 234123, 'kell@gmail.com'),
(10949339268, 'manuel zarate', 'bogota cll1 31', 3123213, 'manuel@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `id_cuenta` int(11) NOT NULL,
  `banco` varchar(30) DEFAULT NULL,
  `saldo` float DEFAULT NULL,
  `docCliente` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`id_cuenta`, `banco`, `saldo`, `docCliente`) VALUES
(1239, 'master card bancolombia', 40000000, 1094933974),
(2344, 'visa bbva', 7000000, 10992232),
(2345, 'bbva visa', 1200, 12091292),
(3355, 'davivienda master gold', 40000000, 1094933976),
(4466, 'visa bbva', 20000000, 121231),
(9999, 'caja social visa', 20000000, 7514515),
(12788, 'master card gold banco agrario', 5000000, 109291121);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id_pedido` int(11) NOT NULL,
  `tipo_pedido` varchar(30) DEFAULT NULL,
  `documentoCliente` double DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `idCuenta` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `valor` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id_pedido`, `tipo_pedido`, `documentoCliente`, `idProducto`, `idCuenta`, `cantidad`, `valor`) VALUES
(1, 'simple', 1094933974, 7221, 1239, 1, 40000),
(2, 'simple', 109291121, 2433, 12788, 2, 120000),
(5, 'simple', 1094933974, 12453, 1239, 5, 150000),
(30, 'compuesto', 10992232, 4444, 2344, 30, 600000),
(1234, 'simple', 12091292, 12345, 2345, 2, 300000),
(2222, 'simple', 10992232, 12345, 2344, 2, 60000),
(7755, 'simple', 121231, 12345, 4466, 1, 15000),
(8888, 'simple', 7514515, 12345, 9999, 1, 15000),
(9966, 'simple', 1094933976, 5533, 3355, 2, 160000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `nombre_producto` varchar(30) DEFAULT NULL,
  `cantidad_producto` int(11) DEFAULT NULL,
  `precio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre_producto`, `cantidad_producto`, `precio`) VALUES
(2433, 'acolchado doble', 30, 60000),
(3355, 'vajilla corona', 15, 70000),
(4444, 'almohada', 40, 20000),
(5533, 'licuadora', 30, 80000),
(7221, 'cortina', 50, 40000),
(8955, 'sandwichera', 30, 45000),
(12345, 'cobija', 10, 15000),
(12453, 'sabanas', 20, 30000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`documento`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`id_cuenta`),
  ADD KEY `docCliente` (`docCliente`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `documentoCliente` (`documentoCliente`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idCuenta` (`idCuenta`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9967;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12454;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD CONSTRAINT `cuentas_ibfk_1` FOREIGN KEY (`docCliente`) REFERENCES `clientes` (`documento`);

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`documentoCliente`) REFERENCES `clientes` (`documento`),
  ADD CONSTRAINT `pedidos_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`id_producto`),
  ADD CONSTRAINT `pedidos_ibfk_3` FOREIGN KEY (`idCuenta`) REFERENCES `cuentas` (`id_cuenta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
