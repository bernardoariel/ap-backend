/* Populate tabla clientes */
INSERT INTO perfiles (id, nombre, apellido, email, mensaje, foto, pass) VALUES(null,'ariel', 'Bernardo', 'arielbernardo@hotmail.com', 'Para mi la programacion es un arte porque tiene en juego nuestra raciocinio con la creatividad','../../../assets/img/miFoto.jpg','123456');
 
INSERT INTO `educaciones` (`id`, `descripcion`, `end_date`, `imagen`, `institution`, `start_date`, `titulo`) VALUES (NULL, 'He realizado con especializacion constante.', '2009-04-01', 'https://villadelparqueinfo.com.ar/wp-content/uploads/2018/12/comercial-11-e1545597803870.jpg', 'Colegio Comercial 11', '2012-10-04', 'Bachiller'), (NULL, 'Programacion FullStack', '2014-01-01', 'https://static.educacionit.com/educacionit/assets/imagotype-it-fill-v2-color.svg', 'Educacion It', '2022-10-31', 'Programador Full Stack');
INSERT INTO `habilidades` (`id`, `descripcion`, `nombre`, `porcerntaje`) VALUES (NULL, 'backend', 'PHP', '50'), (NULL, 'frontend', 'Angular', '40'), (NULL, 'frontend', 'VUE', '35');
INSERT INTO `porfolios` (`id`, `back_url`, `demo_url`, `descripcion`, `fecha`, `front_url`, `imagen`, `nombre`) VALUES 
(NULL, 'sin backend', 'https://loquacious-kleicha-d4161b.netlify.app', 'Eliminar Actualizar ', '2022-10-01', 'https://github.com/bernardoariel/tuto-angular-abmEmpleado', 'https://parzibyte.me/blog/wp-content/uploads/2019/11/CRUD-angular-con-PHP-y-MySQL-usando-Angular-Material.png', 'Crud de empleados'), (NULL, 'no tiene', 'https://serene-melomakarona-c2bbc7.netlify.app/', 'Para divertirse un rato', '2022-10-11', 'https://github.com/bernardoariel/tuto-angular-dados.git', 'https://imagenes.elpais.com/resizer/7arxvllK2WOWsVJ92UFaerZ6uh8=/414x0/cloudfront-eu-central-1.images.arcpublishing.com/prisa/SWDH7S4GYJHGJNOMOZJVEZFUVY.jpg', 'Juga tu Suerte con Dados');
INSERT INTO `trabajos` (`id`, `descripcion`, `end_date`, `imagen`, `institution`, `start_date`, `titulo`) VALUES (NULL,  'Tareas Generales relacionadas con el analisis y la enseñanza', '2022-10-31', 'https://electro3.com.ar/images/logo-electro-3-san-juan.svg', 'Electro 3', '2021-09-01', 'Analista Funcional'), (NULL, 'Tareas Generales en programacion', '2022-10-31', 'https://www.notarfor.com.ar/BOOTSTRAP/index/img/intro-pic.jpg', 'Colegio de Escribanos de Formosa', '2014-06-01', 'Programador');