-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2021 a las 22:46:32
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `contactos_rdb`
--
CREATE DATABASE IF NOT EXISTS `contactos_rdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `contactos_rdb`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `announcement`
--

CREATE TABLE `announcement` (
  `cod_announcement` int(11) NOT NULL,
  `title` varchar(20) NOT NULL,
  `description` text NOT NULL,
  `user_cod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `announcement`
--

INSERT INTO `announcement` (`cod_announcement`, `title`, `description`, `user_cod`) VALUES
(2, 'pepeasdsad', 'asdsadsadas', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pictures_list`
--

CREATE TABLE `pictures_list` (
  `cod_picture` int(11) NOT NULL,
  `picture_path` varchar(40) NOT NULL,
  `announcement_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `cod_user` int(11) NOT NULL,
  `id_login` varchar(15) NOT NULL,
  `password` char(128) DEFAULT NULL,
  `email` varchar(320) DEFAULT NULL,
  `credit_stash` int(11) DEFAULT NULL,
  `mobile_phone` varchar(15) DEFAULT NULL,
  `land_line` varchar(15) DEFAULT NULL,
  `is_premium` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`cod_user`, `id_login`, `password`, `email`, `credit_stash`, `mobile_phone`, `land_line`, `is_premium`) VALUES
(1, 'xwebg', 'h', 'smxbk', 140, 'yeucw', 'ewtih', 0),
(2, 'wfmnx', 'k', 'jvnxh', 173, 'zdzej', 'eauxe', 1),
(3, 'jbfye', 'u', 'cdhyv', 819, 'fynkc', 'rtulw', 0),
(4, 'pundf', 'r', 'kwncp', 973, 'tgdbg', 'wlayv', 1),
(5, 'ryvnt', 'k', 'pcegr', 478, 'dycrr', 'hwwty', 1),
(6, 'boiri', 'e', 'whsmg', 596, 'ddifb', 'yfbks', 0),
(7, 'xcljb', 'q', 'rzjsi', 5, 'gjwmi', 'hhpzt', 0),
(8, 'cfria', 'v', 'pxjzs', 545, 'gywre', 'oigcq', 1),
(9, 'hdukw', 't', 'vvlbv', 37, 'rjjdm', 'wzxmk', 0),
(10, 'fuqpy', 'p', 'pdmgc', 242, 'dypem', 'gcsne', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `announcement`
--
ALTER TABLE `announcement`
  ADD PRIMARY KEY (`cod_announcement`),
  ADD KEY `FK_announcement_to_user` (`user_cod`);

--
-- Indices de la tabla `pictures_list`
--
ALTER TABLE `pictures_list`
  ADD PRIMARY KEY (`cod_picture`),
  ADD KEY `FK_picture_to_announcement` (`announcement_id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`cod_user`),
  ADD UNIQUE KEY `UC_id_login` (`id_login`),
  ADD UNIQUE KEY `UC_email` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `announcement`
--
ALTER TABLE `announcement`
  MODIFY `cod_announcement` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pictures_list`
--
ALTER TABLE `pictures_list`
  MODIFY `cod_picture` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `cod_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `announcement`
--
ALTER TABLE `announcement`
  ADD CONSTRAINT `FK_announcement_to_user` FOREIGN KEY (`user_cod`) REFERENCES `users` (`cod_user`) ON DELETE CASCADE;

--
-- Filtros para la tabla `pictures_list`
--
ALTER TABLE `pictures_list`
  ADD CONSTRAINT `FK_picture_to_announcement` FOREIGN KEY (`announcement_id`) REFERENCES `announcement` (`cod_announcement`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
